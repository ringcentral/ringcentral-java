package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionWithRolesCollectionResource
{
    //
    public String uri;
    public ExtensionWithRolesCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ExtensionWithRolesResource[] records;
    public ExtensionWithRolesCollectionResource records(ExtensionWithRolesResource[] records) {
        this.records = records;
        return this;
    }
}
