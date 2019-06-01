package com.ringcentral.definitions;


public class CallMonitoringExtensionUpdate {
    /**
     * Only the following extension types are allowed: User, DigitalUser, VirtualUser, FaxUser, Limited
     */
    public String id;
    /**
     * Set of call monitoring group permissions granted to the specified extension. In order to remove the specified extension from a call monitoring group use an empty value
     */
    public String[] permissions;

    public CallMonitoringExtensionUpdate id(String id) {
        this.id = id;
        return this;
    }

    public CallMonitoringExtensionUpdate permissions(String[] permissions) {
        this.permissions = permissions;
        return this;
    }

}
