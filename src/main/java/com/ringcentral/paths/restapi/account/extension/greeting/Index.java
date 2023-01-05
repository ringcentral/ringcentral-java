package com.ringcentral.paths.restapi.account.extension.greeting;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.Index parent;
public String greetingId;
public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String greetingId)
      {
this.parent = parent;
this.rc = parent.rc;
this.greetingId = greetingId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && greetingId != null)
            {
                return parent.path() + "/greeting/" + greetingId;
            }
            return parent.path() + "/greeting";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Creates custom greeting for an extension user.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/greeting
         * Rate Limit Group: Heavy
         * App Permission: EditExtensions
         * User Permission: EditUserAnsweringRules
         */
  public CustomUserGreetingInfo post(CreateCustomUserGreetingRequest createCustomUserGreetingRequest, CreateCustomUserGreetingParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(false), createCustomUserGreetingRequest, queryParams, com.ringcentral.ContentType.MULTIPART);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomUserGreetingInfo.class);
    }
    public CustomUserGreetingInfo post(CreateCustomUserGreetingRequest createCustomUserGreetingRequest) throws com.ringcentral.RestException, java.io.IOException
    {
      return this.post(createCustomUserGreetingRequest, null);
    }

        /**
         * Returns a custom user greeting by ID.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/greeting/{greetingId}
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         * User Permission: ReadUserInfo
         */
  public CustomUserGreetingInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (greetingId == null)
    {
        throw new IllegalArgumentException("Parameter greetingId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomUserGreetingInfo.class);
    }
}