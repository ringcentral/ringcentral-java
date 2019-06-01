package com.ringcentral.definitions;


public class GlipWebhookList {
    /**
     *
     */
    public GlipWebhookInfo[] records;

    public GlipWebhookList records(GlipWebhookInfo[] records) {
        this.records = records;
        return this;
    }

}
