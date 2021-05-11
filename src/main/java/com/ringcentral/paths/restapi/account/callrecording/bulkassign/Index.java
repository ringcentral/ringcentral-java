package com.ringcentral.paths.restapi.account.callrecording.bulkassign;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.callrecording.Index parent;
public Index(com.ringcentral.paths.restapi.account.callrecording.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/bulk-assign";
        }
        /**
         * Creates or updates the list of extensions to be recorded.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recording/bulk-assign
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         * User Permission: ReadCompanyInfo
         */
  public String post(BulkAccountCallRecordingsResource bulkAccountCallRecordingsResource) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), bulkAccountCallRecordingsResource, null);
    return rb.string();
    }
}