package com.ringcentral.paths.restapi.account.phonenumber;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountPhoneNumbers;
import com.ringcentral.definitions.CompanyPhoneNumberInfo;
import com.ringcentral.definitions.ListAccountPhoneNumbersParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String phoneNumberId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String phoneNumberId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.phoneNumberId = phoneNumberId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && phoneNumberId != null) {
            return parent.path() + "/phone-number/" + phoneNumberId;
        }
        return parent.path() + "/phone-number";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of phone numbers assigned to RingCentral customer
     * account. Both company-level and extension-level numbers are returned.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/phone-number
     * Rate Limit Group: Heavy
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyPhoneNumbers
     */
    public AccountPhoneNumbers list(ListAccountPhoneNumbersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountPhoneNumbers.class);
    }

    public AccountPhoneNumbers list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns phone number(s) belonging to a certain account or extension by phoneNumberId(s).
     * [Batch request syntax](https://developers.ringcentral.com/api-reference/Batch-Requests) is supported.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/phone-number/{phoneNumberId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyPhoneNumbers
     */
    public CompanyPhoneNumberInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (phoneNumberId == null) {
            throw new IllegalArgumentException("Parameter phoneNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyPhoneNumberInfo.class);
    }
}
