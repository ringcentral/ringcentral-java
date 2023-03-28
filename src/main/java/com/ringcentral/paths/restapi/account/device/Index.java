package com.ringcentral.paths.restapi.account.device;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountDeviceUpdate;
import com.ringcentral.definitions.GetDeviceInfoResponse;
import com.ringcentral.definitions.ReadDeviceParameters;
import com.ringcentral.definitions.UpdateDeviceParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String deviceId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String deviceId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.deviceId = deviceId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && deviceId != null) {
            return parent.path() + "/device/" + deviceId;
        }
        return parent.path() + "/device";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns account device(s) by their ID(s).
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/device/{deviceId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyDevices
     */
    public GetDeviceInfoResponse get(ReadDeviceParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (deviceId == null) {
            throw new IllegalArgumentException("Parameter deviceId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetDeviceInfoResponse.class);
    }

    public GetDeviceInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Updates account device(s) by their ID(s).
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/device/{deviceId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyDevices
     */
    public GetDeviceInfoResponse put(AccountDeviceUpdate accountDeviceUpdate, UpdateDeviceParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (deviceId == null) {
            throw new IllegalArgumentException("Parameter deviceId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), accountDeviceUpdate, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetDeviceInfoResponse.class);
    }

    public GetDeviceInfoResponse put(AccountDeviceUpdate accountDeviceUpdate) throws com.ringcentral.RestException, java.io.IOException {
        return this.put(accountDeviceUpdate, null);
    }

    public com.ringcentral.paths.restapi.account.device.sipinfo.Index sipInfo() {
        return new com.ringcentral.paths.restapi.account.device.sipinfo.Index(this);
    }

}
