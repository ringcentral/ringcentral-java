package com.ringcentral.paths.restapi.v2.accounts.devices.bulkadd;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BulkAddDevicesRequest;
import com.ringcentral.definitions.BulkAddDevicesResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.devices.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.devices.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bulk-add";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Adds multiple BYOD (customer provided) devices to an account.
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/devices/bulk-add
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: AddRemoveDevices
     */
    public BulkAddDevicesResponse post(BulkAddDevicesRequest bulkAddDevicesRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), bulkAddDevicesRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BulkAddDevicesResponse.class);
    }
}
