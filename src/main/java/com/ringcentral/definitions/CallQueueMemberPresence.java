package com.ringcentral.definitions;


public class CallQueueMemberPresence
{
    /**
     */
    public CallQueueMember member;
    public CallQueueMemberPresence member(CallQueueMember member)
    {
        this.member = member;
        return this;
    }

    /**
     * Private member telephony availability status applied to calls
    * of all queues. Please note - this parameter can be passed in request body,
    * but will be ignored
     */
    public Boolean acceptQueueCalls;
    public CallQueueMemberPresence acceptQueueCalls(Boolean acceptQueueCalls)
    {
        this.acceptQueueCalls = acceptQueueCalls;
        return this;
    }

    /**
     * Call queue member availability in this particular queue
     */
    public Boolean acceptCurrentQueueCalls;
    public CallQueueMemberPresence acceptCurrentQueueCalls(Boolean acceptCurrentQueueCalls)
    {
        this.acceptCurrentQueueCalls = acceptCurrentQueueCalls;
        return this;
    }
}