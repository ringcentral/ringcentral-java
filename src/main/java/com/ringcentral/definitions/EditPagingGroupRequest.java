package com.ringcentral.definitions;


public class EditPagingGroupRequest
{
    /**
         * List of users that will be allowed to page a group specified
         */
        public String[] addedUserIds;
  public EditPagingGroupRequest addedUserIds(String[] addedUserIds)
  {
    this.addedUserIds = addedUserIds;
    return this;
  }
  

        /**
         * List of users that will be unallowed to page a group specified
         */
        public String[] removedUserIds;
  public EditPagingGroupRequest removedUserIds(String[] removedUserIds)
  {
    this.removedUserIds = removedUserIds;
    return this;
  }
  

        /**
         * List of account devices that will be assigned to a paging group specified
         */
        public String[] addedDeviceIds;
  public EditPagingGroupRequest addedDeviceIds(String[] addedDeviceIds)
  {
    this.addedDeviceIds = addedDeviceIds;
    return this;
  }
  

        /**
         * List of account devices that will be unassigned from a paging group specified
         */
        public String[] removedDeviceIds;
  public EditPagingGroupRequest removedDeviceIds(String[] removedDeviceIds)
  {
    this.removedDeviceIds = removedDeviceIds;
    return this;
  }
  
}
