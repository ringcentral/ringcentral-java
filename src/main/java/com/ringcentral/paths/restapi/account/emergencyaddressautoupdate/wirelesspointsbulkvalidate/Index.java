package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.wirelesspointsbulkvalidate;

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
            return parent.path() + "/wireless-points-bulk-validate";
        }
        /**
         * Validates wireless points before creation or update. The maximum
 * number of wireless points per request is 10 000.
 * 
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/wireless-points-bulk-validate
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         * User Permission: ConfigureEmergencyMaps
         */
  public ValidateMultipleWirelessPointsResponse post(ValidateMultipleWirelessPointsRequest validateMultipleWirelessPointsRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), validateMultipleWirelessPointsRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ValidateMultipleWirelessPointsResponse.class);
    }
}