package com.ringcentral.paths.restapi.account.sites;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateSiteRequest;
import com.ringcentral.definitions.SiteInfo;
import com.ringcentral.definitions.SiteUpdateRequest;
import com.ringcentral.definitions.SitesList;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String siteId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String siteId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.siteId = siteId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && siteId != null) {
            return parent.path() + "/sites/" + siteId;
        }
        return parent.path() + "/sites";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of sites for the specified account.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public SitesList list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SitesList.class);
    }

    /**
     * Creates a site for the specified account.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     */
    public SiteInfo post(CreateSiteRequest createSiteRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createSiteRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SiteInfo.class);
    }

    /**
     * Returns a site by ID.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites/{siteId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public SiteInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (siteId == null) {
            throw new IllegalArgumentException("Parameter siteId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SiteInfo.class);
    }

    /**
     * Updates a site specified in path.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites/{siteId}
     * Rate Limit Group: Light
     * App Permission: EditExtensions
     * User Permission: Sites
     */
    public SiteInfo put(SiteUpdateRequest siteUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (siteId == null) {
            throw new IllegalArgumentException("Parameter siteId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), siteUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SiteInfo.class);
    }

    /**
     * Deletes a site specified in path.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites/{siteId}
     * Rate Limit Group: Light
     * App Permission: EditAccounts
     * User Permission: Sites
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (siteId == null) {
            throw new IllegalArgumentException("Parameter siteId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.account.sites.ivr.Index ivr() {
        return new com.ringcentral.paths.restapi.account.sites.ivr.Index(this);
    }


    public com.ringcentral.paths.restapi.account.sites.members.Index members() {
        return new com.ringcentral.paths.restapi.account.sites.members.Index(this);
    }


    public com.ringcentral.paths.restapi.account.sites.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.sites.bulkassign.Index(this);
    }

}
