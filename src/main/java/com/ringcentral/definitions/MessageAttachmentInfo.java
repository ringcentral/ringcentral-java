package com.ringcentral.definitions;


public class MessageAttachmentInfo {
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
     * MIME type for a given attachment, for instance &#039;audio/wav&#039;
     */
    public String contentType;
    /**
     * Supported for `Voicemail` only. Duration of a voicemail in seconds
     */
    public Long vmDuration;
    /**
     * Name of a file attached
     */
    public String fileName;
    /**
     * Size of attachment in bytes
     */
    public Long size;
    /**
     * Attachment height in pixels if available
     */
    public Long height;
    /**
     * Attachment width in pixels if available
     */
    public Long width;

    public MessageAttachmentInfo id(Long id) {
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

    public MessageAttachmentInfo fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public MessageAttachmentInfo size(Long size) {
        this.size = size;
        return this;
    }

    public MessageAttachmentInfo height(Long height) {
        this.height = height;
        return this;
    }

    public MessageAttachmentInfo width(Long width) {
        this.width = width;
        return this;
    }
}
