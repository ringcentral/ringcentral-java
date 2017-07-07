package com.ringcentral.definitions;

public class VoicemailMessageInfo {
    // Internal identifier of a voicemail message
    public String id;
    // Type of a message - 'Voicemail'
    public String type;
    // Link to a voicemail message resource
    public String uri;

    public VoicemailMessageInfo id(String id) {
        this.id = id;
        return this;
    }

    public VoicemailMessageInfo type(String type) {
        this.type = type;
        return this;
    }

    public VoicemailMessageInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
