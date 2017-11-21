package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BulkProvisionUnassignedExtensionsResponseResource
{
    //
    public ExtensionAssignmentResult[] items;
    public BulkProvisionUnassignedExtensionsResponseResource items(ExtensionAssignmentResult[] items) {
        this.items = items;
        return this;
    }
}
