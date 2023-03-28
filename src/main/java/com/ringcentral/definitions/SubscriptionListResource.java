package com.ringcentral.definitions;


public class SubscriptionListResource {
    /**
     * Canonical URI of a resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * Required
     */
    public SubscriptionInfo[] records;

    public SubscriptionListResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SubscriptionListResource records(SubscriptionInfo[] records) {
        this.records = records;
        return this;
    }
}
