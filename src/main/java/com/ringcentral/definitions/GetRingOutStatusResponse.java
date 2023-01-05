package com.ringcentral.definitions;


public class GetRingOutStatusResponse
{
    /**
     * Internal identifier of a RingOut call
     */
    public String id;
    public GetRingOutStatusResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String uri;
    public GetRingOutStatusResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public RingOutStatusInfo status;
    public GetRingOutStatusResponse status(RingOutStatusInfo status)
    {
        this.status = status;
        return this;
    }
}