package com.ringcentral.definitions;


public class MakeRingOutRequest
{
    /**
     * Required
     */
    public MakeRingOutCallerInfoRequestFrom from;
    public MakeRingOutRequest from(MakeRingOutCallerInfoRequestFrom from)
    {
        this.from = from;
        return this;
    }

    /**
     * Required
     */
    public MakeRingOutCallerInfoRequestTo to;
    public MakeRingOutRequest to(MakeRingOutCallerInfoRequestTo to)
    {
        this.to = to;
        return this;
    }

    /**
     */
    public MakeRingOutCallerIdInfo callerId;
    public MakeRingOutRequest callerId(MakeRingOutCallerIdInfo callerId)
    {
        this.callerId = callerId;
        return this;
    }

    /**
     * Audio prompt that a calling party hears when a call
    * is connected
     */
    public Boolean playPrompt;
    public MakeRingOutRequest playPrompt(Boolean playPrompt)
    {
        this.playPrompt = playPrompt;
        return this;
    }

    /**
     */
    public MakeRingOutCountryInfo country;
    public MakeRingOutRequest country(MakeRingOutCountryInfo country)
    {
        this.country = country;
        return this;
    }
}