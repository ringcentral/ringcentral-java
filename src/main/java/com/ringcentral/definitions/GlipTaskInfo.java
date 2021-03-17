package com.ringcentral.definitions;


public class GlipTaskInfo
{
    /**
         * Internal identifier of a task
         */
        public String id;
  public GlipTaskInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Datetime of the task creation in UTC time zone.
         */
        public String creationTime;
  public GlipTaskInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Datetime of the last modification of the task in UTC time zone.
         */
        public String lastModifiedTime;
  public GlipTaskInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Type of a task
         * Enum: Task
         */
        public String type;
  public GlipTaskInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         */
        public CreatorInfo creator;
  public GlipTaskInfo creator(CreatorInfo creator)
  {
    this.creator = creator;
    return this;
  }
  

        /**
         * Chat IDs where the task is posted or shared.
         */
        public String[] chatIds;
  public GlipTaskInfo chatIds(String[] chatIds)
  {
    this.chatIds = chatIds;
    return this;
  }
  

        /**
         * Status of task execution
         * Enum: Pending, InProgress, Completed
         */
        public String status;
  public GlipTaskInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Name/subject of a task
         */
        public String subject;
  public GlipTaskInfo subject(String subject)
  {
    this.subject = subject;
    return this;
  }
  

        /**
         */
        public TaskAssigneeInfo[] assignees;
  public GlipTaskInfo assignees(TaskAssigneeInfo[] assignees)
  {
    this.assignees = assignees;
    return this;
  }
  

        /**
         * Specifies how to determine task completeness
         * Enum: Simple, AllAssignees, Percentage
         */
        public String completenessCondition;
  public GlipTaskInfo completenessCondition(String completenessCondition)
  {
    this.completenessCondition = completenessCondition;
    return this;
  }
  

        /**
         * Current completeness percentage of the task with the specified percentage completeness condition
         * Maximum: 100
         */
        public Long completenessPercentage;
  public GlipTaskInfo completenessPercentage(Long completenessPercentage)
  {
    this.completenessPercentage = completenessPercentage;
    return this;
  }
  

        /**
         * Task start date
         */
        public String startDate;
  public GlipTaskInfo startDate(String startDate)
  {
    this.startDate = startDate;
    return this;
  }
  

        /**
         * Task due date/time
         */
        public String dueDate;
  public GlipTaskInfo dueDate(String dueDate)
  {
    this.dueDate = dueDate;
    return this;
  }
  

        /**
         * Font color of a post with the current task
         * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
         */
        public String color;
  public GlipTaskInfo color(String color)
  {
    this.color = color;
    return this;
  }
  

        /**
         * Task section to group/search by
         */
        public String section;
  public GlipTaskInfo section(String section)
  {
    this.section = section;
    return this;
  }
  

        /**
         * Task details
         */
        public String description;
  public GlipTaskInfo description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         */
        public GlipTaskRecurrenceInfo recurrence;
  public GlipTaskInfo recurrence(GlipTaskRecurrenceInfo recurrence)
  {
    this.recurrence = recurrence;
    return this;
  }
  

        /**
         */
        public TaskAttachment[] attachments;
  public GlipTaskInfo attachments(TaskAttachment[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  
}
