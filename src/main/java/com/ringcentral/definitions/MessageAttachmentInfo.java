package com.ringcentral.definitions;

public class MessageAttachmentInfo {
    // Internal identifier of a message attachment
    public String id;
    // Canonical URI of a message attachment
    public String uri;
    // Type of message attachment
    public String type;
    // MIME type for a given attachment, for instance 'audio/wav'
    public String contentType;
    // Voicemail only Duration of the voicemail in seconds
    public Long vmDuration;

    public MessageAttachmentInfo id(String id) {
        this.id = id;
        return this;
    }

    public MessageAttachmentInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MessageAttachmentInfo type(String type) {
        this.type = type;
        return this;
    }

    public MessageAttachmentInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public MessageAttachmentInfo vmDuration(Long vmDuration) {
        this.vmDuration = vmDuration;
        return this;
    }
}
