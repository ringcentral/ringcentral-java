package com.ringcentral.paths.restapi.account.extension.businesshours;

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
            return parent.path() + "/business-hours";
        }
        /**
         * Returns the user business hours schedule. Business hours (and After hours - all the remaining time) schedules are commonly used for setting call handling rules - `business-hours-rule` and `after-hours-rule` correspondingly. **Please note:** If the user business hours are set to &#039;Custom hours&#039; then a particular schedule is returned; however if set to &#039;24 hours/7 days a week&#039; the schedule will be empty.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/business-hours
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         * User Permission: ReadExtensions
         */
  public GetUserBusinessHoursResponse get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GetUserBusinessHoursResponse.class);
    }

        /**
         * Updates the user business hours schedule.
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/business-hours
         * Rate Limit Group: Medium
         * App Permission: EditExtensions
         * User Permission: EditUserAnsweringRules
         */
  public UserBusinessHoursUpdateResponse put(UserBusinessHoursUpdateRequest userBusinessHoursUpdateRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.put(this.path(), userBusinessHoursUpdateRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UserBusinessHoursUpdateResponse.class);
    }
}