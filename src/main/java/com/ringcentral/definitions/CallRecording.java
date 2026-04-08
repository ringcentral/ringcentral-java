package com.ringcentral.definitions;


public class CallRecording
{
    /**
     * Internal identifier of a call recording
     */
    public String id;
    public CallRecording id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Call recording status
     */
    public Boolean active;
    public CallRecording active(Boolean active)
    {
        this.active = active;
        return this;
    }
}