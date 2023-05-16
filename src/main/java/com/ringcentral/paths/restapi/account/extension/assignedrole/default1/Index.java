package com.ringcentral.paths.restapi.account.extension.assignedrole.default1;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AssignedRolesResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.assignedrole.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.assignedrole.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/default";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Assigns the default role to the currently logged-in user extension.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assigned-role/default
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: Users
     */
    public AssignedRolesResource put() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AssignedRolesResource.class);
    }
}
