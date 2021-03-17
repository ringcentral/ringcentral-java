package com.ringcentral.definitions;


public class CallQueuePresence
{
    /**
         */
        public CallQueueMemberPresence[] records;
  public CallQueuePresence records(CallQueueMemberPresence[] records)
  {
    this.records = records;
    return this;
  }
  
}
