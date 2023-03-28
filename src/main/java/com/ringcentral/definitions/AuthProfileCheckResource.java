package com.ringcentral.definitions;


public class AuthProfileCheckResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public Boolean successful;
    /**
     *
     */
    public ActivePermissionResource details;

    public AuthProfileCheckResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AuthProfileCheckResource successful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    public AuthProfileCheckResource details(ActivePermissionResource details) {
        this.details = details;
        return this;
    }
}
