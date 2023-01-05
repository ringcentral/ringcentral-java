package com.ringcentral.paths.restapi.account.extension.overflowsettings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.Index parent;
public Index(com.ringcentral.paths.restapi.account.extension.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/overflow-settings";
        }
        /**
         * Returns overflow settings for a call queue specified in path.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{callQueueId}/overflow-settings
         * Rate Limit Group: Heavy
         * App Permission: ReadAccounts
         * User Permission: CallQueueToCallQueue
         */
  public CallQueueOverflowSettings get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueueOverflowSettings.class);
    }

        /**
         * Updates overflow settings for a call queue specified in path.
 * 
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{callQueueId}/overflow-settings
         * Rate Limit Group: Heavy
         * App Permission: EditExtensions
         * User Permission: CallQueueToCallQueue
         */
  public CallQueueOverflowSettings put(CallQueueOverflowSettingsRequestResource callQueueOverflowSettingsRequestResource) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.put(this.path(), callQueueOverflowSettingsRequestResource, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallQueueOverflowSettings.class);
    }
}