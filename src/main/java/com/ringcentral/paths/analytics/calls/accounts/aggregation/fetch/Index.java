package com.ringcentral.paths.analytics.calls.accounts.aggregation.fetch;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.analytics.calls.accounts.aggregation.Index parent;
public Index(com.ringcentral.paths.analytics.calls.accounts.aggregation.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/fetch";
        }
        /**
         * Returns call aggregations filtered by parameters specified
         * HTTP Method: post
         * Endpoint: /analytics/calls/{version}/accounts/{accountId}/aggregation/fetch
         * Rate Limit Group: Light
         * App Permission: Analytics
         */
  public AggregationResponse post(AggregationRequest aggregationRequest, AnalyticsCallsAggregationFetchParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), aggregationRequest, queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), AggregationResponse.class);
    }
    public AggregationResponse post(AggregationRequest aggregationRequest) throws com.ringcentral.RestException, java.io.IOException
    {
      return this.post(aggregationRequest, null);
    }
}