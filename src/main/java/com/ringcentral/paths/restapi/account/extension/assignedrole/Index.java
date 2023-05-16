package com.ringcentral.paths.restapi.account.extension.assignedrole;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AssignedRolesResource;
import com.ringcentral.definitions.ListUserAssignedRolesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
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
     * Returns a list of roles assigned to the current extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assigned-role
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public AssignedRolesResource get(ListUserAssignedRolesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AssignedRolesResource.class);
    }

    public AssignedRolesResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Updates a list of roles assigned to the current user.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assigned-role
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: EditAssignedRoles
     */
    public AssignedRolesResource put(AssignedRolesResource assignedRolesResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), assignedRolesResource, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AssignedRolesResource.class);
    }

    public com.ringcentral.paths.restapi.account.extension.assignedrole.default1.Index default1() {
        return new com.ringcentral.paths.restapi.account.extension.assignedrole.default1.Index(this);
    }

}
