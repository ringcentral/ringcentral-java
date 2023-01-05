package com.ringcentral.definitions;


public class GetTimezoneInfoResponse
{
    /**
     * Internal identifier of a timezone
     */
    public String id;
    public GetTimezoneInfoResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a timezone
     * Format: uri
     */
    public String uri;
    public GetTimezoneInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Short name of a timezone
     */
    public String name;
    public GetTimezoneInfoResponse name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Description of a timezone
     */
    public String description;
    public GetTimezoneInfoResponse description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public String bias;
    public GetTimezoneInfoResponse bias(String bias)
    {
        this.bias = bias;
        return this;
    }
}