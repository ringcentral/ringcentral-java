package com.ringcentral.paths.restapi.v2.accounts.extensions.devices.replace;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.devices.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.devices.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/replace";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Replaces the user device with another device, which is assigned to an extension
     * or is stored in the inventory of the same account.
     * Currently, the following device types can be swapped - `HardPhone` and `OtherPhone`.
     * <p>
     * Please note:
     * <p>
     * - This method allows replacing a device itself, while a phone number,
     * a digital Line and an emergency address associated with this device remain unchanged
     * and will still work together in a chain with the replacement device.
     * - If a target device is from the inventory, then a source device will be moved
     * to the inventory, and a target device will be assigned to the current extension.
     * - If a target device is currently assigned to another extension,
     * then the devices will be just swapped.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/devices/{deviceId}/replace
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditUserDevices
     */
    public String post(SwapDeviceRequest swapDeviceRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), swapDeviceRequest, null);
        return rb.string();
    }
}
