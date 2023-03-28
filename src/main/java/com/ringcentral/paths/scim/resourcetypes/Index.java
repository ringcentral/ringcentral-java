package com.ringcentral.paths.scim.resourcetypes;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ScimResourceTypeResponse;
import com.ringcentral.definitions.ScimResourceTypeSearchResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.scim.Index parent;
    public String type;

    public Index(com.ringcentral.paths.scim.Index parent, String type) {
        this.parent = parent;
        this.rc = parent.rc;
        this.type = type;
    }

    public String path(Boolean withParameter) {
        if (withParameter && type != null) {
            return parent.path() + "/ResourceTypes/" + type;
        }
        return parent.path() + "/ResourceTypes";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of supported SCIM resource types
     * HTTP Method: get
     * Endpoint: /scim/{version}/ResourceTypes
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public ScimResourceTypeSearchResponse list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimResourceTypeSearchResponse.class);
    }

    /**
     * Returns resource type by ID
     * HTTP Method: get
     * Endpoint: /scim/{version}/ResourceTypes/{type}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public ScimResourceTypeResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (type == null) {
            throw new IllegalArgumentException("Parameter type cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimResourceTypeResponse.class);
    }
}
