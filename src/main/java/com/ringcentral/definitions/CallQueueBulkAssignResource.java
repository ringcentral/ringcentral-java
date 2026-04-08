package com.ringcentral.definitions;


public class CallQueueBulkAssignResource
{
    /**
     */
    public String[] addedExtensionIds;
    public CallQueueBulkAssignResource addedExtensionIds(String[] addedExtensionIds)
    {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }

    /**
     */
    public String[] removedExtensionIds;
    public CallQueueBulkAssignResource removedExtensionIds(String[] removedExtensionIds)
    {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }
}