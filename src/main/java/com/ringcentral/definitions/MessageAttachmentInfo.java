package com.ringcentral.definitions;


public class MessageAttachmentInfo
{
    /**
     * Internal identifier of a message attachment
     * Format: int64
     */
    public Long id;
    public MessageAttachmentInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a message attachment
     */
    public String uri;
    public MessageAttachmentInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Type of message attachment
     * Enum: AudioRecording, AudioTranscription, Text, SourceDocument, RenderedDocument, MmsAttachment
     */
    public String type;
    public MessageAttachmentInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * MIME type for a given attachment, for instance &#039;audio/wav&#039;
     */
    public String contentType;
    public MessageAttachmentInfo contentType(String contentType)
    {
        this.contentType = contentType;
        return this;
    }

    /**
     * Supported for `Voicemail` only. Duration of a voicemail in seconds
     */
    public Long vmDuration;
    public MessageAttachmentInfo vmDuration(Long vmDuration)
    {
        this.vmDuration = vmDuration;
        return this;
    }

    /**
     * Name of a file attached
     */
    public String fileName;
    public MessageAttachmentInfo fileName(String fileName)
    {
        this.fileName = fileName;
        return this;
    }

    /**
     * Size of attachment in bytes
     */
    public Long size;
    public MessageAttachmentInfo size(Long size)
    {
        this.size = size;
        return this;
    }

    /**
     * Attachment height in pixels if available
     */
    public Long height;
    public MessageAttachmentInfo height(Long height)
    {
        this.height = height;
        return this;
    }

    /**
     * Attachment width in pixels if available
     */
    public Long width;
    public MessageAttachmentInfo width(Long width)
    {
        this.width = width;
        return this;
    }
}