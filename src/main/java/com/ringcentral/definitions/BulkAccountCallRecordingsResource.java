package com.ringcentral.definitions;


public class BulkAccountCallRecordingsResource {
    /**
     *
     */
    public CallRecordingExtensionResource addedExtensions;
    /**
     *
     */
    public CallRecordingExtensionResource updatedExtensions;
    /**
     *
     */
    public CallRecordingExtensionResource removedExtensions;

    public BulkAccountCallRecordingsResource addedExtensions(CallRecordingExtensionResource addedExtensions) {
        this.addedExtensions = addedExtensions;
        return this;
    }

    public BulkAccountCallRecordingsResource updatedExtensions(CallRecordingExtensionResource updatedExtensions) {
        this.updatedExtensions = updatedExtensions;
        return this;
    }

    public BulkAccountCallRecordingsResource removedExtensions(CallRecordingExtensionResource removedExtensions) {
        this.removedExtensions = removedExtensions;
        return this;
    }

}
