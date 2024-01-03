package com.ringcentral.definitions;


public class TMTaskInfo {
    /**
     * Internal identifier of a task
     */
    public String id;
    /**
     * Task creation date/time in UTC time zone
     * Format: date-time
     */
    public String creationTime;
    /**
     * Task the last modified time in UTC time zone
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Task type
     * Enum: Task
     */
    public String type;
    /**
     *
     */
    public TMTaskInfoCreator creator;
    /**
     * Internal identifiers of the chats where the task is posted or shared
     */
    public String[] chatIds;
    /**
     * Task execution status
     * Enum: Pending, InProgress, Completed
     */
    public String status;
    /**
     * Task name/subject
     */
    public String subject;
    /**
     * Task name/subject
     */
    public TMTaskInfoAssignees[] assignees;
    /**
     * How the task completeness should be determined
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    /**
     * Current completeness percentage of the task with the specified percentage completeness condition
     * Maximum: 100
     * Format: int32
     */
    public Long completenessPercentage;
    /**
     * Task start date
     * Format: date-time
     */
    public String startDate;
    /**
     * Task due date/time
     * Format: date-time
     */
    public String dueDate;
    /**
     * Font color of a post with the current task
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    /**
     * Task section to group / search by
     */
    public String section;
    /**
     * Task details
     */
    public String description;
    /**
     * Task details.
     */
    public TMTaskInfoRecurrence recurrence;
    /**
     *
     */
    public TaskAttachment[] attachments;

    public TMTaskInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMTaskInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMTaskInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public TMTaskInfo type(String type) {
        this.type = type;
        return this;
    }

    public TMTaskInfo creator(TMTaskInfoCreator creator) {
        this.creator = creator;
        return this;
    }

    public TMTaskInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

    public TMTaskInfo status(String status) {
        this.status = status;
        return this;
    }

    public TMTaskInfo subject(String subject) {
        this.subject = subject;
        return this;
    }

    public TMTaskInfo assignees(TMTaskInfoAssignees[] assignees) {
        this.assignees = assignees;
        return this;
    }

    public TMTaskInfo completenessCondition(String completenessCondition) {
        this.completenessCondition = completenessCondition;
        return this;
    }

    public TMTaskInfo completenessPercentage(Long completenessPercentage) {
        this.completenessPercentage = completenessPercentage;
        return this;
    }

    public TMTaskInfo startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public TMTaskInfo dueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public TMTaskInfo color(String color) {
        this.color = color;
        return this;
    }

    public TMTaskInfo section(String section) {
        this.section = section;
        return this;
    }

    public TMTaskInfo description(String description) {
        this.description = description;
        return this;
    }

    public TMTaskInfo recurrence(TMTaskInfoRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public TMTaskInfo attachments(TaskAttachment[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
