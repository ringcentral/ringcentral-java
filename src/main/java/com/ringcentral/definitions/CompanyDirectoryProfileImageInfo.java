package com.ringcentral.definitions;


/**
 * Extension profile image information. Not returned if profile images are absent for an extension
 */
public class CompanyDirectoryProfileImageInfo {
    /**
     * Link to a profile image resource
     */
    public String uri;
    /**
     * Internal identifier of an image
     */
    public String etag;

    public CompanyDirectoryProfileImageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CompanyDirectoryProfileImageInfo etag(String etag) {
        this.etag = etag;
        return this;
    }
}
