package com.ringcentral.paths.restapi.v2.accounts.devices;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.RemoveLineRequest;
import com.ringcentral.definitions.RemoveLineResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;
    public String deviceId;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent, String deviceId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.deviceId = deviceId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && deviceId != null) {
            return parent.path() + "/devices/" + deviceId;
        }
        return parent.path() + "/devices";
    }

    public String path() {
        return path(true);
    }

    /**
     * Disassociates phone line (DL &amp; Device) from an extension.
     * - if value ```keepAssetsInInventory == true```,
     * the given device is moved to unassigned devices and the number is moved to the number inventory;
     * - if value ```keepAssetsInInventory == false```, the given device and number is removed from the account;
     * - if the parameter keepAssetsInInventory is not set (empty body),
     * default value ```keepAssetsInInventory == true``` is used.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/v2/accounts/{accountId}/devices/{deviceId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditAccountDevices
     */
    public RemoveLineResponse delete(RemoveLineRequest removeLineRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (deviceId == null) {
            throw new IllegalArgumentException("Parameter deviceId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), removeLineRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RemoveLineResponse.class);
    }

    public com.ringcentral.paths.restapi.v2.accounts.devices.bulkadd.Index bulkAdd() {
        return new com.ringcentral.paths.restapi.v2.accounts.devices.bulkadd.Index(this);
    }

}
