package com.ringcentral.definitions;


public class ScimUserPatch {
    /**
     * Patch operations list
     * Required
     */
    public ScimPatchOperation[] Operations;
    /**
     * Required
     * Enum: urn:ietf:params:scim:api:messages:2.0:PatchOp
     */
    public String[] schemas;

    public ScimUserPatch Operations(ScimPatchOperation[] Operations) {
        this.Operations = Operations;
        return this;
    }

    public ScimUserPatch schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
}
