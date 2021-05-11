package com.ringcentral.paths.restapi.account.extension.authzprofile;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AuthProfileResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/authz-profile";
    }

    /**
     * Returns a list of user permissions granted at authorization procedure. Please note: Some permissions may be restricted by extension type.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/authz-profile
     * Rate Limit Group: Medium
     */
    public AuthProfileResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AuthProfileResource.class);
    }

    public com.ringcentral.paths.restapi.account.extension.authzprofile.check.Index check() {
        return new com.ringcentral.paths.restapi.account.extension.authzprofile.check.Index(this);
    }

}
