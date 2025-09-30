package com.ringcentral.paths.scim.schemas;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ScimSchemaResponse;
import com.ringcentral.definitions.ScimSchemaSearchResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.scim.Index parent;
    public String uri;

    public Index(com.ringcentral.paths.scim.Index parent, String uri) {
        this.parent = parent;
        this.rc = parent.rc;
        this.uri = uri;
    }

    public String path(Boolean withParameter) {
        if (withParameter && uri != null) {
            return parent.path() + "/Schemas/" + uri;
        }
        return parent.path() + "/Schemas";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of schemas
     * HTTP Method: get
     * Endpoint: /scim/{version}/Schemas
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public ScimSchemaSearchResponse list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimSchemaSearchResponse.class);
    }

    /**
     * Returns SCIM schema
     * HTTP Method: get
     * Endpoint: /scim/{version}/Schemas/{uri}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public ScimSchemaResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (uri == null) {
            throw new IllegalArgumentException("Parameter uri cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimSchemaResponse.class);
    }
}
