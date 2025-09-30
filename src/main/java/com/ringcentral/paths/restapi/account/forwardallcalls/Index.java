package com.ringcentral.paths.restapi.account.forwardallcalls;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ForwardAllCompanyCallsInfo;
import com.ringcentral.definitions.ForwardAllCompanyCallsRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/forward-all-calls";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns information about *Forward All Company Calls* feature setting.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/forward-all-calls
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyAnsweringRules
     */
    public ForwardAllCompanyCallsInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ForwardAllCompanyCallsInfo.class);
    }

    /**
     * Updates *Forward All Company Calls* feature setting.
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/forward-all-calls
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyAnsweringRules
     */
    public ForwardAllCompanyCallsInfo patch(ForwardAllCompanyCallsRequest forwardAllCompanyCallsRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), forwardAllCompanyCallsRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ForwardAllCompanyCallsInfo.class);
    }
}
