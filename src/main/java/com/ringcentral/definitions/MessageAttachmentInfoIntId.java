package com.ringcentral.definitions;


public class MessageAttachmentInfoIntId {
    /**
     * Internal identifier of a message attachment
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of a message attachment
     * Format: uri
     */
    public String uri;
    /**
     * Type of a message attachment
     * Enum: AudioRecording, AudioTranscription, Text, SourceDocument, RenderedDocument, MmsAttachment
     */
    public String type;
    /**
     * MIME type for a given attachment, for instance &#039;audio/wav&#039;
     */
    public String contentType;
    /**
     * Name of a file attached
     */
    public String filename;
    /**
     * Size of an attachment in bytes
     * Format: int32
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

    public MessageAttachmentInfoIntId filename(String filename) {
        this.filename = filename;
        return this;
    }

    public MessageAttachmentInfoIntId size(Long size) {
        this.size = size;
        return this;
    }
}
