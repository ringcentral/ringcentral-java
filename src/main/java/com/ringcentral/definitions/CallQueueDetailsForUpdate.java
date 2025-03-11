package com.ringcentral.definitions;


public class CallQueueDetailsForUpdate {
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
     * Enum: Enabled, Disabled, NotActivated, Unassigned
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
    public SiteReference site;
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

    public CallQueueDetailsForUpdate extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallQueueDetailsForUpdate name(String name) {
        this.name = name;
        return this;
    }

    public CallQueueDetailsForUpdate status(String status) {
        this.status = status;
        return this;
    }

    public CallQueueDetailsForUpdate subType(String subType) {
        this.subType = subType;
        return this;
    }

    public CallQueueDetailsForUpdate site(SiteReference site) {
        this.site = site;
        return this;
    }

    public CallQueueDetailsForUpdate serviceLevelSettings(CallQueueServiceLevelSettings serviceLevelSettings) {
        this.serviceLevelSettings = serviceLevelSettings;
        return this;
    }

    public CallQueueDetailsForUpdate editableMemberStatus(Boolean editableMemberStatus) {
        this.editableMemberStatus = editableMemberStatus;
        return this;
    }

    public CallQueueDetailsForUpdate alertTimer(Long alertTimer) {
        this.alertTimer = alertTimer;
        return this;
    }
}
