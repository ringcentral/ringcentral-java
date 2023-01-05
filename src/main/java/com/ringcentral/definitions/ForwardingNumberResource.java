package com.ringcentral.definitions;


public class ForwardingNumberResource
{
    /**
     * Format: uri
     */
    public String uri;
    public ForwardingNumberResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String id;
    public ForwardingNumberResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String phoneNumber;
    public ForwardingNumberResource phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     */
    public String label;
    public ForwardingNumberResource label(String label)
    {
        this.label = label;
        return this;
    }

    /**
     * Enum: CallFlip, CallForwarding
     */
    public String[] features;
    public ForwardingNumberResource features(String[] features)
    {
        this.features = features;
        return this;
    }

    /**
     */
    public String flipNumber;
    public ForwardingNumberResource flipNumber(String flipNumber)
    {
        this.flipNumber = flipNumber;
        return this;
    }

    /**
     * Forwarding phone number type
     * Enum: Home, Mobile, Work, PhoneLine, Outage, Other
     */
    public String type;
    public ForwardingNumberResource type(String type)
    {
        this.type = type;
        return this;
    }
}