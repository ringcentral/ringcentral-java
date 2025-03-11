package com.ringcentral.paths.restapi.v2.accounts.deviceinventory;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/device-inventory";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Adds an existing phone (customer provided device - BYOD) as an unassigned device to the account inventory.
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/device-inventory
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     */
    public AddDeviceToInventoryResponse post(AddDeviceToInventoryRequest addDeviceToInventoryRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), addDeviceToInventoryRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AddDeviceToInventoryResponse.class);
    }

    /**
     * Deletes an existing unassigned (without digital line or phone number) device or multiple devices
     * from the account inventory. It is possible to delete up to 10 devices per request.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/v2/accounts/{accountId}/device-inventory
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     */
    public DeleteDeviceFromInventoryResponse delete(DeleteDeviceFromInventoryRequest deleteDeviceFromInventoryRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), deleteDeviceFromInventoryRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DeleteDeviceFromInventoryResponse.class);
    }
}
