package com.ringcentral.definitions;


public class CallQueueUpdateDetails
{
    /**
         */
        public CallQueueServiceLevelSettings serviceLevelSettings;
  public CallQueueUpdateDetails serviceLevelSettings(CallQueueServiceLevelSettings serviceLevelSettings)
  {
    this.serviceLevelSettings = serviceLevelSettings;
    return this;
  }
  

        /**
         * Allows members to change their queue status
         */
        public Boolean editableMemberStatus;
  public CallQueueUpdateDetails editableMemberStatus(Boolean editableMemberStatus)
  {
    this.editableMemberStatus = editableMemberStatus;
    return this;
  }
  
}
