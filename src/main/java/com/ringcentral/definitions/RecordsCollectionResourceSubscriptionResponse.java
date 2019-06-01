package com.ringcentral.definitions;


public class RecordsCollectionResourceSubscriptionResponse {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public SubscriptionInfo[] records;

    public RecordsCollectionResourceSubscriptionResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RecordsCollectionResourceSubscriptionResponse records(SubscriptionInfo[] records) {
        this.records = records;
        return this;
    }

}
