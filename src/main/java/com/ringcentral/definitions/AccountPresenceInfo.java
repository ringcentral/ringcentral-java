package com.ringcentral.definitions;


public class AccountPresenceInfo
{
    /**
     * Canonical URI of account presence resource
     * Format: uri
     */
    public String uri;
    public AccountPresenceInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of Prompts
     */
    public GetPresenceInfo[] records;
    public AccountPresenceInfo records(GetPresenceInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PresenceNavigationInfo navigation;
    public AccountPresenceInfo navigation(PresenceNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public PresencePagingInfo paging;
    public AccountPresenceInfo paging(PresencePagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}