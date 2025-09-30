package com.ringcentral.paths.restapi.v2.accounts.extensions;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BulkDeleteUsersRequest;
import com.ringcentral.definitions.BulkDeleteUsersResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/extensions";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Deletes extension(s) of User and Limited types, and depending on device type either keeps or destroys
     * the assets - numbers and devices. If a device is rented or bought in RC, it will be moved to the inventory.
     * A BYOD (Other Phone) device will be deleted. Multiple extensions can be deleted by a single API call.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: Users
     */
    public BulkDeleteUsersResponse delete(BulkDeleteUsersRequest bulkDeleteUsersRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), bulkDeleteUsersRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BulkDeleteUsersResponse.class);
    }

    public com.ringcentral.paths.restapi.v2.accounts.extensions.devices.Index devices() {
        return this.devices(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.extensions.devices.Index devices(String deviceId) {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.devices.Index(this, deviceId);
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.Index commHandling() {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.commhandling.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.callflipnumbers.Index callFlipNumbers() {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.callflipnumbers.Index(this);
    }

}
