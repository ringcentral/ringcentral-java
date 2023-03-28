package com.ringcentral.definitions;


public class SiteMembersBulkUpdate {
    /**
     * List of removed extensions
     */
    public String[] removedExtensionIds;
    /**
     * List of added extensions
     */
    public String[] addedExtensionIds;

    public SiteMembersBulkUpdate removedExtensionIds(String[] removedExtensionIds) {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }

    public SiteMembersBulkUpdate addedExtensionIds(String[] addedExtensionIds) {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }
}
