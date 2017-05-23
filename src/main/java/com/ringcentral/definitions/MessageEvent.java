package com.ringcentral.definitions;

public class MessageEvent {
    // Internal identifier of an extension. Optional parameter
    public Long extensionId;
    // The datetime when the message was last modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastUpdated;
    // Message changes
    public MessageChange[] changes;
}
