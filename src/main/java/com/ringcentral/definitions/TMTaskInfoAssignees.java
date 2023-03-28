package com.ringcentral.definitions;


public class TMTaskInfoAssignees {
    /**
     * Assignee Id
     */
    public String id;
    /**
     * Task execution status by assignee
     * Enum: Pending, Completed
     */
    public String status;

    public TMTaskInfoAssignees id(String id) {
        this.id = id;
        return this;
    }

    public TMTaskInfoAssignees status(String status) {
        this.status = status;
        return this;
    }
}
