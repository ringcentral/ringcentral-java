package com.ringcentral.paths.restapi.dictionary.userrole;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;
    public String roleId;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String roleId) {
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
     * Returns a list of standard user roles.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/user-role
     * Rate Limit Group: Light
     */
    public RolesCollectionResource list(ListStandardUserRoleParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RolesCollectionResource.class);
    }

    public RolesCollectionResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns a standard user role by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/user-role/{roleId}
     * Rate Limit Group: Light
     */
    public RoleResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (roleId == null) {
            throw new IllegalArgumentException("Parameter roleId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RoleResource.class);
    }
}
