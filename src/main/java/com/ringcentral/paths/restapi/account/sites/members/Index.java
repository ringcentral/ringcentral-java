package com.ringcentral.paths.restapi.account.sites.members;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SiteMembersList;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.sites.Index parent;

    public Index(com.ringcentral.paths.restapi.account.sites.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/members";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns members of a site specified in path.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites/{siteId}/members
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public SiteMembersList get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SiteMembersList.class);
    }
}
