package com.ringcentral.definitions;


/**
 * Call queue member information
 */
public class CallQueueMember {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Extension full name
     */
    public String name;
    /**
     * Extension number
     */
    public String extensionNumber;
    /**
     *
     */
    public SiteBasicInfo site;

    public CallQueueMember id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueMember name(String name) {
        this.name = name;
        return this;
    }

    public CallQueueMember extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallQueueMember site(SiteBasicInfo site) {
        this.site = site;
        return this;
    }
}
