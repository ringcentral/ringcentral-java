package com.ringcentral.definitions;


public class CallMonitoringBulkAssign {
    /**
     *
     */
    public CallMonitoringExtensionUpdate[] updatedExtensions;

    public CallMonitoringBulkAssign updatedExtensions(CallMonitoringExtensionUpdate[] updatedExtensions) {
        this.updatedExtensions = updatedExtensions;
        return this;
    }

}
