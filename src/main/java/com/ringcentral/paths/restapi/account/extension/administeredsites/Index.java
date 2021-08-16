package com.ringcentral.paths.restapi.account.extension.administeredsites;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.BusinessSiteCollectionRequest;
import com.ringcentral.definitions.BusinessSiteCollectionResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/administered-sites";
    }

    /**
     * Returns the list of sites administered by the current user.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/administered-sites
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public String get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.string();
    }

    /**
     * Updates user administered sites. Note: only IDs of records are used for update.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/administered-sites
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditAssignedRoles
     */
    public BusinessSiteCollectionResource put(BusinessSiteCollectionRequest businessSiteCollectionRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), businessSiteCollectionRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BusinessSiteCollectionResource.class);
    }
}
