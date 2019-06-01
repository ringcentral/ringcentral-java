package com.ringcentral.definitions;


public class DetailedCallInfo {
    /**
     *
     */
    public String callId;
    /**
     *
     */
    public String toTag;
    /**
     *
     */
    public String fromTag;
    /**
     *
     */
    public String remoteUri;
    /**
     *
     */
    public String localUri;
    /**
     *
     */
    public String rcSessionId;

    public DetailedCallInfo callId(String callId) {
        this.callId = callId;
        return this;
    }

    public DetailedCallInfo toTag(String toTag) {
        this.toTag = toTag;
        return this;
    }

    public DetailedCallInfo fromTag(String fromTag) {
        this.fromTag = fromTag;
        return this;
    }

    public DetailedCallInfo remoteUri(String remoteUri) {
        this.remoteUri = remoteUri;
        return this;
    }

    public DetailedCallInfo localUri(String localUri) {
        this.localUri = localUri;
        return this;
    }

    public DetailedCallInfo rcSessionId(String rcSessionId) {
        this.rcSessionId = rcSessionId;
        return this;
    }

}
