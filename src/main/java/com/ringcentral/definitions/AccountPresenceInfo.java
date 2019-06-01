package com.ringcentral.definitions;


public class AccountPresenceInfo {
    /**
     * Canonical URI of account presence resource
     */
    public String uri;
    /**
     * List of Prompts
     */
    public GetPresenceInfo[] records;
    /**
     * Information on navigation
     */
    public PresenceNavigationInfo navigation;
    /**
     * Information on paging
     */
    public PresencePagingInfo paging;

    public AccountPresenceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountPresenceInfo records(GetPresenceInfo[] records) {
        this.records = records;
        return this;
    }

    public AccountPresenceInfo navigation(PresenceNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public AccountPresenceInfo paging(PresencePagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
