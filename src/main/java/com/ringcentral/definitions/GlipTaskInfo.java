package com.ringcentral.definitions;


public class GlipTaskInfo {
    /**
     * Internal identifier of a task
     */
    public String id;
    /**
     * Datetime of the task creation in UTC time zone.
     */
    public String creationTime;
    /**
     * Datetime of the last modification of the task in UTC time zone.
     */
    public String lastModifiedTime;
    /**
     * Type of a task
     * Enum: Task
     */
    public String type;
    /**
     *
     */
    public Object creator;
    /**
     * Chat IDs where the task is posted or shared.
     */
    public String[] chatIds;
    /**
     * Status of task execution
     * Enum: Pending, InProgress, Completed
     */
    public String status;
    /**
     * Name/subject of a task
     */
    public String subject;
    /**
     * Task name/subject
     */
    public Object[] assignees;
    /**
     * Specifies how to determine task completeness
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    /**
     * Current completeness percentage of the task with the specified percentage completeness condition
     * Maximum: 100
     */
    public Long completenessPercentage;
    /**
     * Task start date
     */
    public String startDate;
    /**
     * Task due date/time
     */
    public String dueDate;
    /**
     * Font color of a post with the current task
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    /**
     * Task section to group/search by
     */
    public String section;
    /**
     * Task details
     */
    public String description;
    /**
     *
     */
    public GlipTaskRecurrenceInfo recurrence;
    /**
     *
     */
    public TaskAttachment[] attachments;

    public GlipTaskInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipTaskInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipTaskInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GlipTaskInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipTaskInfo creator(Object creator) {
        this.creator = creator;
        return this;
    }

    public GlipTaskInfo chatIds(String[] chatIds) {
        this.chatIds = chatIds;
        return this;
    }

    public GlipTaskInfo status(String status) {
        this.status = status;
        return this;
    }

    public GlipTaskInfo subject(String subject) {
        this.subject = subject;
        return this;
    }

    public GlipTaskInfo assignees(Object[] assignees) {
        this.assignees = assignees;
        return this;
    }

    public GlipTaskInfo completenessCondition(String completenessCondition) {
        this.completenessCondition = completenessCondition;
        return this;
    }

    public GlipTaskInfo completenessPercentage(Long completenessPercentage) {
        this.completenessPercentage = completenessPercentage;
        return this;
    }

    public GlipTaskInfo startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public GlipTaskInfo dueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public GlipTaskInfo color(String color) {
        this.color = color;
        return this;
    }

    public GlipTaskInfo section(String section) {
        this.section = section;
        return this;
    }

    public GlipTaskInfo description(String description) {
        this.description = description;
        return this;
    }

    public GlipTaskInfo recurrence(GlipTaskRecurrenceInfo recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public GlipTaskInfo attachments(TaskAttachment[] attachments) {
        this.attachments = attachments;
        return this;
    }

}
