package com.ringcentral.definitions;

public class SIPData {
    // Recipient data
    public String toTag;
    // Sender data
    public String fromTag;
    // Remote address URL
    public String remoteUri;
    // Local address URL
    public String localUri;

    public SIPData toTag(String toTag) {
        this.toTag = toTag;
        return this;
    }

    public SIPData fromTag(String fromTag) {
        this.fromTag = fromTag;
        return this;
    }

    public SIPData remoteUri(String remoteUri) {
        this.remoteUri = remoteUri;
        return this;
    }

    public SIPData localUri(String localUri) {
        this.localUri = localUri;
        return this;
    }
}
