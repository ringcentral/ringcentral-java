package com.ringcentral.definitions;


/**
 * Canonical URI for the corresponding page of the list
 */
public class PresenceNavigationInfoURI {
    /**
     * Format: uri
     */
    public String uri;

    public PresenceNavigationInfoURI uri(String uri) {
        this.uri = uri;
        return this;
    }
}
