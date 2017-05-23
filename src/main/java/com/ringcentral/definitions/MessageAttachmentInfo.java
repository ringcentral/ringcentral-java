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
}
