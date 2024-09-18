package com.ringcentral.definitions;


/**
 * Resulting record of a task on multiple extensions update
 */
public class ExtensionBulkUpdateTaskResult {
    /**
     *
     */
    public ExtensionBulkUpdateTaskResultAffectedItems affectedItems;
    /**
     *
     */
    public ErrorEntity[] errors;

    public ExtensionBulkUpdateTaskResult affectedItems(ExtensionBulkUpdateTaskResultAffectedItems affectedItems) {
        this.affectedItems = affectedItems;
        return this;
    }

    public ExtensionBulkUpdateTaskResult errors(ErrorEntity[] errors) {
        this.errors = errors;
        return this;
    }
}
