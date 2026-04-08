package com.ringcentral.definitions;


public class CallMonitoringBulkAssign
{
    /**
     */
    public CallMonitoringExtensionInfo[] addedExtensions;
    public CallMonitoringBulkAssign addedExtensions(CallMonitoringExtensionInfo[] addedExtensions)
    {
        this.addedExtensions = addedExtensions;
        return this;
    }

    /**
     */
    public CallMonitoringExtensionInfo[] updatedExtensions;
    public CallMonitoringBulkAssign updatedExtensions(CallMonitoringExtensionInfo[] updatedExtensions)
    {
        this.updatedExtensions = updatedExtensions;
        return this;
    }

    /**
     */
    public CallMonitoringExtensionInfo[] removedExtensions;
    public CallMonitoringBulkAssign removedExtensions(CallMonitoringExtensionInfo[] removedExtensions)
    {
        this.removedExtensions = removedExtensions;
        return this;
    }
}