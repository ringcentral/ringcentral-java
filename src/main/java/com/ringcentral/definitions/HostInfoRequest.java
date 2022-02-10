package com.ringcentral.definitions;


/**
 * Meeting host information
 */
public class HostInfoRequest {
    /**
     * Link to the meeting host resource
     */
    public String uri;
    /**
     * Internal identifier of an extension which is assigned to be a meeting host. The default value is currently logged-in extension identifier
     */
    public String id;

    public HostInfoRequest uri(String uri) {
        this.uri = uri;
        return this;
    }

    public HostInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
