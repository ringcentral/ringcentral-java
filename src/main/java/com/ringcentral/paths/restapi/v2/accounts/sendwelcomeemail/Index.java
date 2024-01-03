package com.ringcentral.paths.restapi.v2.accounts.sendwelcomeemail;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SendWelcomeEmailV2Request;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/send-welcome-email";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Sends/resends welcome email to the system user of confirmed account
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/send-welcome-email
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: Users
     */
    public String post(SendWelcomeEmailV2Request sendWelcomeEmailV2Request) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), sendWelcomeEmailV2Request, null);
        return rb.string();
    }
}
