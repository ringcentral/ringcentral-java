package com.ringcentral.definitions;


// Result record on adding multiple contacts to an extension. Returned for completed tasks
public class AddressBookBulkUploadTaskResult {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     *
     */
    public AddressBookBulkContactResource contact;
    /**
     * Adding contact status
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public ErrorEntity[] errors;

    public AddressBookBulkUploadTaskResult extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public AddressBookBulkUploadTaskResult contact(AddressBookBulkContactResource contact) {
        this.contact = contact;
        return this;
    }

    public AddressBookBulkUploadTaskResult status(String status) {
        this.status = status;
        return this;
    }

    public AddressBookBulkUploadTaskResult errors(ErrorEntity[] errors) {
        this.errors = errors;
        return this;
    }
}
