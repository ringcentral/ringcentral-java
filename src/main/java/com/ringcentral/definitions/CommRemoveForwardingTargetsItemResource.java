package com.ringcentral.definitions;


public class CommRemoveForwardingTargetsItemResource {
    /**
     * Required
     */
    public Boolean bulkItemSuccessful;
    /**
     *
     */
    public ApiError[] bulkItemErrors;
    /**
     * Ring target
     * Required
     */
    public CommRemoveForwardingTargetsItemResourceBulkItem bulkItem;

    public CommRemoveForwardingTargetsItemResource bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    public CommRemoveForwardingTargetsItemResource bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }

    public CommRemoveForwardingTargetsItemResource bulkItem(CommRemoveForwardingTargetsItemResourceBulkItem bulkItem) {
        this.bulkItem = bulkItem;
        return this;
    }
}
