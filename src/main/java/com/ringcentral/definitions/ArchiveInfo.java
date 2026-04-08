package com.ringcentral.definitions;


public class ArchiveInfo
{
    /**
     * Archive size in bytes
     * Format: int64
     * Example: 201412
     */
    public Long size;
    public ArchiveInfo size(Long size)
    {
        this.size = size;
        return this;
    }

    /**
     * Link for archive download
     * Format: uri
     */
    public String uri;
    public ArchiveInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}