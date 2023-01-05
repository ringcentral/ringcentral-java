package com.ringcentral.definitions;


public class TMCreateTaskRequest
{
    /**
     * Task name/subject. Max allowed length is 250 characters.
     * Required
     */
    public String subject;
    public TMCreateTaskRequest subject(String subject)
    {
        this.subject = subject;
        return this;
    }

    /**
     * Required
     */
    public TMCreateTaskRequestAssignees[] assignees;
    public TMCreateTaskRequest assignees(TMCreateTaskRequestAssignees[] assignees)
    {
        this.assignees = assignees;
        return this;
    }

    /**
     * Default: Simple
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    public TMCreateTaskRequest completenessCondition(String completenessCondition)
    {
        this.completenessCondition = completenessCondition;
        return this;
    }

    /**
     * Task start date in UTC time zone.
     * Format: date-time
     */
    public String startDate;
    public TMCreateTaskRequest startDate(String startDate)
    {
        this.startDate = startDate;
        return this;
    }

    /**
     * Task due date/time in UTC time zone.
     * Format: date-time
     */
    public String dueDate;
    public TMCreateTaskRequest dueDate(String dueDate)
    {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Default: Black
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    public TMCreateTaskRequest color(String color)
    {
        this.color = color;
        return this;
    }

    /**
     * Task section to group / search by. Max allowed length is 100 characters.
     */
    public String section;
    public TMCreateTaskRequest section(String section)
    {
        this.section = section;
        return this;
    }

    /**
     * Task details. Max allowed length is 102400 characters (100kB).
     */
    public String description;
    public TMCreateTaskRequest description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public TMCreateTaskRequestRecurrence recurrence;
    public TMCreateTaskRequest recurrence(TMCreateTaskRequestRecurrence recurrence)
    {
        this.recurrence = recurrence;
        return this;
    }

    /**
     */
    public TMAttachmentInfo[] attachments;
    public TMCreateTaskRequest attachments(TMAttachmentInfo[] attachments)
    {
        this.attachments = attachments;
        return this;
    }
}