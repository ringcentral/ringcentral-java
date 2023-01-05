package com.ringcentral.definitions;


public class TMAttachmentInfo
{
    /**
     * Internal identifier of an attachment
     */
    public String id;
    public TMAttachmentInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of an attachment
     * Enum: File, Note, Event, Card
     */
    public String type;
    public TMAttachmentInfo type(String type)
    {
        this.type = type;
        return this;
    }
}