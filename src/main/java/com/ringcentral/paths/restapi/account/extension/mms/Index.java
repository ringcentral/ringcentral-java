package com.ringcentral.paths.restapi.account.extension.mms;

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
        return parent.path() + "/mms";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates and sends a new media message or multiple messages. Sending MMS
     * messages simultaneously to different recipients is limited up to 50
     * requests per minute; relevant for all client applications.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/mms
     * Rate Limit Group: Medium
     * App Permission: SMS
     * User Permission: OutboundSMS
     */
    public GetSMSMessageInfoResponse post(CreateMMSMessage createMMSMessage) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createMMSMessage, null, com.ringcentral.ContentType.MULTIPART);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetSMSMessageInfoResponse.class);
    }
}
