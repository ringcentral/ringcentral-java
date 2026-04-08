package com.ringcentral.definitions;

public class CommRemoveForwardingTargetsItemResource {
    /** Required */
    public Boolean bulkItemSuccessful;

    public CommRemoveForwardingTargetsItemResource bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    /** */
    public ApiError[] bulkItemErrors;

    public CommRemoveForwardingTargetsItemResource bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }

    /** Ring target Required */
    public CommRemoveForwardingTargetsItemResourceBulkItem bulkItem;

    public CommRemoveForwardingTargetsItemResource bulkItem(
            CommRemoveForwardingTargetsItemResourceBulkItem bulkItem) {
        this.bulkItem = bulkItem;
        return this;
    }
}
