package com.ringcentral.definitions;


public class CallQueueUpdateMemberPresence {
    /**
     * Call queue member information
     */
    public CallQueueMemberId member;
    /**
     * Call queue member availability for calls of this queue
     */
    public Boolean acceptCurrentQueueCalls;

    public CallQueueUpdateMemberPresence member(CallQueueMemberId member) {
        this.member = member;
        return this;
    }

    public CallQueueUpdateMemberPresence acceptCurrentQueueCalls(Boolean acceptCurrentQueueCalls) {
        this.acceptCurrentQueueCalls = acceptCurrentQueueCalls;
        return this;
    }

}
