package com.ringcentral.definitions;


public class AccountDirectoryProfileImageResource {
    /**
     *
     */
    public String etag;
    /**
     *
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
