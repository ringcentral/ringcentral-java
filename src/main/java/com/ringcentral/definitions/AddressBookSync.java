package com.ringcentral.definitions;


public class AddressBookSync {
    /**
     *
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
     *
     */
    public Long nextPageId;
    /**
     *
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
