package com.ringcentral.paths.restapi.dictionary.permission;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListPermissionsParameters;
import com.ringcentral.definitions.PermissionCollectionResource;
import com.ringcentral.definitions.PermissionResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;
    public String permissionId;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String permissionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.permissionId = permissionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && permissionId != null) {
            return parent.path() + "/permission/" + permissionId;
        }
        return parent.path() + "/permission";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of extension user permissions.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/permission
     * Rate Limit Group: Light
     */
    public PermissionCollectionResource list(ListPermissionsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PermissionCollectionResource.class);
    }

    public PermissionCollectionResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns a user permission by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/permission/{permissionId}
     * Rate Limit Group: Light
     */
    public PermissionResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (permissionId == null) {
            throw new IllegalArgumentException("Parameter permissionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PermissionResource.class);
    }
}
