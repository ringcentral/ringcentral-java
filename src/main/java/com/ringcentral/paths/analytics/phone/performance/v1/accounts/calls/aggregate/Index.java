package com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.aggregate;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AggregatePerformanceReportCallsParameters;
import com.ringcentral.definitions.PerformanceCallsAggregatesRequest;
import com.ringcentral.definitions.PerformanceCallsAggregatesResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.Index parent;

    public Index(com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/aggregate";
    }

    /**
     * Returns a call performance report aggregated by parameters specified.
     * HTTP Method: post
     * Endpoint: /analytics/phone/performance/v1/accounts/{accountId}/calls/aggregate
     * Rate Limit Group: Light
     */
    public PerformanceCallsAggregatesResponse post(PerformanceCallsAggregatesRequest performanceCallsAggregatesRequest, AggregatePerformanceReportCallsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), performanceCallsAggregatesRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PerformanceCallsAggregatesResponse.class);
    }

    public PerformanceCallsAggregatesResponse post(PerformanceCallsAggregatesRequest performanceCallsAggregatesRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(performanceCallsAggregatesRequest, null);
    }
}
