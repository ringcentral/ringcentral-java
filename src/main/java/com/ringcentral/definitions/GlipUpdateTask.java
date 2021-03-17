package com.ringcentral.definitions;


public class GlipUpdateTask
{
    /**
         * Task name/subject. Max allowed length is 250 characters.
         */
        public String subject;
  public GlipUpdateTask subject(String subject)
  {
    this.subject = subject;
    return this;
  }
  

        /**
         */
        public AssigneeInfo[] assignees;
  public GlipUpdateTask assignees(AssigneeInfo[] assignees)
  {
    this.assignees = assignees;
    return this;
  }
  

        /**
         * Enum: Simple, AllAssignees, Percentage
         */
        public String completenessCondition;
  public GlipUpdateTask completenessCondition(String completenessCondition)
  {
    this.completenessCondition = completenessCondition;
    return this;
  }
  

        /**
         * Task start date in UTC time zone
         */
        public String startDate;
  public GlipUpdateTask startDate(String startDate)
  {
    this.startDate = startDate;
    return this;
  }
  

        /**
         * Task due date/time in UTC time zone
         */
        public String dueDate;
  public GlipUpdateTask dueDate(String dueDate)
  {
    this.dueDate = dueDate;
    return this;
  }
  

        /**
         * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
         */
        public String color;
  public GlipUpdateTask color(String color)
  {
    this.color = color;
    return this;
  }
  

        /**
         * Task section to group/search by. Max allowed legth is 100 characters
         */
        public String section;
  public GlipUpdateTask section(String section)
  {
    this.section = section;
    return this;
  }
  

        /**
         * Task details. Max allowed legth is 102400 characters (100kB)
         */
        public String description;
  public GlipUpdateTask description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         */
        public GlipTaskRecurrenceInfo recurrence;
  public GlipUpdateTask recurrence(GlipTaskRecurrenceInfo recurrence)
  {
    this.recurrence = recurrence;
    return this;
  }
  

        /**
         */
        public GlipAttachmentInfoRequest[] attachments;
  public GlipUpdateTask attachments(GlipAttachmentInfoRequest[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  
}
