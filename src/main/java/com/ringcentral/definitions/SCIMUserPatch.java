package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SCIMUserPatch
{
    // patch operations list
    public PatchOperationInfo[] Operations;
    public SCIMUserPatch Operations(PatchOperationInfo[] Operations) {
        this.Operations = Operations;
        return this;
    }
    //
    public String[] schemas;
    public SCIMUserPatch schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
}
