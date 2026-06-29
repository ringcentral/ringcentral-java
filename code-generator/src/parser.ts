import { prepareSpec } from "ringcentral-open-api-parser";

const specFilePath = process.env.spec_file_path;

if (!specFilePath) {
	throw new Error("Missing required env var: spec_file_path");
}

export const parsed = prepareSpec(specFilePath);
