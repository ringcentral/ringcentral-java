package com.ringcentral.definitions;


public class MessageAttachmentInfoIntId {
    /**
     * Internal identifier of a message attachment
     */
    public Long id;
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
     * Voicemail only Duration of the voicemail in seconds
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

    public MessageAttachmentInfoIntId id(Long id) {
        this.id = id;
        return this;
    }

    public MessageAttachmentInfoIntId uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MessageAttachmentInfoIntId type(String type) {
        this.type = type;
        return this;
    }

    public MessageAttachmentInfoIntId contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public MessageAttachmentInfoIntId vmDuration(Long vmDuration) {
        this.vmDuration = vmDuration;
        return this;
    }

    public MessageAttachmentInfoIntId filename(String filename) {
        this.filename = filename;
        return this;
    }

    public MessageAttachmentInfoIntId size(Long size) {
        this.size = size;
        return this;
    }

}
