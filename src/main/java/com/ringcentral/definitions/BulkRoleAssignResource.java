package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BulkRoleAssignResource
{
    //
    public String uri;
    public BulkRoleAssignResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String[] addedExtensionIds;
    public BulkRoleAssignResource addedExtensionIds(String[] addedExtensionIds) {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }
    //
    public String[] removedExtensionIds;
    public BulkRoleAssignResource removedExtensionIds(String[] removedExtensionIds) {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }
}
