package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BulkAssignItem
{
    //
    public String departmentId;
    public BulkAssignItem departmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    //
    public String[] addedExtensionIds;
    public BulkAssignItem addedExtensionIds(String[] addedExtensionIds) {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }
    //
    public String[] removedExtensionIds;
    public BulkAssignItem removedExtensionIds(String[] removedExtensionIds) {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }
}
