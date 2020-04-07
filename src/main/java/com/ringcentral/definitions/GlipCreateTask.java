package com.ringcentral.definitions;


public class GlipCreateTask {
    /**
     * Task name/subject. Max allowed length is 250 characters.
     * Required
     */
    public String subject;
    /**
     * Required
     */
    public GlipCreateTaskAssignee[] assignees;
    /**
     * Default: Simple
     * Enum: Simple, AllAssignees, Percentage
     */
    public String completenessCondition;
    /**
     * Task start date in UTC time zone.
     */
    public String startDate;
    /**
     * Task due date/time in UTC time zone.
     */
    public String dueDate;
    /**
     * Default: Black
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    /**
     * Task section to group / search by. Max allowed legth is 100 characters.
     */
    public String section;
    /**
     * Task details. Max allowed legth is 102400 characters (100kB).
     */
    public String description;
    /**
     *
     */
    public GlipTaskRecurrenceInfo recurrence;
    /**
     *
     */
    public GlipCreateTaskAttachment[] attachments;

    public GlipCreateTask subject(String subject) {
        this.subject = subject;
        return this;
    }

    public GlipCreateTask assignees(GlipCreateTaskAssignee[] assignees) {
        this.assignees = assignees;
        return this;
    }

    public GlipCreateTask completenessCondition(String completenessCondition) {
        this.completenessCondition = completenessCondition;
        return this;
    }

    public GlipCreateTask startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public GlipCreateTask dueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public GlipCreateTask color(String color) {
        this.color = color;
        return this;
    }

    public GlipCreateTask section(String section) {
        this.section = section;
        return this;
    }

    public GlipCreateTask description(String description) {
        this.description = description;
        return this;
    }

    public GlipCreateTask recurrence(GlipTaskRecurrenceInfo recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public GlipCreateTask attachments(GlipCreateTaskAttachment[] attachments) {
        this.attachments = attachments;
        return this;
    }

}
