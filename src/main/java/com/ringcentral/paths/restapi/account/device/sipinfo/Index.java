package com.ringcentral.paths.restapi.account.device.sipinfo;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SipInfoResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.device.Index parent;

    public Index(com.ringcentral.paths.restapi.account.device.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/sip-info";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns device SIP information.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/device/{deviceId}/sip-info
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyDevices
     */
    public SipInfoResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SipInfoResource.class);
    }
}
