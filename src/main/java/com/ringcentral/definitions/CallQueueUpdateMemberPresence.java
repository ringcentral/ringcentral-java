package com.ringcentral.definitions;


public class CallQueueUpdateMemberPresence
{
    /**
         */
        public CallQueueMemberId member;
  public CallQueueUpdateMemberPresence member(CallQueueMemberId member)
  {
    this.member = member;
    return this;
  }
  

        /**
         * Call queue member availability for calls of this queue
         */
        public Boolean acceptCurrentQueueCalls;
  public CallQueueUpdateMemberPresence acceptCurrentQueueCalls(Boolean acceptCurrentQueueCalls)
  {
    this.acceptCurrentQueueCalls = acceptCurrentQueueCalls;
    return this;
  }
  
}
