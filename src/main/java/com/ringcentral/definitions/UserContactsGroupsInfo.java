package com.ringcentral.definitions;


// Information on address book groups
public class UserContactsGroupsInfo {
    /**
     * Link to the list of address book groups
     */
    public String uri;

    public UserContactsGroupsInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
