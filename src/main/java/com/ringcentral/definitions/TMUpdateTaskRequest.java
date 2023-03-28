package com.ringcentral.definitions;


public class TMUpdateTaskRequest {
    /**
     * Task name/subject. Max allowed length is 250 characters.
     */
    public String subject;
    /**
     *
     */
    public TMUpdateTaskRequestAssignees[] assignees;
    /**
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
    public TMUpdateTaskRequestRecurrence recurrence;
    /**
     *
     */
    public TMAttachmentInfo[] attachments;

    public TMUpdateTaskRequest subject(String subject) {
        this.subject = subject;
        return this;
    }

    public TMUpdateTaskRequest assignees(TMUpdateTaskRequestAssignees[] assignees) {
        this.assignees = assignees;
        return this;
    }

    public TMUpdateTaskRequest completenessCondition(String completenessCondition) {
        this.completenessCondition = completenessCondition;
        return this;
    }

    public TMUpdateTaskRequest startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public TMUpdateTaskRequest dueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public TMUpdateTaskRequest color(String color) {
        this.color = color;
        return this;
    }

    public TMUpdateTaskRequest section(String section) {
        this.section = section;
        return this;
    }

    public TMUpdateTaskRequest description(String description) {
        this.description = description;
        return this;
    }

    public TMUpdateTaskRequest recurrence(TMUpdateTaskRequestRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public TMUpdateTaskRequest attachments(TMAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
