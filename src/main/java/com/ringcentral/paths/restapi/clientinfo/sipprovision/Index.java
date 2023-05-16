package com.ringcentral.paths.restapi.clientinfo.sipprovision;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateSipRegistrationRequest;
import com.ringcentral.definitions.CreateSipRegistrationResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.clientinfo.Index parent;

    public Index(com.ringcentral.paths.restapi.clientinfo.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/sip-provision";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Creates SIP registration of a device/application (WebPhone, Mobile, Softphone).
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/client-info/sip-provision
     * Rate Limit Group: Heavy
     * App Permission: VoipCalling
     */
    public CreateSipRegistrationResponse post(CreateSipRegistrationRequest createSipRegistrationRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), createSipRegistrationRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CreateSipRegistrationResponse.class);
    }
}
