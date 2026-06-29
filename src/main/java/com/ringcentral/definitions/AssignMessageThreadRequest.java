package com.ringcentral.definitions;

/** Assignee extension information (can be `null` to unassign the thread) */
public class AssignMessageThreadRequest {
    /** Required */
    public AssignMessageThreadRequestAssignee assignee;

    public AssignMessageThreadRequest assignee(AssignMessageThreadRequestAssignee assignee) {
        this.assignee = assignee;
        return this;
    }
}
