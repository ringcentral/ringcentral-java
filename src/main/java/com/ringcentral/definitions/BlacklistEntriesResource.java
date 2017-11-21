package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BlacklistEntriesResource
{
    //
    public String uri;
    public BlacklistEntriesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public BlacklistEntryResource[] records;
    public BlacklistEntriesResource records(BlacklistEntryResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public BlacklistEntriesResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public BlacklistEntriesResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
