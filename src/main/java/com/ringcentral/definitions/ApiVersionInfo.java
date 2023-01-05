package com.ringcentral.definitions;


public class ApiVersionInfo
{
    /**
     * Canonical URI of API version
     * Format: uri
     */
    public String uri;
    public ApiVersionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Version of the RingCentral REST API
     */
    public String versionString;
    public ApiVersionInfo versionString(String versionString)
    {
        this.versionString = versionString;
        return this;
    }

    /**
     * Release date of this version
     * Format: date-time
     */
    public String releaseDate;
    public ApiVersionInfo releaseDate(String releaseDate)
    {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * URI part determining the current version
     */
    public String uriString;
    public ApiVersionInfo uriString(String uriString)
    {
        this.uriString = uriString;
        return this;
    }
}