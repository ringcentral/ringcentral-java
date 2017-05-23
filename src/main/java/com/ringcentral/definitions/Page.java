package com.ringcentral.definitions;

public class Page {
    // Canonical URI for the page
    public String uri;

    public Page uri(String uri) {
        this.uri = uri;
        return this;
    }
}
