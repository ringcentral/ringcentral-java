package com.ringcentral.definitions;


public class CallQueueOverflowAgent {
    /**
     * Internal identifier of a Call queue extension
     */
    public String id;
    /**
     * Extension number of call queue
     */
    public String extensionNumber;
    /**
     * Name of a call queue
     */
    public String name;
    /**
     * Queue current state (Enabled/Disabled)
     * Enum: Disabled, Enabled
     */
    public String status;

    public CallQueueOverflowAgent id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueOverflowAgent extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallQueueOverflowAgent name(String name) {
        this.name = name;
        return this;
    }

    public CallQueueOverflowAgent status(String status) {
        this.status = status;
        return this;
    }
}
