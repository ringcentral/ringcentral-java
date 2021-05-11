package com.ringcentral.paths.restapi.account.greeting;

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
            return parent.path() + "/greeting";
        }
        /**
         * Creates a custom company greeting.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/greeting
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: ReadUserInfo
         */
  public CustomCompanyGreetingInfo post(CreateCompanyGreetingRequest createCompanyGreetingRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), createCompanyGreetingRequest, null, com.ringcentral.ContentType.MULTIPART);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomCompanyGreetingInfo.class);
    }
}