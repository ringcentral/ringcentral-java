package com.ringcentral.definitions;


// Query parameters for operation readExtensionCallQueuePresence
public class ReadExtensionCallQueuePresenceParameters {
    /**
     * Filtering by the flag 'Allow members to change their Queue Status'. If 'true' only queues where user can change his availability status are returned
     */
    public Boolean editableMemberStatus;

    public ReadExtensionCallQueuePresenceParameters editableMemberStatus(Boolean editableMemberStatus) {
        this.editableMemberStatus = editableMemberStatus;
        return this;
    }
}
