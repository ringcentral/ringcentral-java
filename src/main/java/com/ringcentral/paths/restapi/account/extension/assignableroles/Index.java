package com.ringcentral.paths.restapi.account.extension.assignableroles;

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
        return parent.path() + "/assignable-roles";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of roles which can be assigned to a given extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assignable-roles
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     */
    public RolesCollectionResource get(ListOfAvailableForAssigningRolesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RolesCollectionResource.class);
    }

    public RolesCollectionResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
