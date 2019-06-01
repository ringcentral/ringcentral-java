package com.ringcentral.definitions;


public class EditGroupRequest {
    /**
     * List of users to be added to a team
     */
    public String[] addedPersonIds;
    /**
     * List of user email addresses to be added to a team (i.e. as guests)
     */
    public String[] addedPersonEmails;
    /**
     * List of users to be removed from a team
     */
    public String[] removedPersonIds;

    public EditGroupRequest addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }

    public EditGroupRequest addedPersonEmails(String[] addedPersonEmails) {
        this.addedPersonEmails = addedPersonEmails;
        return this;
    }

    public EditGroupRequest removedPersonIds(String[] removedPersonIds) {
        this.removedPersonIds = removedPersonIds;
        return this;
    }

}
