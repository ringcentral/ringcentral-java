package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EditParkLocationRequest
{
    // List of users that will be allowed to park/unpark calls using the specified park location
    public String[] addedUserIds;
    public EditParkLocationRequest addedUserIds(String[] addedUserIds) {
        this.addedUserIds = addedUserIds;
        return this;
    }
    // List of users that will be unallowed to park/unpark calls using the specified park location
    public String[] removedUserIds;
    public EditParkLocationRequest removedUserIds(String[] removedUserIds) {
        this.removedUserIds = removedUserIds;
        return this;
    }
}
