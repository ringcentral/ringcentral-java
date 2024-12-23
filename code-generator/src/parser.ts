import { prepareSpec } from "ringcentral-open-api-parser";

export const parsed = prepareSpec(process.env.spec_file_path!);
