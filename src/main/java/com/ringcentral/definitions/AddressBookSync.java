package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AddressBookSync
{
    //
    public String uri;
    public AddressBookSync uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public PersonalContactResource[] records;
    public AddressBookSync records(PersonalContactResource[] records) {
        this.records = records;
        return this;
    }
    //
    public SyncInfo syncInfo;
    public AddressBookSync syncInfo(SyncInfo syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
    //
    public Long nextPageId;
    public AddressBookSync nextPageId(Long nextPageId) {
        this.nextPageId = nextPageId;
        return this;
    }
    //
    public String nextPageUri;
    public AddressBookSync nextPageUri(String nextPageUri) {
        this.nextPageUri = nextPageUri;
        return this;
    }
}
