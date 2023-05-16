package com.ringcentral.paths.restapi.account.ivrprompts.content;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.ivrprompts.Index parent;

    public Index(com.ringcentral.paths.restapi.account.ivrprompts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/content";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns media content of an IVR prompt by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-prompts/{promptId}/content
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyGreetings
     */
    public byte[] get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.bytes();
    }
}
