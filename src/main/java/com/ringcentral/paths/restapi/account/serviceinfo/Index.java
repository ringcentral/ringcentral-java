package com.ringcentral.paths.restapi.account.serviceinfo;

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
            return parent.path() + "/service-info";
        }
        /**
         * Returns the information about service plan, available features
 * and limitations for a particular RingCentral customer account.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/service-info
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         * User Permission: ReadServicePlanInfo
         */
  public AccountServiceInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountServiceInfo.class);
    }
}