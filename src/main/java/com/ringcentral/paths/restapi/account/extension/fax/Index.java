package com.ringcentral.paths.restapi.account.extension.fax;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateFaxMessageRequest;
import com.ringcentral.definitions.FaxResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/fax";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates and sends/resends a fax message. Resend can be implemented
     * if sending has failed. Fax attachment size (both single and total) is
     * limited to 50Mb.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/fax
     * Rate Limit Group: Heavy
     * App Permission: Faxes
     * User Permission: OutboundFaxes
     */
    public FaxResponse post(CreateFaxMessageRequest createFaxMessageRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createFaxMessageRequest, null, com.ringcentral.ContentType.MULTIPART);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), FaxResponse.class);
    }
}
