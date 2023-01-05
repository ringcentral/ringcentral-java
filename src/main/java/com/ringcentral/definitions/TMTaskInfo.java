package com.ringcentral.definitions;


public class TMTaskInfo
{
    /**
     * Task Id
     */
    public String id;
    public TMTaskInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Task creation date/time in UTC time zone.
     * Format: date-time
     */
    public String creationTime;
    public TMTaskInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Task the last modified time in UTC time zone.
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMTaskInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Task type
     * Enum: Task
     */
    public String type;
    public TMTaskInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public TMTaskInfoCreator creator;
    public TMTaskInfo creator(TMTaskInfoCreator creator)
    {
        this.creator = creator;
        return this;
    }

    /**
     * Chat IDs where the task is posted or shared.
     */
    public String[] chatIds;
    public TMTaskInfo chatIds(String[] chatIds)
    {
        this.chatIds = chatIds;
        return this;
    }

    /**
     * Task execution status.
     * Enum: Pending, InProgress, Completed
     */
    public String status;
    public TMTaskInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Task name/subject.
     */
    public String subject;
    public TMTaskInfo subject(String subject)
    {
        this.subject = subject;
        return this;
    }

    /**
     * Task name/subject.
     */
    public TMTaskInfoAssignees[] assignees;
    public TMTaskInfo assignees(TMTaskInfoAssignees[] assignees)
    {
        this.assignees = assignees;
        return this;
    }

    /**
     * How the task completeness should be determined.
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    public TMTaskInfo completenessCondition(String completenessCondition)
    {
        this.completenessCondition = completenessCondition;
        return this;
    }

    /**
     * Current completeness percentage of the task with the specified percentage completeness condition
     * Maximum: 100
     * Format: int32
     */
    public Long completenessPercentage;
    public TMTaskInfo completenessPercentage(Long completenessPercentage)
    {
        this.completenessPercentage = completenessPercentage;
        return this;
    }

    /**
     * Task start date.
     * Format: date-time
     */
    public String startDate;
    public TMTaskInfo startDate(String startDate)
    {
        this.startDate = startDate;
        return this;
    }

    /**
     * Task due date/time.
     * Format: date-time
     */
    public String dueDate;
    public TMTaskInfo dueDate(String dueDate)
    {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Font color of a post with the current task.
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    public TMTaskInfo color(String color)
    {
        this.color = color;
        return this;
    }

    /**
     * Task section to group / search by.
     */
    public String section;
    public TMTaskInfo section(String section)
    {
        this.section = section;
        return this;
    }

    /**
     * Task details.
     */
    public String description;
    public TMTaskInfo description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * Task details.
     */
    public TMTaskInfoRecurrence recurrence;
    public TMTaskInfo recurrence(TMTaskInfoRecurrence recurrence)
    {
        this.recurrence = recurrence;
        return this;
    }

    /**
     */
    public TaskAttachment[] attachments;
    public TMTaskInfo attachments(TaskAttachment[] attachments)
    {
        this.attachments = attachments;
        return this;
    }
}