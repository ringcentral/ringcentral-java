package com.ringcentral.definitions;


public class CallMonitoringBulkAssign {
    /**
     *
     */
    public CallMonitoringExtensionInfo[] addedExtensions;
    /**
     *
     */
    public CallMonitoringExtensionInfo[] updatedExtensions;
    /**
     *
     */
    public CallMonitoringExtensionInfo[] removedExtensions;

    public CallMonitoringBulkAssign addedExtensions(CallMonitoringExtensionInfo[] addedExtensions) {
        this.addedExtensions = addedExtensions;
        return this;
    }

    public CallMonitoringBulkAssign updatedExtensions(CallMonitoringExtensionInfo[] updatedExtensions) {
        this.updatedExtensions = updatedExtensions;
        return this;
    }

    public CallMonitoringBulkAssign removedExtensions(CallMonitoringExtensionInfo[] removedExtensions) {
        this.removedExtensions = removedExtensions;
        return this;
    }

}
