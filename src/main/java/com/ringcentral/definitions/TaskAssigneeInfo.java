package com.ringcentral.definitions;


public class TaskAssigneeInfo {
    /**
     * Internal identifier of an assignee
     */
    public String id;
    /**
     * Status of the task execution by assignee
     * Enum: Pending, Completed
     */
    public String status;

    public TaskAssigneeInfo id(String id) {
        this.id = id;
        return this;
    }

    public TaskAssigneeInfo status(String status) {
        this.status = status;
        return this;
    }
}
