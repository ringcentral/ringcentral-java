package com.ringcentral.definitions;


/**
 * Information about an extension this device is assigned to
 */
public class BulkOperationExtensionReference {
    /**
     * Internal identifier of a RingCentral extension
     * Required
     * Example: 12345
     */
    public String id;

    public BulkOperationExtensionReference id(String id) {
        this.id = id;
        return this;
    }
}
