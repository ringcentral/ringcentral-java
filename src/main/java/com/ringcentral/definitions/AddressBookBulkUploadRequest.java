package com.ringcentral.definitions;


public class AddressBookBulkUploadRequest {
    /**
     * Required
     */
    public AddressBookBulkUploadResource[] records;

    public AddressBookBulkUploadRequest records(AddressBookBulkUploadResource[] records) {
        this.records = records;
        return this;
    }
}
