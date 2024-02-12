package com.ringcentral.paths.restapi.v2.accounts.phonenumbers;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;
    public String phoneNumberId;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent, String phoneNumberId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.phoneNumberId = phoneNumberId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && phoneNumberId != null) {
            return parent.path() + "/phone-numbers/" + phoneNumberId;
        }
        return parent.path() + "/phone-numbers";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of phone numbers assigned to RingCentral customer
     * account. Both company-level and extension-level numbers are returned.
     * Conferencing numbers, hot desk and ELIN numbers are not returned.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/phone-numbers
     * Rate Limit Group: Heavy
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyPhoneNumbers
     */
    public AccountPhoneNumberList get(ListAccountPhoneNumbersV2Parameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountPhoneNumberList.class);
    }

    public AccountPhoneNumberList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * This method can only delete numbers that meet one of the following requirements:
     * - numbers that have `&quot;usageType&quot;: &quot;Inventory&quot;`
     * - `&quot;Forwarded&quot;` numbers
     * - `&quot;Forwarded Company&quot;` numbers
     * <p>
     * In other words, this method will not delete numbers which are in use on the account - extension direct numbers,
     * main number, etc. It is possible to indicate phone numbers to be deleted using their IDs or exact string values
     * in e.164 format. However, the same lookup method (by ID or by value) must be used for all numbers within the same API call.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/v2/accounts/{accountId}/phone-numbers
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyPhoneNumbers
     */
    public DeletePhoneNumbersResponse delete(DeletePhoneNumbersRequest deletePhoneNumbersRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.delete(this.path(false), deletePhoneNumbersRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DeletePhoneNumbersResponse.class);
    }

    /**
     * Assigns or reassigns a phone number as a company or extension number.
     * <p>
     * Assign scenarios supported:
     * - from Inventory to a company number;
     * - from Inventory to an extension number.
     * <p>
     * Reassign scenarios supported:
     * - from an extension to another extension;
     * - from an extension to a company number;
     * - from a company number to an extension.
     * <p>
     * HTTP Method: patch
     * Endpoint: /restapi/v2/accounts/{accountId}/phone-numbers/{phoneNumberId}
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyPhoneNumbers
     */
    public AccountPhoneNumberInfo patch(AssignPhoneNumberRequest assignPhoneNumberRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (phoneNumberId == null) {
            throw new IllegalArgumentException("Parameter phoneNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), assignPhoneNumberRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountPhoneNumberInfo.class);
    }

    public com.ringcentral.paths.restapi.v2.accounts.phonenumbers.replace.Index replace() {
        return new com.ringcentral.paths.restapi.v2.accounts.phonenumbers.replace.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.phonenumbers.bulkadd.Index bulkAdd() {
        return this.bulkAdd(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.phonenumbers.bulkadd.Index bulkAdd(String taskId) {
        return new com.ringcentral.paths.restapi.v2.accounts.phonenumbers.bulkadd.Index(this, taskId);
    }

}
