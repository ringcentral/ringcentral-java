package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BulkProvisionUnassignedExtensionsRequestResource
{
    //
    public BulkProvisionExtensionResource[] items;
    public BulkProvisionUnassignedExtensionsRequestResource items(BulkProvisionExtensionResource[] items) {
        this.items = items;
        return this;
    }
}
