import fs from "fs";
import path from "path";
import { Field } from "ringcentral-open-api-parser/lib/types";

import { escapeJavaDoc } from "./utils";
import { parsed } from "./parser";

const outputDir = path.join(
  __dirname,
  "../../src/main/java/com/ringcentral/definitions",
);

const normalizeField = (f: Field): Field => {
  if (f.$ref) {
    f.type = f.$ref;
  } else if (f.type === "number") {
    f.type = "Double";
  } else if (f.type === "integer") {
    f.type = "Long";
  } else if (f.type === "array") {
    f.type = `${normalizeField(f.items!).type}[]`;
  } else if (f.type === "dict") {
    f.type = `java.util.Map<String, ${normalizeField(f.items!).type}>`;
  } else if (f.type === "boolean") {
    f.type = "Boolean";
  } else if (f.type === "string") {
    f.type = "String";
  } else if (f.type === "object") {
    f.type = "Object";
  }
  return f;
};

const generateField = (f: Field, modelName: string) => {
  f = normalizeField(f);
  let p = "";
  if (["public", "default", "package"].includes(f.name)) {
    p += `    @SerializedName("${f.name}")\n`;
    f.name = `_${f.name}`;
  }
  if (f.name.includes("-")) {
    p += `    @SerializedName("${f.name}")\n`;
    f.name = f.name.replace(
      /-([a-z])/g,
      (match, p1: string) => p1.toUpperCase(),
    );
  }
  if (f.name.includes(":")) {
    p += `    @SerializedName("${f.name}")\n`;
    f.name = f.name.replace(/[:.](\w)/g, "_$1");
  }
  p += `    public ${f.type} ${f.name};`;
  p += `\n    public ${modelName} ${f.name}(${f.type} ${f.name})
    {
        this.${f.name} = ${f.name};
        return this;
    }`;

  p = ` */\n${p}`;
  if (f.enum || (f.items || {}).enum) {
    p = ` * Enum: ${(f.enum || (f.items || {}).enum)!.join(", ")}\n    ${p}`;
  }
  if (f.default) {
    p = ` * Default: ${f.default}\n    ${p}`;
  }
  if (f.example) {
    p = ` * Example: ${escapeJavaDoc(f.example)}\n    ${p}`;
  }
  if (f.format) {
    p = ` * Format: ${f.format}\n    ${p}`;
  }
  if (f.minimum) {
    p = ` * Minimum: ${f.minimum}\n    ${p}`;
  }
  if (f.maximum) {
    p = ` * Maximum: ${f.maximum}\n    ${p}`;
  }
  if (f.required) {
    p = ` * Required\n    ${p}`;
  }
  if (f.description) {
    p = ` * ${
      escapeJavaDoc(f.description)!
        .trim()
        .split("\n")
        .join("\n    * ")
    }\n    ${p}`;
  }
  p = `/**\n    ${p}`;
  return p;
};

parsed.models.forEach((model) => {
  let code = `${
    model.description
      ? "\n    /**\n" +
        model.description
          .split("\n")
          .map((line) => "* " + line)
          .join("\n") +
        "\n*/"
      : ""
  }
public class ${model.name}
{
    ${model.fields.map((f) => generateField(f, model.name)).join("\n\n    ")}
}`;
  if (code.includes("@SerializedName(")) {
    code = "import com.google.gson.annotations.SerializedName;\n\n" + code;
  }
  code = "package com.ringcentral.definitions;\n\n" + code;
  fs.writeFileSync(path.join(outputDir, `${model.name}.java`), code);
});
