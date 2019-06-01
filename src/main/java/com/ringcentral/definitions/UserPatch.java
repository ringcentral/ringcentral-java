package com.ringcentral.definitions;


public class UserPatch {
    /**
     * patch operations list
     * Required
     */
    public PatchOperation[] Operations;
    /**
     * Required
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
