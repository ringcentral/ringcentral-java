package com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.callerblocking.Index parent;
    public String blockedNumberId;

    public Index(com.ringcentral.paths.restapi.account.extension.callerblocking.Index parent, String blockedNumberId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.blockedNumberId = blockedNumberId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && blockedNumberId != null) {
            return parent.path() + "/phone-numbers/" + blockedNumberId;
        }
        return parent.path() + "/phone-numbers";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the lists of blocked and allowed phone numbers.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadBlockedNumbers
     */
    public BlockedAllowedPhoneNumbersList list(ListBlockedAllowedNumbersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BlockedAllowedPhoneNumbersList.class);
    }

    public BlockedAllowedPhoneNumbersList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Updates either blocked or allowed phone number list with a new phone number.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditBlockedNumbers
     */
    public BlockedAllowedPhoneNumberInfo post(AddBlockedAllowedPhoneNumber addBlockedAllowedPhoneNumber) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), addBlockedAllowedPhoneNumber, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BlockedAllowedPhoneNumberInfo.class);
    }

    /**
     * Returns blocked or allowed phone number(s) by their ID(s).
     * [Batch request syntax](https://developers.ringcentral.com/guide/basics/batch-requests) is supported.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadBlockedNumbers
     */
    public BlockedAllowedPhoneNumberInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (blockedNumberId == null) {
            throw new IllegalArgumentException("Parameter blockedNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BlockedAllowedPhoneNumberInfo.class);
    }

    /**
     * Updates blocked or allowed phone number(s) by their ID(s).
     * [Batch request syntax](https://developers.ringcentral.com/guide/basics/batch-requests) is supported.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditBlockedNumbers
     */
    public BlockedAllowedPhoneNumberInfo put(AddBlockedAllowedPhoneNumber addBlockedAllowedPhoneNumber) throws com.ringcentral.RestException, java.io.IOException {
        if (blockedNumberId == null) {
            throw new IllegalArgumentException("Parameter blockedNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), addBlockedAllowedPhoneNumber, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BlockedAllowedPhoneNumberInfo.class);
    }

    /**
     * Deletes blocked or allowed phone number(s) by their ID(s).
     * [Batch request](https://developers.ringcentral.com/guide/basics/batch-requests) is supported.
     * <p>
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking/phone-numbers/{blockedNumberId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditBlockedNumbers
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (blockedNumberId == null) {
            throw new IllegalArgumentException("Parameter blockedNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
