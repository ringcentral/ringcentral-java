package com.ringcentral.definitions;


public class GlipTaskInfoAssignee {
    /**
     * Internal identifier of an assignee
     */
    public String id;
    /**
     * Status of the task execution by assignee
     * Enum: Pending, Completed
     */
    public String status;

    public GlipTaskInfoAssignee id(String id) {
        this.id = id;
        return this;
    }

    public GlipTaskInfoAssignee status(String status) {
        this.status = status;
        return this;
    }

}
