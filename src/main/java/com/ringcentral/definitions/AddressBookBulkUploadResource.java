package com.ringcentral.definitions;


public class AddressBookBulkUploadResource {
    /**
     * Required
     */
    public String extensionId;
    /**
     * Required
     */
    public AddressBookBulkContactResource[] contacts;

    public AddressBookBulkUploadResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public AddressBookBulkUploadResource contacts(AddressBookBulkContactResource[] contacts) {
        this.contacts = contacts;
        return this;
    }
}
