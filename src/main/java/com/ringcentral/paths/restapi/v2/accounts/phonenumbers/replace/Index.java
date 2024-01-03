package com.ringcentral.paths.restapi.v2.accounts.phonenumbers.replace;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountPhoneNumberInfo;
import com.ringcentral.definitions.ReplacePhoneNumberRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.phonenumbers.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.phonenumbers.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/replace";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Replaces (swaps) phone numbers from Inventory with the main, company, direct or company fax numbers.
     * This method is used to replace temporary numbers when the porting process is complete.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/phone-numbers/{phoneNumberId}/replace
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyPhoneNumbers
     */
    public AccountPhoneNumberInfo post(ReplacePhoneNumberRequest replacePhoneNumberRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), replacePhoneNumberRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountPhoneNumberInfo.class);
    }
}
