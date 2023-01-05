package com.ringcentral.definitions;


public class ScimUserPatch
{
    /**
     * Patch operations list
     * Required
     */
    public ScimPatchOperation[] Operations;
    public ScimUserPatch Operations(ScimPatchOperation[] Operations)
    {
        this.Operations = Operations;
        return this;
    }

    /**
     * Required
     * Enum: urn:ietf:params:scim:api:messages:2.0:PatchOp
     */
    public String[] schemas;
    public ScimUserPatch schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }
}