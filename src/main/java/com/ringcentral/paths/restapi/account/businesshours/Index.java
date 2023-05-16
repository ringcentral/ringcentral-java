package com.ringcentral.paths.restapi.account.businesshours;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CompanyBusinessHours;
import com.ringcentral.definitions.CompanyBusinessHoursUpdateRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/business-hours";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the company business hours schedule. Business hours (and After hours - all the remaining time) schedules are commonly used for setting call handling rules - `business-hours-rule` and `after-hours-rule` correspondingly.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/business-hours
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyAnsweringRules
     */
    public CompanyBusinessHours get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyBusinessHours.class);
    }

    /**
     * Updates the company business hours schedule.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/business-hours
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserAnsweringRules
     */
    public CompanyBusinessHours put(CompanyBusinessHoursUpdateRequest companyBusinessHoursUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), companyBusinessHoursUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyBusinessHours.class);
    }
}
