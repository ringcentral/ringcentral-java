package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogRecords
{
    //
    public String uri;
    public CallLogRecords uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public CallLogRecordResource[] records;
    public CallLogRecords records(CallLogRecordResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public CallLogRecords paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public CallLogRecords navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}
