package com.ringcentral.paths.restapi.v2.accounts.sms.consents.export;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.v2.accounts.sms.consents.Index parent;
public Index(com.ringcentral.paths.restapi.v2.accounts.sms.consents.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/export";
        }
        public String path(Boolean withParameter)
        {
            return path();
        }
        
        /**
         * Returns a list of account-level SMS consent records for opted-out and/or opted-in phone numbers in CSV format.
 * The following columns will be included in the resulted CSV file:
 * 
 * | Column name           | Data type | Description                                                      |
 * |-----------------------|-----------|------------------------------------------------------------------|
 * | External Party Number | string    | Sender&#039;s number in E.164 format                                  |
 * | Internal Party Number | string    | Recipient&#039;s number in E.164 format                               |
 * | Consent Status        | string    | Consent status, either &quot;OptOut&quot; or &quot;OptIn&quot;                       |
 * | Source                | string    | Source of the consent record                                     |
 * | Coverage              | string    | Coverage of this consent record (Account is returned as Company) |
 * | Campaign Type         | string    | Campaign type for this consent record                            |
 * | Notes                 | string    | Notes and comments regarding this consent record                 |
 * | Last Modified Time    | string    | Last Modified Time in ISO 8601 format                            |
 * 
         * HTTP Method: get
         * Endpoint: /restapi/v2/accounts/{accountId}/sms/consents/export
         * Rate Limit Group: Light
         * App Permission: SMS
         */
  public String get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return rb.string();
    }
}