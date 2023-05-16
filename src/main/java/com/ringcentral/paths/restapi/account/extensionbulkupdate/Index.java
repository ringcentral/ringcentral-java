package com.ringcentral.paths.restapi.account.extensionbulkupdate;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ExtensionBulkUpdateRequest;
import com.ringcentral.definitions.ExtensionBulkUpdateTaskResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/extension-bulk-update";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Updates multiple extensions at once. Maximum 500 extensions can be updated per request.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension-bulk-update
     * Rate Limit Group: Heavy
     * App Permission: EditExtensions
     * User Permission: EditExtensionInfo
     */
    public ExtensionBulkUpdateTaskResource post(ExtensionBulkUpdateRequest extensionBulkUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), extensionBulkUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionBulkUpdateTaskResource.class);
    }

    public com.ringcentral.paths.restapi.account.extensionbulkupdate.tasks.Index tasks() {
        return this.tasks(null);
    }

    public com.ringcentral.paths.restapi.account.extensionbulkupdate.tasks.Index tasks(String taskId) {
        return new com.ringcentral.paths.restapi.account.extensionbulkupdate.tasks.Index(this, taskId);
    }

}
