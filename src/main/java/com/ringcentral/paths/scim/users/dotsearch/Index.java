package com.ringcentral.paths.scim.users.dotsearch;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ScimSearchRequest;
import com.ringcentral.definitions.ScimUserSearchResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.scim.users.Index parent;

    public Index(com.ringcentral.paths.scim.users.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/.search";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of users satisfying search criteria
     * HTTP Method: post
     * Endpoint: /scim/{version}/Users/dotSearch
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public ScimUserSearchResponse post(ScimSearchRequest scimSearchRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), scimSearchRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimUserSearchResponse.class);
    }
}
