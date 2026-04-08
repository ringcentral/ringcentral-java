package com.ringcentral.definitions;


public class AccountDirectoryProfileImageResource
{
    /**
     * Example: tag
     */
    public String etag;
    public AccountDirectoryProfileImageResource etag(String etag)
    {
        this.etag = etag;
        return this;
    }

    /**
     * Format: uri
     */
    public String uri;
    public AccountDirectoryProfileImageResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}