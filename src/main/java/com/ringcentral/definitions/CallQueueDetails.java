package com.ringcentral.definitions;


public class CallQueueDetails
{
    /**
         * Internal identifier of a call queue
         */
        public String id;
  public CallQueueDetails id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Call queue name
         */
        public String name;
  public CallQueueDetails name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Call queue extension number
         */
        public String extensionNumber;
  public CallQueueDetails extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Call queue status
         * Enum: Enabled, Disabled, NotActivated
         */
        public String status;
  public CallQueueDetails status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public CallQueueServiceLevelSettings serviceLevelSettings;
  public CallQueueDetails serviceLevelSettings(CallQueueServiceLevelSettings serviceLevelSettings)
  {
    this.serviceLevelSettings = serviceLevelSettings;
    return this;
  }
  

        /**
         * Allows members to change their queue status
         */
        public Boolean editableMemberStatus;
  public CallQueueDetails editableMemberStatus(Boolean editableMemberStatus)
  {
    this.editableMemberStatus = editableMemberStatus;
    return this;
  }
  
}
