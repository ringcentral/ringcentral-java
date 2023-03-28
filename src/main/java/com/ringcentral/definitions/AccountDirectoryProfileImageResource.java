package com.ringcentral.definitions;


public class AccountDirectoryProfileImageResource {
    /**
     * Example: tag
     */
    public String etag;
    /**
     * Format: uri
     */
    public String uri;

    public AccountDirectoryProfileImageResource etag(String etag) {
        this.etag = etag;
        return this;
    }

    public AccountDirectoryProfileImageResource uri(String uri) {
        this.uri = uri;
        return this;
    }
}
