package com.ringcentral.definitions;


public class FaxMessageAttachment {
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
     * Name of a file attached
     */
    public String filename;
    /**
     * Size of attachment in bytes
     */
    public Long size;

    public FaxMessageAttachment id(String id) {
        this.id = id;
        return this;
    }

    public FaxMessageAttachment uri(String uri) {
        this.uri = uri;
        return this;
    }

    public FaxMessageAttachment type(String type) {
        this.type = type;
        return this;
    }

    public FaxMessageAttachment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public FaxMessageAttachment filename(String filename) {
        this.filename = filename;
        return this;
    }

    public FaxMessageAttachment size(Long size) {
        this.size = size;
        return this;
    }
}
