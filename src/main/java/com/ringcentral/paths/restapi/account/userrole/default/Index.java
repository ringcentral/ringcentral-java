package com.ringcentral.paths.restapi.account.userrole.

default;

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

    /**
     * Returns account default user role.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/default
     * Rate Limit Group: Light
     * App Permission: RoleManagement
     * User Permission: Roles
     */
    public String get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.string();
    }

    /**
     * Updates account default user role.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/default
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: Roles
     */
    public String put(DefaultUserRoleRequest defaultUserRoleRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), defaultUserRoleRequest, null);
        return rb.string();
    }
}
