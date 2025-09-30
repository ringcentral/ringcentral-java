package com.ringcentral.paths.restapi.account.extension.phonenumber.smsconfiguration;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SmsConfigurationResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.phonenumber.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.phonenumber.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/sms-configuration";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns SMS configuration for the specified phone number of the extension.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/phone-number/{phoneNumberId}/sms-configuration
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public SmsConfigurationResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SmsConfigurationResource.class);
    }
}
