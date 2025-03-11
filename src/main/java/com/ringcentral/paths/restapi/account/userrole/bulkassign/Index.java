package com.ringcentral.paths.restapi.account.userrole.bulkassign;

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
        return parent.path() + "/bulk-assign";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Assigns multiple user roles.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/{roleId}/bulk-assign
     * Rate Limit Group: Heavy
     * App Permission: RoleManagement
     * User Permission: EditUserRoles
     */
    public String post(BulkRoleAssignResource bulkRoleAssignResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), bulkRoleAssignResource, null);
        return rb.string();
    }
}
