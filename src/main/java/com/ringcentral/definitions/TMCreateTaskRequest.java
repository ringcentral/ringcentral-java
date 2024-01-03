package com.ringcentral.definitions;


public class TMCreateTaskRequest {
    /**
     * Task name/subject. Max allowed length is 250 characters
     * Required
     */
    public String subject;
    /**
     * Required
     */
    public TMCreateTaskRequestAssignees[] assignees;
    /**
     * Default: Simple
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    /**
     * Task start date in UTC time zone.
     * Format: date-time
     */
    public String startDate;
    /**
     * Task due date/time in UTC time zone.
     * Format: date-time
     */
    public String dueDate;
    /**
     * Default: Black
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    /**
     * Task section to group / search by. Max allowed length is 100 characters.
     */
    public String section;
    /**
     * Task details. Max allowed length is 102400 characters (100kB).
     */
    public String description;
    /**
     *
     */
    public TMCreateTaskRequestRecurrence recurrence;
    /**
     *
     */
    public TMAttachmentInfo[] attachments;

    public TMCreateTaskRequest subject(String subject) {
        this.subject = subject;
        return this;
    }

    public TMCreateTaskRequest assignees(TMCreateTaskRequestAssignees[] assignees) {
        this.assignees = assignees;
        return this;
    }

    public TMCreateTaskRequest completenessCondition(String completenessCondition) {
        this.completenessCondition = completenessCondition;
        return this;
    }

    public TMCreateTaskRequest startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public TMCreateTaskRequest dueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public TMCreateTaskRequest color(String color) {
        this.color = color;
        return this;
    }

    public TMCreateTaskRequest section(String section) {
        this.section = section;
        return this;
    }

    public TMCreateTaskRequest description(String description) {
        this.description = description;
        return this;
    }

    public TMCreateTaskRequest recurrence(TMCreateTaskRequestRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public TMCreateTaskRequest attachments(TMAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
