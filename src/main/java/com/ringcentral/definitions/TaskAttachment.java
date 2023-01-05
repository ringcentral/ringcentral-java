package com.ringcentral.definitions;


public class TaskAttachment
{
    /**
     * File ID.
     */
    public String id;
    public TaskAttachment id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Possible value: File. Attachment type (currently, only File is possible).
     * Enum: File
     */
    public String type;
    public TaskAttachment type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Name of the attached file (incl. extension name).
     */
    public String name;
    public TaskAttachment name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * URI
     * Format: uri
     */
    public String contentUri;
    public TaskAttachment contentUri(String contentUri)
    {
        this.contentUri = contentUri;
        return this;
    }
}