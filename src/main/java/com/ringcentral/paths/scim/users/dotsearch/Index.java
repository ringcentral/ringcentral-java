package com.ringcentral.paths.scim.users.dotsearch;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SearchRequest;
import com.ringcentral.definitions.UserSearchResponse;

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

    /**
     * Search/List Users
     * HTTP Method: post
     * Endpoint: /scim/{version}/Users/dotSearch
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public UserSearchResponse post(SearchRequest searchRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), searchRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserSearchResponse.class);
    }
}
