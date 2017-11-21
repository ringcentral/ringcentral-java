package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DepartmentBulkAssignResource
{
    //
    public BulkAssignItem[] items;
    public DepartmentBulkAssignResource items(BulkAssignItem[] items) {
        this.items = items;
        return this;
    }
}
