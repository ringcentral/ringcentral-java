package com.ringcentral.definitions;


public class CallQueueDetails {
    /**
     * Internal identifier of a call queue
     */
    public String id;
    /**
     * Call queue name
     */
    public String name;
    /**
     * Call queue extension number
     */
    public String extensionNumber;
    /**
     * Call queue status
     * Enum: Enabled, Disabled, NotActivated
     */
    public String status;
    /**
     *
     */
    public CallQueueServiceLevelSettings serviceLevelSettings;
    /**
     * Allows members to change their queue status
     */
    public Boolean editableMemberStatus;

    public CallQueueDetails id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueDetails name(String name) {
        this.name = name;
        return this;
    }

    public CallQueueDetails extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallQueueDetails status(String status) {
        this.status = status;
        return this;
    }

    public CallQueueDetails serviceLevelSettings(CallQueueServiceLevelSettings serviceLevelSettings) {
        this.serviceLevelSettings = serviceLevelSettings;
        return this;
    }

    public CallQueueDetails editableMemberStatus(Boolean editableMemberStatus) {
        this.editableMemberStatus = editableMemberStatus;
        return this;
    }
}
