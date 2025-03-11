package com.ringcentral.paths.restapi.account.userrole.default1;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.userrole.Index parent;

    public Index(com.ringcentral.paths.restapi.account.userrole.Index parent) {
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
     * Returns the default user role of the current account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/default
     * Rate Limit Group: Light
     * App Permission: RoleManagement
     * User Permission: Roles
     */
    public DefaultUserRole get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DefaultUserRole.class);
    }

    /**
     * Updates the account default user role.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/default
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: Roles
     */
    public DefaultUserRole put(DefaultUserRoleRequest defaultUserRoleRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), defaultUserRoleRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DefaultUserRole.class);
    }
}
