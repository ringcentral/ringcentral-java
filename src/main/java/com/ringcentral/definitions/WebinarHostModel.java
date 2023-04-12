package com.ringcentral.definitions;


public class WebinarHostModel {
    /**
     * Required
     */
    public HostModel host;

    public WebinarHostModel host(HostModel host) {
        this.host = host;
        return this;
    }
}
