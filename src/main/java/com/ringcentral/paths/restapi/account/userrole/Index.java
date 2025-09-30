package com.ringcentral.paths.restapi.account.userrole;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String roleId;

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
     * Returns a list of account user roles.
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
     * Creates a custom user role.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: EditUserRoles
     */
    public String post(RoleResource roleResource, CreateCustomRoleParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), roleResource, queryParams);
        return rb.string();
    }

    public String post(RoleResource roleResource) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(roleResource, null);
    }

    /**
     * Returns a user role assigned to the current account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/{roleId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadUserRoles
     */
    public RoleResource get(ReadUserRoleParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (roleId == null) {
            throw new IllegalArgumentException("Parameter roleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RoleResource.class);
    }

    public RoleResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Updates a user role assigned to the current account by ID.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/user-role/{roleId}
     * Rate Limit Group: Medium
     * App Permission: RoleManagement
     * User Permission: EditUserRoles
     */
    public RoleResource put(RoleResource roleResource, UpdateUserRoleParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (roleId == null) {
            throw new IllegalArgumentException("Parameter roleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), roleResource, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RoleResource.class);
    }

    public RoleResource put(RoleResource roleResource) throws com.ringcentral.RestException, java.io.IOException {
        return this.put(roleResource, null);
    }

    /**
     * Deletes a custom user role by ID.
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

    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(null);
    }

    public com.ringcentral.paths.restapi.account.userrole.default1.Index default1() {
        return new com.ringcentral.paths.restapi.account.userrole.default1.Index(this);
    }


    public com.ringcentral.paths.restapi.account.userrole.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.userrole.bulkassign.Index(this);
    }

}
