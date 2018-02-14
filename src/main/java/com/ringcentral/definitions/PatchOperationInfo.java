package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PatchOperationInfo
{
    //
    public String op;
    public PatchOperationInfo op(String op) {
        this.op = op;
        return this;
    }
    //
    public String path;
    public PatchOperationInfo path(String path) {
        this.path = path;
        return this;
    }
    // corresponding 'value' of that field specified by 'path'
    public Object value;
    public PatchOperationInfo value(Object value) {
        this.value = value;
        return this;
    }
}
