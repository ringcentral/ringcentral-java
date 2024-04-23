package com.ringcentral.definitions;


public class CallQueueDetails {
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
     * Call queue status
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
    public CallQueueServiceLevelSettings serviceLevelSettings;
    /**
     * Allows members to change their queue status
     */
    public Boolean editableMemberStatus;
    /**
     * Alert timer or pickup setting. Delay time in seconds before call queue group members are notified when calls are queued
     * Format: int32
     * Enum: 5, 10, 15, 20, 30, 45, 60, 120, 180, 240, 300, 360, 420, 480, 540, 600
     */
    public Long alertTimer;

    public CallQueueDetails uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueDetails id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueDetails extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallQueueDetails name(String name) {
        this.name = name;
        return this;
    }

    public CallQueueDetails status(String status) {
        this.status = status;
        return this;
    }

    public CallQueueDetails subType(String subType) {
        this.subType = subType;
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

    public CallQueueDetails alertTimer(Long alertTimer) {
        this.alertTimer = alertTimer;
        return this;
    }
}
