package com.ringcentral.paths.restapi.account.directory.federation;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.directory.Index parent;
public Index(com.ringcentral.paths.restapi.account.directory.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/federation";
        }
        /**
         * Returns information on a federation and associated accounts.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/directory/federation
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         * User Permission: ReadCompanyInfo
         */
  public FederationResource get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), FederationResource.class);
    }
}