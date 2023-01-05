package com.ringcentral.definitions;


    /**
* Result record on multiple extension update task
*/
public class ExtensionBulkUpdateTaskResult
{
    /**
     */
    public ExtensionUpdateShortResult[] affectedItems;
    public ExtensionBulkUpdateTaskResult affectedItems(ExtensionUpdateShortResult[] affectedItems)
    {
        this.affectedItems = affectedItems;
        return this;
    }

    /**
     */
    public ErrorEntity[] errors;
    public ExtensionBulkUpdateTaskResult errors(ErrorEntity[] errors)
    {
        this.errors = errors;
        return this;
    }
}