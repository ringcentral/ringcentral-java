package com.ringcentral.definitions;


public class AddressBookBulkUploadRequest
{
    /**
         * List of extensions which contacts have to be updated
         * Required
         */
        public AddressBookBulkUploadResource[] records;
  public AddressBookBulkUploadRequest records(AddressBookBulkUploadResource[] records)
  {
    this.records = records;
    return this;
  }
  
}
