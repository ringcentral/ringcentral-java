package com.ringcentral.definitions;


public class CallMonitoringExtensionInfo {
    /**
     * Internal identifier of an extension. Only the following extension
     * types are allowed: User, DigitalUser, VirtualUser, FaxUser, Limited
     */
    public String id;
    /**
     * Set of call monitoring group permissions granted to a specified
     * extension. In order to remove a specified extension from a call monitoring
     * group use an empty value
     * Enum: Monitoring, Monitored
     */
    public String[] permissions;

    public CallMonitoringExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallMonitoringExtensionInfo permissions(String[] permissions) {
        this.permissions = permissions;
        return this;
    }
}
