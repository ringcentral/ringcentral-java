package com.ringcentral.definitions;

public class SyncInfo {
    // Type of synchronization
    public String syncType;
    // Synchronization token
    public String syncToken;
    // Last synchronization datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String syncTime;

    public SyncInfo syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncInfo syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncInfo syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }
}
