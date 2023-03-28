package com.ringcentral.paths.restapi.account.sites.bulkassign;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SiteMembersBulkUpdate;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.sites.Index parent;

    public Index(com.ringcentral.paths.restapi.account.sites.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/bulk-assign";
    }

    /**
     * Assigns multiple sites to an account specified in path.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites/{siteId}/bulk-assign
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: Sites
     */
    public String post(SiteMembersBulkUpdate siteMembersBulkUpdate) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), siteMembersBulkUpdate, null);
        return rb.string();
    }
}
