package com.ringcentral.paths.restapi.account.userrole;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.DeleteCustomRoleParameters;
import com.ringcentral.definitions.ListUserRolesParameters;
import com.ringcentral.definitions.RoleResource;
import com.ringcentral.definitions.RolesCollectionResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String roleId;

    {
        return new com.ringcentral.paths.restapi.account.userrole.
        default.Index(this);
    }

    public Index(com.ringcentral.paths.restapi.account.Index parent, String roleId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.roleId = roleId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && roleId != null) {
            return parent.path() + "/user-role/" + roleId;
        }
        return parent.path() + "/user-role";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of account user roles.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadUserRoles
     */
    public RolesCollectionResource list(ListUserRolesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RolesCollectionResource.class);
    }

    public RolesCollectionResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates custom user role.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: EditUserRoles
     */
    public String post(RoleResource roleResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), roleResource, null);
        return rb.string();
    }

    /**
     * Returns a user role on the current account by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/{roleId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadUserRoles
     */
    public RoleResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (roleId == null) {
            throw new IllegalArgumentException("Parameter roleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RoleResource.class);
    }

    /**
     * Updates a user role on the current account by ID.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/{roleId}
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: EditUserRoles
     */
    public String put(RoleResource roleResource) throws com.ringcentral.RestException, java.io.IOException {
        if (roleId == null) {
            throw new IllegalArgumentException("Parameter roleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), roleResource, null);
        return rb.string();
    }

    /**
     * Deletes custom user role by ID.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/{roleId}
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: EditUserRoles
     */
    public String delete(DeleteCustomRoleParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (roleId == null) {
            throw new IllegalArgumentException("Parameter roleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), queryParams);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.account.userrole .default.Index default()

    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(null);
    }

    public com.ringcentral.paths.restapi.account.userrole.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.userrole.bulkassign.Index(this);
    }

}
