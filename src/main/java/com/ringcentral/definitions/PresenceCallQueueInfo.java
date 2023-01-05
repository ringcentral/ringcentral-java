package com.ringcentral.definitions;


    /**
* Call queue information
*/
public class PresenceCallQueueInfo
{
    /**
     * Internal identifier of a call queue
     */
    public String id;
    public PresenceCallQueueInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of a call queue
     */
    public String name;
    public PresenceCallQueueInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension number of a call queue
     */
    public String extensionNumber;
    public PresenceCallQueueInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Flag allow members to change their queue status
     */
    public Boolean editableMemberStatus;
    public PresenceCallQueueInfo editableMemberStatus(Boolean editableMemberStatus)
    {
        this.editableMemberStatus = editableMemberStatus;
        return this;
    }
}