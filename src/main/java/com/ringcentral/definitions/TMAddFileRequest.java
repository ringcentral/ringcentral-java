package com.ringcentral.definitions;


public class TMAddFileRequest
{
    /**
     * Internal identifier of a file
     * Required
     */
    public String id;
    public TMAddFileRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to binary content
     * Required
     * Format: uri
     */
    public String contentUri;
    public TMAddFileRequest contentUri(String contentUri)
    {
        this.contentUri = contentUri;
        return this;
    }

    /**
     * Name of a file
     */
    public String name;
    public TMAddFileRequest name(String name)
    {
        this.name = name;
        return this;
    }
}