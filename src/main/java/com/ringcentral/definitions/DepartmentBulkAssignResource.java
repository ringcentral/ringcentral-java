package com.ringcentral.definitions;


public class DepartmentBulkAssignResource {
    /**
     *
     */
    public BulkAssignItem[] items;

    public DepartmentBulkAssignResource items(BulkAssignItem[] items) {
        this.items = items;
        return this;
    }

}
