package com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.sessions.insights;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetSessionInsightsParameters;
import com.ringcentral.definitions.SessionsInsightsResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.sessions.Index parent;

    public Index(com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.sessions.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/insights";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the insights of all call recordings in a session
     * HTTP Method: get
     * Endpoint: /ai/ringsense/v1/public/accounts/{accountId}/domains/{domain}/sessions/{sourceSessionId}/insights
     * Rate Limit Group: Light
     * App Permission: RingSense
     */
    public SessionsInsightsResource get(GetSessionInsightsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SessionsInsightsResource.class);
    }

    public SessionsInsightsResource get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
