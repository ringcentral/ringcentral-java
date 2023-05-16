package com.ringcentral.paths.restapi.account.assignedrole;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ExtensionWithRolesCollectionResource;
import com.ringcentral.definitions.ListAssignedRolesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/assigned-role";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of roles assigned to the current account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/assigned-role
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadAssignedRoles
     */
    public ExtensionWithRolesCollectionResource get(ListAssignedRolesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ExtensionWithRolesCollectionResource.class);
    }

    public ExtensionWithRolesCollectionResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
