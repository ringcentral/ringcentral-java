package com.ringcentral.definitions;


public class AlertInfo {
    /**
     * Title of a message
     */
    public String title;
    /**
     * Message Description
     */
    public String body;

    public AlertInfo title(String title) {
        this.title = title;
        return this;
    }

    public AlertInfo body(String body) {
        this.body = body;
        return this;
    }

}
