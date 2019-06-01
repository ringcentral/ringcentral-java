package com.ringcentral.definitions;


public class MeetingLinks {
    /**
     *
     */
    public String startUri;
    /**
     *
     */
    public String joinUri;

    public MeetingLinks startUri(String startUri) {
        this.startUri = startUri;
        return this;
    }

    public MeetingLinks joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }

}
