package com.ringcentral.definitions;


public class CallQueueMemberPresence {
    /**
     * Call queue member information
     */
    public CallQueueMember member;
    /**
     * Private member telephony availability status applied to calls of all queues
     */
    public Boolean acceptQueueCalls;
    /**
     * Call queue member availability in this particular queue
     */
    public Boolean acceptCurrentQueueCalls;

    public CallQueueMemberPresence member(CallQueueMember member) {
        this.member = member;
        return this;
    }

    public CallQueueMemberPresence acceptQueueCalls(Boolean acceptQueueCalls) {
        this.acceptQueueCalls = acceptQueueCalls;
        return this;
    }

    public CallQueueMemberPresence acceptCurrentQueueCalls(Boolean acceptCurrentQueueCalls) {
        this.acceptCurrentQueueCalls = acceptCurrentQueueCalls;
        return this;
    }

}
