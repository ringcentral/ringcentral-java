package com.ringcentral.paths.analytics.calls.v1.accounts.timeline.fetch;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AnalyticsCallsTimelineFetchParameters;
import com.ringcentral.definitions.TimelineRequest;
import com.ringcentral.definitions.TimelineResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.analytics.calls.v1.accounts.timeline.Index parent;

    public Index(com.ringcentral.paths.analytics.calls.v1.accounts.timeline.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/fetch";
    }

    /**
     * Returns time-value data aggregations filtered by parameters specified
     * HTTP Method: post
     * Endpoint: /analytics/calls/v1/accounts/{accountId}/timeline/fetch
     * Rate Limit Group: Light
     * App Permission: Analytics
     */
    public TimelineResponse post(TimelineRequest timelineRequest, AnalyticsCallsTimelineFetchParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), timelineRequest, queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TimelineResponse.class);
    }

    public TimelineResponse post(TimelineRequest timelineRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(timelineRequest, null);
    }
}
