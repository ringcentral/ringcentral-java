package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PermissionIdResource
{
    //
    public String uri;
    public PermissionIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public PermissionIdResource id(String id) {
        this.id = id;
        return this;
    }
}
