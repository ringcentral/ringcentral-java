package com.ringcentral.paths.restapi.account.sites.ivr;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.sites.Index parent;

    public Index(com.ringcentral.paths.restapi.account.sites.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/ivr";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns IVR settings for a site specified in path.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites/{siteId}/ivr
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public SiteIVRSettings get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SiteIVRSettings.class);
    }

    /**
     * Updates IVR settings for a site specified in path.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/sites/{siteId}/ivr
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: Sites
     */
    public SiteIVRSettings put(SiteIVRSettingsUpdate siteIVRSettingsUpdate) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), siteIVRSettingsUpdate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SiteIVRSettings.class);
    }
}
