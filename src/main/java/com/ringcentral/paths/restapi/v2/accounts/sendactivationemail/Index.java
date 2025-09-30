package com.ringcentral.paths.restapi.v2.accounts.sendactivationemail;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/send-activation-email";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Sends/resends activation email to the system user of unconfirmed account.
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/send-activation-email
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: AccountAdministration
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
