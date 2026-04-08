package com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns.submitphonenumbers;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns.Index parent;
public Index(com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/submit-phone-numbers";
        }
        public String path(Boolean withParameter)
        {
            return path();
        }
        
        /**
         * Links phone number(s) to a TCR campaign.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/sms-registration-brands/{tcrBrandId}/campaigns/{tcrCampaignId}/submit-phone-numbers
         * Rate Limit Group: Light
         * App Permission: EditAccounts
         * User Permission: EditCompanyPhoneNumbers
         */
  public String post(AssignNumbersRequest assignNumbersRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), assignNumbersRequest, null);
    return rb.string();
    }
}