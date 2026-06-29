package com.ringcentral.definitions;

public class AssignMessageThreadRequestAssignee {
    /** Extension ID of the assignee Example: 9876453210 */
    public String extensionId;

    public AssignMessageThreadRequestAssignee extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
