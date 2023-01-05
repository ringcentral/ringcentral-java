package com.ringcentral.definitions;


public class TMUpdateTaskRequest
{
    /**
     * Task name/subject. Max allowed length is 250 characters.
     */
    public String subject;
    public TMUpdateTaskRequest subject(String subject)
    {
        this.subject = subject;
        return this;
    }

    /**
     */
    public TMUpdateTaskRequestAssignees[] assignees;
    public TMUpdateTaskRequest assignees(TMUpdateTaskRequestAssignees[] assignees)
    {
        this.assignees = assignees;
        return this;
    }

    /**
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    public TMUpdateTaskRequest completenessCondition(String completenessCondition)
    {
        this.completenessCondition = completenessCondition;
        return this;
    }

    /**
     * Task start date in UTC time zone.
     * Format: date-time
     */
    public String startDate;
    public TMUpdateTaskRequest startDate(String startDate)
    {
        this.startDate = startDate;
        return this;
    }

    /**
     * Task due date/time in UTC time zone.
     * Format: date-time
     */
    public String dueDate;
    public TMUpdateTaskRequest dueDate(String dueDate)
    {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    public TMUpdateTaskRequest color(String color)
    {
        this.color = color;
        return this;
    }

    /**
     * Task section to group / search by. Max allowed length is 100 characters.
     */
    public String section;
    public TMUpdateTaskRequest section(String section)
    {
        this.section = section;
        return this;
    }

    /**
     * Task details. Max allowed length is 102400 characters (100kB).
     */
    public String description;
    public TMUpdateTaskRequest description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public TMUpdateTaskRequestRecurrence recurrence;
    public TMUpdateTaskRequest recurrence(TMUpdateTaskRequestRecurrence recurrence)
    {
        this.recurrence = recurrence;
        return this;
    }

    /**
     */
    public TMAttachmentInfo[] attachments;
    public TMUpdateTaskRequest attachments(TMAttachmentInfo[] attachments)
    {
        this.attachments = attachments;
        return this;
    }
}