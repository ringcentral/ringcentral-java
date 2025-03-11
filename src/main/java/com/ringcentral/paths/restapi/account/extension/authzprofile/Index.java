package com.ringcentral.paths.restapi.account.extension.authzprofile;

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
        return parent.path() + "/authz-profile";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of user permissions granted at authorization procedure.
     * Please note: Some permissions may be restricted by extension type.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/authz-profile
     * Rate Limit Group: Medium
     */
    public AuthProfileResource get(ReadAuthorizationProfileParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AuthProfileResource.class);
    }

    public AuthProfileResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    public com.ringcentral.paths.restapi.account.extension.authzprofile.check.Index check() {
        return new com.ringcentral.paths.restapi.account.extension.authzprofile.check.Index(this);
    }

}
