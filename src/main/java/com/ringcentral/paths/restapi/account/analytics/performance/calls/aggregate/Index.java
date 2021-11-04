package com.ringcentral.paths.restapi.account.analytics.performance.calls.aggregate;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.PerformanceCallsAggregatesRequest;
import com.ringcentral.definitions.PerformanceCallsAggregatesResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.analytics.performance.calls.Index parent;

    public Index(com.ringcentral.paths.restapi.account.analytics.performance.calls.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/aggregate";
    }

    /**
     * Returns a call performance report aggregated by parameters specified.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/analytics/performance/calls/aggregate
     * Rate Limit Group: Light
     */
    public PerformanceCallsAggregatesResponse post(PerformanceCallsAggregatesRequest performanceCallsAggregatesRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), performanceCallsAggregatesRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PerformanceCallsAggregatesResponse.class);
    }
}
