package com.ringcentral.paths.restapi.account.extension.companypager;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/company-pager";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates and sends an internal text message (company pager message).
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/company-pager
     * Rate Limit Group: Medium
     * App Permission: InternalMessages
     * User Permission: InternalSMS
     */
    public GetInternalTextMessageInfoResponse post(CreateInternalTextMessageRequest createInternalTextMessageRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createInternalTextMessageRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetInternalTextMessageInfoResponse.class);
    }
}
