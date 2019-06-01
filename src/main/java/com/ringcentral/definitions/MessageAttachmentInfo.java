package com.ringcentral.definitions;


public class MessageAttachmentInfo {
    /**
     * Internal identifier of a message attachment
     */
    public String id;
    /**
     * Canonical URI of a message attachment
     */
    public String uri;
    /**
     * Type of message attachment
     * Enum: AudioRecording, AudioTranscription, Text, SourceDocument, RenderedDocument, MmsAttachment
     */
    public String type;
    /**
     * MIME type for a given attachment, for instance 'audio/wav'
     */
    public String contentType;
    /**
     * Supported for `Voicemail` only. Duration of a voicemail in seconds
     */
    public Long vmDuration;
    /**
     * Name of a file attached
     */
    public String filename;
    /**
     * Size of attachment in bytes
     */
    public Long size;

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

    public MessageAttachmentInfo filename(String filename) {
        this.filename = filename;
        return this;
    }

    public MessageAttachmentInfo size(Long size) {
        this.size = size;
        return this;
    }

}
