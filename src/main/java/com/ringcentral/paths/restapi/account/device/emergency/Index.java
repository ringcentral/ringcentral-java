package com.ringcentral.paths.restapi.account.device.emergency;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountDeviceUpdate;
import com.ringcentral.definitions.DeviceResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.device.Index parent;

    public Index(com.ringcentral.paths.restapi.account.device.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/emergency";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Updates account device emergency information.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/device/{deviceId}/emergency
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyDevices
     */
    public DeviceResource put(AccountDeviceUpdate accountDeviceUpdate) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), accountDeviceUpdate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DeviceResource.class);
    }
}
