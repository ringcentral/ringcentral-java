package com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.insights;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetRecordingInsightsParameters;
import com.ringcentral.definitions.RecordingInsights;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.Index parent;

    public Index(com.ringcentral.paths.ai.ringsense.v1.public1.accounts.domains.records.Index parent) {
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
     * Returns the insights of a call recording
     * HTTP Method: get
     * Endpoint: /ai/ringsense/v1/public/accounts/{accountId}/domains/{domain}/records/{sourceRecordId}/insights
     * Rate Limit Group: Light
     * App Permission: RingSense
     */
    public RecordingInsights get(GetRecordingInsightsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RecordingInsights.class);
    }

    public RecordingInsights get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
