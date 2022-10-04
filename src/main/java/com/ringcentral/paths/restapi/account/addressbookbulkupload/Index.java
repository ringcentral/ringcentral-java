package com.ringcentral.paths.restapi.account.addressbookbulkupload;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AddressBookBulkUploadRequest;
import com.ringcentral.definitions.AddressBookBulkUploadResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/address-book-bulk-upload";
    }

    /**
     * Uploads multiple contacts for multiple extensions at once. Maximum 500 extensions can be uploaded per request. Max amount of contacts that can be uploaded per an extension is 10,000. Each contact uploaded to an extension is not visible to other extensions.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/address-book-bulk-upload
     * Rate Limit Group: Heavy
     * App Permission: Contacts
     * User Permission: EditPersonalContacts
     */
    public AddressBookBulkUploadResponse post(AddressBookBulkUploadRequest addressBookBulkUploadRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), addressBookBulkUploadRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AddressBookBulkUploadResponse.class);
    }

    public com.ringcentral.paths.restapi.account.addressbookbulkupload.tasks.Index tasks() {
        return this.tasks(null);
    }

    public com.ringcentral.paths.restapi.account.addressbookbulkupload.tasks.Index tasks(String taskId) {
        return new com.ringcentral.paths.restapi.account.addressbookbulkupload.tasks.Index(this, taskId);
    }

}
