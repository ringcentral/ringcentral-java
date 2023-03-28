package com.ringcentral.definitions;


/**
 * Canonical URI for the corresponding page of the list
 */
public class MessagingNavigationInfoURI {
    /**
     * Format: uri
     */
    public String uri;

    public MessagingNavigationInfoURI uri(String uri) {
        this.uri = uri;
        return this;
    }
}
