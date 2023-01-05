package com.ringcentral.paths.restapi.account.extension.phonenumber;

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
            return parent.path() + "/phone-number";
        }
        /**
         * Returns the list of phone numbers that are used by a particular extension,
 * can be filtered by the phone number type. The returned list contains all
 * numbers which are directly mapped to the given extension. Plus the features
 * and company-level numbers that may be used when performing different operations
 * on behalf of this extension.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/phone-number
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         * User Permission: ReadUserPhoneNumbers
         */
  public GetExtensionPhoneNumbersResponse get(ListExtensionPhoneNumbersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GetExtensionPhoneNumbersResponse.class);
    }
    public GetExtensionPhoneNumbersResponse get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}