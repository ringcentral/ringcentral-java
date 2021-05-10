package com.ringcentral.definitions;


public class UserPatch {
    /**
     * patch operations list
     * Required
     */
    public PatchOperation[] Operations;
    /**
     * Required
     * Enum: urn:ietf:params:scim:api:messages:2.0:PatchOp
     */
    public String[] schemas;

    public UserPatch Operations(PatchOperation[] Operations) {
        this.Operations = Operations;
        return this;
    }

    public UserPatch schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
}
