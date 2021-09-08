package com.ringcentral.paths.restapi.glip.companies;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipCompany;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;
    public String companyId;

    public Index(com.ringcentral.paths.restapi.glip.Index parent, String companyId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.companyId = companyId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && companyId != null) {
            return parent.path() + "/companies/" + companyId;
        }
        return parent.path() + "/companies";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns information about one or more companies by their IDs.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/companies/{companyId}
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipCompany get() throws com.ringcentral.RestException, java.io.IOException {
        if (companyId == null) {
            throw new IllegalArgumentException("Parameter companyId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipCompany.class);
    }
}
