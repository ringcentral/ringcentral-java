package com.ringcentral.definitions;


public class TaskAssigneeInfo
{
    /**
         * Internal identifier of an assignee
         */
        public String id;
  public TaskAssigneeInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Status of the task execution by assignee
         * Enum: Pending, Completed
         */
        public String status;
  public TaskAssigneeInfo status(String status)
  {
    this.status = status;
    return this;
  }
  
}
