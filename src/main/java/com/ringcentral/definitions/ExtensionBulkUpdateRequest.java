package com.ringcentral.definitions;


// List of extensions to be updated
public class ExtensionBulkUpdateRequest {
    /**
     * Required
     */
    public ExtensionBulkUpdateInfo[] records;

    public ExtensionBulkUpdateRequest records(ExtensionBulkUpdateInfo[] records) {
        this.records = records;
        return this;
    }
}
