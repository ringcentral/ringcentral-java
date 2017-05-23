package com.ringcentral.definitions;

public class ImageUri {
    // Link to an image.
    public String uri;

    public ImageUri uri(String uri) {
        this.uri = uri;
        return this;
    }
}
