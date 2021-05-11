package com.ringcentral.paths.restapi.account.activecalls;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.Index parent;
public Index(com.ringcentral.paths.restapi.account.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/active-calls";
        }
        /**
         * Returns records of all calls that are in progress, ordered by start time in descending order.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/active-calls
         * Rate Limit Group: Heavy
         * App Permission: ReadCallLog
         * User Permission: ReadCallLog
         */
  public CompanyActiveCallsResponse get(ListCompanyActiveCallsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyActiveCallsResponse.class);
    }
    public CompanyActiveCallsResponse get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}