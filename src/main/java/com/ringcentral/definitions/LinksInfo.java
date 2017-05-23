package com.ringcentral.definitions;

public class LinksInfo {
    // Link to start a meeting
    public String startUri;
    // Link to join a meeting
    public String joinUri;

    public LinksInfo startUri(String startUri) {
        this.startUri = startUri;
        return this;
    }

    public LinksInfo joinUri(String joinUri) {
        this.joinUri = joinUri;
        return this;
    }
}
