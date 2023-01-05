package com.ringcentral.definitions;


    /**
* Notification payload body
*/
public class CallQueuePresenceEventBody
{
    /**
     * Agent extension ID
     */
    public String extensionId;
    public CallQueuePresenceEventBody extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Call queue extension ID
     */
    public String callQueueId;
    public CallQueuePresenceEventBody callQueueId(String callQueueId)
    {
        this.callQueueId = callQueueId;
        return this;
    }

    /**
     * Call queue agent availability for calls of this queue
     */
    public Boolean acceptCalls;
    public CallQueuePresenceEventBody acceptCalls(Boolean acceptCalls)
    {
        this.acceptCalls = acceptCalls;
        return this;
    }
}