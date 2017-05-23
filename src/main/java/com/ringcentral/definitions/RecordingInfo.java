package com.ringcentral.definitions;

public class RecordingInfo {
    // Internal identifier of the call recording
    public String id;
    // Link to the call recording metadata resource
    public String uri;
    // Indicates recording mode used
    public String type;
    // Link to the call recording binary content
    public String contentUri;

    public RecordingInfo id(String id) {
        this.id = id;
        return this;
    }

    public RecordingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RecordingInfo type(String type) {
        this.type = type;
        return this;
    }

    public RecordingInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }
}
