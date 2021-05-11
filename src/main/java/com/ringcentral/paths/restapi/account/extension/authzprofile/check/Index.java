package com.ringcentral.paths.restapi.account.extension.authzprofile.check;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AuthProfileCheckResource;
import com.ringcentral.definitions.CheckUserPermissionParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.authzprofile.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.authzprofile.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/check";
    }

    /**
     * Checks if a certain user permission is activated for a particular extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/authz-profile/check
     * Rate Limit Group: Light
     */
    public AuthProfileCheckResource get(CheckUserPermissionParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AuthProfileCheckResource.class);
    }

    public AuthProfileCheckResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
