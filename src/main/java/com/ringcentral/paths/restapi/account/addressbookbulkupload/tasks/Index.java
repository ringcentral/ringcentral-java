package com.ringcentral.paths.restapi.account.addressbookbulkupload.tasks;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AddressBookBulkUploadResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.addressbookbulkupload.Index parent;
    public String taskId;

    public Index(com.ringcentral.paths.restapi.account.addressbookbulkupload.Index parent, String taskId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.taskId = taskId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && taskId != null) {
            return parent.path() + "/tasks/" + taskId;
        }
        return parent.path() + "/tasks";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the status of a task on adding multiple contacts to multiple extensions.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/address-book-bulk-upload/tasks/{taskId}
     * Rate Limit Group: Light
     * App Permission: Contacts
     * User Permission: EditPersonalContacts
     */
    public AddressBookBulkUploadResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AddressBookBulkUploadResponse.class);
    }
}
