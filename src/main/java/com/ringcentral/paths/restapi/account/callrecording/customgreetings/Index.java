package com.ringcentral.paths.restapi.account.callrecording.customgreetings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.callrecording.Index parent;
public String greetingId;
public Index(com.ringcentral.paths.restapi.account.callrecording.Index parent, String greetingId)
      {
this.parent = parent;
this.rc = parent.rc;
this.greetingId = greetingId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && greetingId != null)
            {
                return parent.path() + "/custom-greetings/" + greetingId;
            }
            return parent.path() + "/custom-greetings";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns call recording custom greetings.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recording/custom-greetings
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         * User Permission: ReadCompanyInfo
         */
  public CallRecordingCustomGreetings get(ListCallRecordingCustomGreetingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallRecordingCustomGreetings.class);
    }
    public CallRecordingCustomGreetings get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }

        /**
         * Deletes call recording custom greetings.
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recording/custom-greetings
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: EditCompanyInfo
         */
  public String deleteAll() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.delete(this.path(false), null);
    return rb.string();
    }

        /**
         * Deletes call recording custom greeting(s).
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recording/custom-greetings/{greetingId}
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: EditCompanyInfo
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (greetingId == null)
    {
        throw new IllegalArgumentException("Parameter greetingId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }
}