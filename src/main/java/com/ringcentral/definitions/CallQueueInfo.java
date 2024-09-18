package com.ringcentral.definitions;


public class CallQueueInfo {
    /**
     * Link to a call queue
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a call queue
     */
    public String id;
    /**
     * Extension number of a call queue
     */
    public String extensionNumber;
    /**
     * Name of a call queue
     */
    public String name;
    /**
     * Group extension status
     * Enum: Enabled, Disabled, NotActivated
     */
    public String status;
    /**
     * Indicates whether it is an emergency call queue extension or not
     * Enum: Emergency
     */
    public String subType;
    /**
     *
     */
    public SiteBasicInfo site;

    public CallQueueInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallQueueInfo name(String name) {
        this.name = name;
        return this;
    }

    public CallQueueInfo status(String status) {
        this.status = status;
        return this;
    }

    public CallQueueInfo subType(String subType) {
        this.subType = subType;
        return this;
    }

    public CallQueueInfo site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }
}
