package com.ringcentral.definitions;


public class CallMonitoringGroupMemberInfo {
    /**
     * Link to a call monitoring group member
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a call monitoring group member
     */
    public String id;
    /**
     * Extension number of a call monitoring group member
     */
    public String extensionNumber;
    /**
     * Enum: Monitoring, Monitored
     */
    public String[] permissions;

    public CallMonitoringGroupMemberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallMonitoringGroupMemberInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallMonitoringGroupMemberInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallMonitoringGroupMemberInfo permissions(String[] permissions) {
        this.permissions = permissions;
        return this;
    }
}
