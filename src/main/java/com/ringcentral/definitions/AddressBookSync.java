package com.ringcentral.definitions;


public class AddressBookSync
{
    /**
     * Format: uri
     */
    public String uri;
    public AddressBookSync uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public PersonalContactResource[] records;
    public AddressBookSync records(PersonalContactResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public SyncInfo syncInfo;
    public AddressBookSync syncInfo(SyncInfo syncInfo)
    {
        this.syncInfo = syncInfo;
        return this;
    }

    /**
     * Format: int64
     */
    public Long nextPageId;
    public AddressBookSync nextPageId(Long nextPageId)
    {
        this.nextPageId = nextPageId;
        return this;
    }

    /**
     * Format: uri
     */
    public String nextPageUri;
    public AddressBookSync nextPageUri(String nextPageUri)
    {
        this.nextPageUri = nextPageUri;
        return this;
    }
}