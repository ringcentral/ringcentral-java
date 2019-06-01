package com.ringcentral.definitions;


public class HostInfoRequest {
    /**
     * Internal identifier of an extension which is assigned to be a meeting host. The default value is currently logged-in extension identifier
     */
    public String id;

    public HostInfoRequest id(String id) {
        this.id = id;
        return this;
    }

}
