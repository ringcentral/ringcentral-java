package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MessageEvent
{
    // Internal identifier of an extension
    public String extensionId;
    public MessageEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Datetime when the message was last modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastUpdated;
    public MessageEvent lastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }
    // Message Changes
    public MessageChanges[] changes;
    public MessageEvent changes(MessageChanges[] changes) {
        this.changes = changes;
        return this;
    }
}
