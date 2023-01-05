package com.ringcentral.definitions;


public class MessageAttachmentInfoIntId
{
    /**
     * Internal identifier of a message attachment
     * Format: int64
     */
    public Long id;
    public MessageAttachmentInfoIntId id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a message attachment
     */
    public String uri;
    public MessageAttachmentInfoIntId uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Type of message attachment
     * Enum: AudioRecording, AudioTranscription, Text, SourceDocument, RenderedDocument, MmsAttachment
     */
    public String type;
    public MessageAttachmentInfoIntId type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * MIME type for a given attachment, for instance &#039;audio/wav&#039;
     */
    public String contentType;
    public MessageAttachmentInfoIntId contentType(String contentType)
    {
        this.contentType = contentType;
        return this;
    }

    /**
     * Voicemail only Duration of the voicemail in seconds
     */
    public Long vmDuration;
    public MessageAttachmentInfoIntId vmDuration(Long vmDuration)
    {
        this.vmDuration = vmDuration;
        return this;
    }

    /**
     * Name of a file attached
     */
    public String filename;
    public MessageAttachmentInfoIntId filename(String filename)
    {
        this.filename = filename;
        return this;
    }

    /**
     * Size of attachment in bytes
     */
    public Long size;
    public MessageAttachmentInfoIntId size(Long size)
    {
        this.size = size;
        return this;
    }
}