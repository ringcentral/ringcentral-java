package com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.timeline;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.PerformanceCallsTimelineRequest;
import com.ringcentral.definitions.PerformanceCallsTimelineResponse;
import com.ringcentral.definitions.PerformanceReportCallsTimelineParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.Index parent;

    public Index(com.ringcentral.paths.analytics.phone.performance.v1.accounts.calls.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/timeline";
    }

    /**
     * Returns call performance data aggregated for specified time intervals.
     * HTTP Method: post
     * Endpoint: /analytics/phone/performance/v1/accounts/{accountId}/calls/timeline
     * Rate Limit Group: Light
     */
    public PerformanceCallsTimelineResponse post(PerformanceCallsTimelineRequest performanceCallsTimelineRequest, PerformanceReportCallsTimelineParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), performanceCallsTimelineRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PerformanceCallsTimelineResponse.class);
    }

    public PerformanceCallsTimelineResponse post(PerformanceCallsTimelineRequest performanceCallsTimelineRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(performanceCallsTimelineRequest, null);
    }
}
