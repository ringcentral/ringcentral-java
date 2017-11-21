package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PermissionCategoryIdResource
{
    //
    public String uri;
    public PermissionCategoryIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public PermissionCategoryIdResource id(String id) {
        this.id = id;
        return this;
    }
}
