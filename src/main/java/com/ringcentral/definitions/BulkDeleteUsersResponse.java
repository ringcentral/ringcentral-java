package com.ringcentral.definitions;


public class BulkDeleteUsersResponse {
    /**
     * Required
     */
    public BulkDeleteUsersResponseRecords[] records;

    public BulkDeleteUsersResponse records(BulkDeleteUsersResponseRecords[] records) {
        this.records = records;
        return this;
    }
}
