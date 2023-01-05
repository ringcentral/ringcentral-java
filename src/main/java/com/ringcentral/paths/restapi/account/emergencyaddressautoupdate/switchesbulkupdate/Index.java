package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.switchesbulkupdate;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;
public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/switches-bulk-update";
        }
        /**
         * Updates multiple switches in corporate map. The maximum number
 * of switches per request is 10 000; limitation for account is 10 000.
 * 
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/switches-bulk-update
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         * User Permission: ConfigureEmergencyMaps
         */
  public UpdateMultipleSwitchesResponse post(UpdateMultipleSwitchesRequest updateMultipleSwitchesRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), updateMultipleSwitchesRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UpdateMultipleSwitchesResponse.class);
    }
}