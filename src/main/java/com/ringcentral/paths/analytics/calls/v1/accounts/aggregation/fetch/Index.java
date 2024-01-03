package com.ringcentral.paths.analytics.calls.v1.accounts.aggregation.fetch;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AggregationRequest;
import com.ringcentral.definitions.AggregationResponse;
import com.ringcentral.definitions.AnalyticsCallsAggregationFetchParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.calls.v1.accounts.aggregation.Index parent;

    public Index(com.ringcentral.paths.analytics.calls.v1.accounts.aggregation.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/fetch";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns call aggregations filtered by parameters specified
     * HTTP Method: post
     * Endpoint: /analytics/calls/v1/accounts/{accountId}/aggregation/fetch
     * Rate Limit Group: Light
     * App Permission: Analytics
     */
    public AggregationResponse post(AggregationRequest aggregationRequest, AnalyticsCallsAggregationFetchParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), aggregationRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AggregationResponse.class);
    }

    public AggregationResponse post(AggregationRequest aggregationRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(aggregationRequest, null);
    }
}
