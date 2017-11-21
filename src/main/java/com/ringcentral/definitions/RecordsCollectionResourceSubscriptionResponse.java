package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RecordsCollectionResourceSubscriptionResponse
{
    //
    public String uri;
    public RecordsCollectionResourceSubscriptionResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public SubscriptionResponse[] records;
    public RecordsCollectionResourceSubscriptionResponse records(SubscriptionResponse[] records) {
        this.records = records;
        return this;
    }
}
