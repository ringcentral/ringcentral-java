package com.ringcentral.definitions;


public class DetailedCallInfo
{
    /**
     */
    public String callId;
    public DetailedCallInfo callId(String callId)
    {
        this.callId = callId;
        return this;
    }

    /**
     */
    public String toTag;
    public DetailedCallInfo toTag(String toTag)
    {
        this.toTag = toTag;
        return this;
    }

    /**
     */
    public String fromTag;
    public DetailedCallInfo fromTag(String fromTag)
    {
        this.fromTag = fromTag;
        return this;
    }

    /**
     * Format: uri
     */
    public String remoteUri;
    public DetailedCallInfo remoteUri(String remoteUri)
    {
        this.remoteUri = remoteUri;
        return this;
    }

    /**
     * Format: uri
     */
    public String localUri;
    public DetailedCallInfo localUri(String localUri)
    {
        this.localUri = localUri;
        return this;
    }

    /**
     */
    public String rcSessionId;
    public DetailedCallInfo rcSessionId(String rcSessionId)
    {
        this.rcSessionId = rcSessionId;
        return this;
    }
}