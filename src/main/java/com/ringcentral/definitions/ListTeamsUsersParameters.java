package com.ringcentral.definitions;

/** Query parameters for operation listTeamsUsers */
public class ListTeamsUsersParameters {
    /** List of extension IDs to filter the list of Microsoft Teams Direct Routing users */
    public String[] extensionIds;

    public ListTeamsUsersParameters extensionIds(String[] extensionIds) {
        this.extensionIds = extensionIds;
        return this;
    }
}
