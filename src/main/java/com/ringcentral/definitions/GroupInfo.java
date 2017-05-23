package com.ringcentral.definitions;

public class GroupInfo {
    // Internal identifier of a group
    public String id;
    // Canonical URI of a group
    public String uri;
    // Amount of contacts in a group
    public Long contactsCount;
    // Name of a group
    public String groupName;
    // Notes for a group
    public String notes;

    public GroupInfo id(String id) {
        this.id = id;
        return this;
    }

    public GroupInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GroupInfo contactsCount(Long contactsCount) {
        this.contactsCount = contactsCount;
        return this;
    }

    public GroupInfo groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public GroupInfo notes(String notes) {
        this.notes = notes;
        return this;
    }
}
