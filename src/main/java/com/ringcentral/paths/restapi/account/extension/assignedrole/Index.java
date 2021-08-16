package com.ringcentral.paths.restapi.account.extension.assignedrole;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AssignedRolesResource;
import com.ringcentral.definitions.ListUserAssignedRolesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    {
        return new com.ringcentral.paths.restapi.account.extension.assignedrole.
        default.Index(this);
    }

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/assigned-role";
    }

    /**
     * Returns the list of roles assigned to the current extension.
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

    public com.ringcentral.paths.restapi.account.extension.assignedrole .default.Index default()

    /**
     * Updates the list of assigned roles for the current user.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/assigned-role
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     */
    public AssignedRolesResource put(AssignedRolesResource assignedRolesResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), assignedRolesResource, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AssignedRolesResource.class);
    }

}
