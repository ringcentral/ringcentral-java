package com.ringcentral.definitions;


public class ProfileImageResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String etag;
    /**
     *
     */
    public String contentType;
    /**
     *
     */
    public String lastModified;
    /**
     *
     */
    public ScaledProfileImageResource[] scales;

    public ProfileImageResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ProfileImageResource etag(String etag) {
        this.etag = etag;
        return this;
    }

    public ProfileImageResource contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public ProfileImageResource lastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public ProfileImageResource scales(ScaledProfileImageResource[] scales) {
        this.scales = scales;
        return this;
    }

}
