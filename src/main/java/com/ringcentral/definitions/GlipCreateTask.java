package com.ringcentral.definitions;


public class GlipCreateTask
{
    /**
         * Task name/subject. Max allowed length is 250 characters.
         * Required
         */
        public String subject;
  public GlipCreateTask subject(String subject)
  {
    this.subject = subject;
    return this;
  }
  

        /**
         * Required
         */
        public AssigneeInfo[] assignees;
  public GlipCreateTask assignees(AssigneeInfo[] assignees)
  {
    this.assignees = assignees;
    return this;
  }
  

        /**
         * Default: Simple
         * Enum: Simple, AllAssignees, Percentage
         */
        public String completenessCondition;
  public GlipCreateTask completenessCondition(String completenessCondition)
  {
    this.completenessCondition = completenessCondition;
    return this;
  }
  

        /**
         * Task start date in UTC time zone.
         */
        public String startDate;
  public GlipCreateTask startDate(String startDate)
  {
    this.startDate = startDate;
    return this;
  }
  

        /**
         * Task due date/time in UTC time zone.
         */
        public String dueDate;
  public GlipCreateTask dueDate(String dueDate)
  {
    this.dueDate = dueDate;
    return this;
  }
  

        /**
         * Default: Black
         * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
         */
        public String color;
  public GlipCreateTask color(String color)
  {
    this.color = color;
    return this;
  }
  

        /**
         * Task section to group / search by. Max allowed legth is 100 characters.
         */
        public String section;
  public GlipCreateTask section(String section)
  {
    this.section = section;
    return this;
  }
  

        /**
         * Task details. Max allowed legth is 102400 characters (100kB).
         */
        public String description;
  public GlipCreateTask description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         */
        public GlipTaskRecurrenceInfo recurrence;
  public GlipCreateTask recurrence(GlipTaskRecurrenceInfo recurrence)
  {
    this.recurrence = recurrence;
    return this;
  }
  

        /**
         */
        public GlipAttachmentInfoRequest[] attachments;
  public GlipCreateTask attachments(GlipAttachmentInfoRequest[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  
}
