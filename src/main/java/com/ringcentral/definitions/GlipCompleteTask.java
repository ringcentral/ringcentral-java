package com.ringcentral.definitions;


public class GlipCompleteTask
{
    /**
         * Completeness status. 'Mandatory' if `completenessCondition` is set to `Simple`, otherwise 'Optional'
         * Enum: Incomplete, Complete
         */
        public String status;
  public GlipCompleteTask status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public AssigneeInfo[] assignees;
  public GlipCompleteTask assignees(AssigneeInfo[] assignees)
  {
    this.assignees = assignees;
    return this;
  }
  

        /**
         * Current completeness percentage of a task with the 'Percentage' completeness condition. 'Mandatory' if `completenessCondition` is set to `Percentage`, otherwise 'Optional'
         * Maximum: 100
         */
        public Long completenessPercentage;
  public GlipCompleteTask completenessPercentage(Long completenessPercentage)
  {
    this.completenessPercentage = completenessPercentage;
    return this;
  }
  
}
