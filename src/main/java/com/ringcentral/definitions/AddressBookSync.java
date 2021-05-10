package com.ringcentral.definitions;


public class AddressBookSync {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public PersonalContactResource[] records;
    /**
     *
     */
    public SyncInfo syncInfo;
    /**
     * Format: int64
     */
    public Long nextPageId;
    /**
     * Format: uri
     */
    public String nextPageUri;

    public AddressBookSync uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AddressBookSync records(PersonalContactResource[] records) {
        this.records = records;
        return this;
    }

    public AddressBookSync syncInfo(SyncInfo syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }

    public AddressBookSync nextPageId(Long nextPageId) {
        this.nextPageId = nextPageId;
        return this;
    }

    public AddressBookSync nextPageUri(String nextPageUri) {
        this.nextPageUri = nextPageUri;
        return this;
    }
}
