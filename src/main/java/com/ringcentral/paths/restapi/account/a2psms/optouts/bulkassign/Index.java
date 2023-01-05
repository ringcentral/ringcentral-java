package com.ringcentral.paths.restapi.account.a2psms.optouts.bulkassign;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.a2psms.optouts.Index parent;
public Index(com.ringcentral.paths.restapi.account.a2psms.optouts.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/bulk-assign";
        }
        /**
         * Adds multiple opt-outs and/or opt-ins for the specified sender number and a set of recipient numbers.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/a2p-sms/opt-outs/bulk-assign
         * Rate Limit Group: Light
         * App Permission: A2PSMS
         */
  public OptOutBulkAssignResponse post(OptOutBulkAssignRequest optOutBulkAssignRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), optOutBulkAssignRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), OptOutBulkAssignResponse.class);
    }
}