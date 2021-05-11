package com.ringcentral.paths.restapi.account.callrecording.extensions;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallRecordingExtensions;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.callrecording.Index parent;

    public Index(com.ringcentral.paths.restapi.account.callrecording.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/extensions";
    }

    /**
     * Returns the list of extensions to be recorded.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recording/extensions
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyInfo
     */
    public CallRecordingExtensions get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallRecordingExtensions.class);
    }
}
