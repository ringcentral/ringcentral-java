package com.ringcentral.definitions;


public class TMWebhookList {
    /**
     *
     */
    public TMWebhookInfo[] records;

    public TMWebhookList records(TMWebhookInfo[] records) {
        this.records = records;
        return this;
    }
}
