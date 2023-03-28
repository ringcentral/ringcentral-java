package com.ringcentral.definitions;


public class AddressBookBulkUploadTaskResult {
    /**
     *
     */
    public AddressBookBulkUploadResource[] affectedItems;
    /**
     *
     */
    public ErrorEntity[] errors;

    public AddressBookBulkUploadTaskResult affectedItems(AddressBookBulkUploadResource[] affectedItems) {
        this.affectedItems = affectedItems;
        return this;
    }

    public AddressBookBulkUploadTaskResult errors(ErrorEntity[] errors) {
        this.errors = errors;
        return this;
    }
}
