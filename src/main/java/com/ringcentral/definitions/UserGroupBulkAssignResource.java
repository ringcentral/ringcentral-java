package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserGroupBulkAssignResource
{
    //
    public BulkAssignItem[] items;
    public UserGroupBulkAssignResource items(BulkAssignItem[] items) {
        this.items = items;
        return this;
    }
}
