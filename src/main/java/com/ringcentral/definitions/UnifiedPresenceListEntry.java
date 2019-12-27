package com.ringcentral.definitions;


public class UnifiedPresenceListEntry {
    /**
     * Internal identifier of the resource
     */
    public String resourceId;
    /**
     * Status code of resource retrieval
     */
    public Long status;
    /**
     *
     */
    public UnifiedPresence body;

    public UnifiedPresenceListEntry resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public UnifiedPresenceListEntry status(Long status) {
        this.status = status;
        return this;
    }

    public UnifiedPresenceListEntry body(UnifiedPresence body) {
        this.body = body;
        return this;
    }

}
