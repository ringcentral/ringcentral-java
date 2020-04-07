package com.ringcentral.definitions;


public class CallQueueUpdateDetails {
    /**
     * Call queue service level settings
     */
    public CallQueueServiceLevelSettings serviceLevelSettings;
    /**
     * Allows members to change their queue status
     */
    public Boolean editableMemberStatus;

    public CallQueueUpdateDetails serviceLevelSettings(CallQueueServiceLevelSettings serviceLevelSettings) {
        this.serviceLevelSettings = serviceLevelSettings;
        return this;
    }

    public CallQueueUpdateDetails editableMemberStatus(Boolean editableMemberStatus) {
        this.editableMemberStatus = editableMemberStatus;
        return this;
    }

}
