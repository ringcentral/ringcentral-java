package com.ringcentral.definitions;


public class BulkAssignItem {
    /**
     *
     */
    public String departmentId;
    /**
     *
     */
    public String[] addedExtensionIds;
    /**
     *
     */
    public String[] removedExtensionIds;

    public BulkAssignItem departmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    public BulkAssignItem addedExtensionIds(String[] addedExtensionIds) {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }

    public BulkAssignItem removedExtensionIds(String[] removedExtensionIds) {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }

}
