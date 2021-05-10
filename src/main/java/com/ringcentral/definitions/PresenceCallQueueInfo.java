package com.ringcentral.definitions;


// Call queue information
public class PresenceCallQueueInfo {
    /**
     * Internal identifier of a call queue
     */
    public String id;
    /**
     * Name of a call queue
     */
    public String name;
    /**
     * Extension number of a call queue
     */
    public String extensionNumber;
    /**
     * Flag allow members to change their queue status
     */
    public Boolean editableMemberStatus;

    public PresenceCallQueueInfo id(String id) {
        this.id = id;
        return this;
    }

    public PresenceCallQueueInfo name(String name) {
        this.name = name;
        return this;
    }

    public PresenceCallQueueInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public PresenceCallQueueInfo editableMemberStatus(Boolean editableMemberStatus) {
        this.editableMemberStatus = editableMemberStatus;
        return this;
    }
}
