package com.ringcentral.definitions;


public class MessageEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Datetime when the message was last modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String lastUpdated;
    /**
     * Message Changes
     */
    public MessageChanges[] changes;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public MessageEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public MessageEventBody lastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    public MessageEventBody changes(MessageChanges[] changes) {
        this.changes = changes;
        return this;
    }

    public MessageEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
