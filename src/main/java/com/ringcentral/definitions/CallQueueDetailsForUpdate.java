package com.ringcentral.definitions;

public class CallQueueDetailsForUpdate {
    /** Extension number of a call queue */
    public String extensionNumber;

    public CallQueueDetailsForUpdate extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** Name of a call queue */
    public String name;

    public CallQueueDetailsForUpdate name(String name) {
        this.name = name;
        return this;
    }

    /** Group extension status Enum: Enabled, Disabled, NotActivated, Unassigned */
    public String status;

    public CallQueueDetailsForUpdate status(String status) {
        this.status = status;
        return this;
    }

    /** Indicates whether it is an emergency call queue extension or not Enum: Emergency, Unknown */
    public String subType;

    public CallQueueDetailsForUpdate subType(String subType) {
        this.subType = subType;
        return this;
    }

    /** */
    public SiteReference site;

    public CallQueueDetailsForUpdate site(SiteReference site) {
        this.site = site;
        return this;
    }

    /** */
    public CallQueueServiceLevelSettings serviceLevelSettings;

    public CallQueueDetailsForUpdate serviceLevelSettings(
            CallQueueServiceLevelSettings serviceLevelSettings) {
        this.serviceLevelSettings = serviceLevelSettings;
        return this;
    }

    /** Allows members to change their queue status */
    public Boolean editableMemberStatus;

    public CallQueueDetailsForUpdate editableMemberStatus(Boolean editableMemberStatus) {
        this.editableMemberStatus = editableMemberStatus;
        return this;
    }

    /**
     * Alert timer or pickup setting. Delay time in seconds before call queue group members are
     * notified when calls are queued Format: int32 Enum: 5, 10, 15, 20, 30, 45, 60, 120, 180, 240,
     * 300, 360, 420, 480, 540, 600
     */
    public Long alertTimer;

    public CallQueueDetailsForUpdate alertTimer(Long alertTimer) {
        this.alertTimer = alertTimer;
        return this;
    }
}
