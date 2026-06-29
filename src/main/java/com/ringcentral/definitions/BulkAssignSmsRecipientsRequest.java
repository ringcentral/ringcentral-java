package com.ringcentral.definitions;

/**
 * One of the parameters ('addedExtensionIds', 'removedExtensionIds') must be specified and not
 * empty.
 */
public class BulkAssignSmsRecipientsRequest {
    /**
     * List of added extensions. maxItems values depends on MessageThreads feature. If the feature
     * is disabled maxItems=1, otherwise 50.
     */
    public String[] addedExtensionIds;

    public BulkAssignSmsRecipientsRequest addedExtensionIds(String[] addedExtensionIds) {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }

    /**
     * List of removed extensions. maxItems values depends on MessageThreads feature. If the feature
     * is disabled maxItems=1, otherwise 50.
     */
    public String[] removedExtensionIds;

    public BulkAssignSmsRecipientsRequest removedExtensionIds(String[] removedExtensionIds) {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }
}
