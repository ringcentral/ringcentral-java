package com.ringcentral.definitions;


public class BulkAssignAutomaticLocationUpdatesUsers
{
    /**
         */
        public String[] enabledUserIds;
  public BulkAssignAutomaticLocationUpdatesUsers enabledUserIds(String[] enabledUserIds)
  {
    this.enabledUserIds = enabledUserIds;
    return this;
  }
  

        /**
         */
        public String[] disabledUserIds;
  public BulkAssignAutomaticLocationUpdatesUsers disabledUserIds(String[] disabledUserIds)
  {
    this.disabledUserIds = disabledUserIds;
    return this;
  }
  
}
