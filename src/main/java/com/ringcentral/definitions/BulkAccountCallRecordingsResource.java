package com.ringcentral.definitions;


public class BulkAccountCallRecordingsResource
{
    /**
     */
    public CallRecordingExtensionResource[] addedExtensions;
    public BulkAccountCallRecordingsResource addedExtensions(CallRecordingExtensionResource[] addedExtensions)
    {
        this.addedExtensions = addedExtensions;
        return this;
    }

    /**
     */
    public CallRecordingExtensionResource[] updatedExtensions;
    public BulkAccountCallRecordingsResource updatedExtensions(CallRecordingExtensionResource[] updatedExtensions)
    {
        this.updatedExtensions = updatedExtensions;
        return this;
    }

    /**
     */
    public CallRecordingExtensionResource[] removedExtensions;
    public BulkAccountCallRecordingsResource removedExtensions(CallRecordingExtensionResource[] removedExtensions)
    {
        this.removedExtensions = removedExtensions;
        return this;
    }
}