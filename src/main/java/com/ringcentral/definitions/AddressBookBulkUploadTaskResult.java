package com.ringcentral.definitions;


    // Result record on adding multiple contacts to an extension. Returned for completed tasks
public class AddressBookBulkUploadTaskResult
{
    /**
         * Internal identifier of an extension
         */
        public String extensionId;
  public AddressBookBulkUploadTaskResult extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         */
        public AddressBookBulkContactResource contact;
  public AddressBookBulkUploadTaskResult contact(AddressBookBulkContactResource contact)
  {
    this.contact = contact;
    return this;
  }
  

        /**
         * Adding contact status
         * Enum: Success, Fail
         */
        public String status;
  public AddressBookBulkUploadTaskResult status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public ErrorEntity[] errors;
  public AddressBookBulkUploadTaskResult errors(ErrorEntity[] errors)
  {
    this.errors = errors;
    return this;
  }
  
}
