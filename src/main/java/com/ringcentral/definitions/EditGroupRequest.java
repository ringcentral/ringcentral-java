package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EditGroupRequest
{
    // List of users to be added to the team
    public String[] addedPersonIds;
    public EditGroupRequest addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }
    // List of user email addresses to be added to the team (i.e. as guests)
    public String[] addedPersonEmails;
    public EditGroupRequest addedPersonEmails(String[] addedPersonEmails) {
        this.addedPersonEmails = addedPersonEmails;
        return this;
    }
    // List of users to be removed from the team
    public String[] removedPersonIds;
    public EditGroupRequest removedPersonIds(String[] removedPersonIds) {
        this.removedPersonIds = removedPersonIds;
        return this;
    }
}
