package com.ringcentral.paths.restapi.v2.accounts.forwardednumbers;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AddForwardedNumbersRequest;
import com.ringcentral.definitions.AddForwardedNumbersResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/forwarded-numbers";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Adds forwarded numbers to an account.
     * <p>
     * **Flow #1. For Partners with their own number pool.**
     * <p>
     * Adds forwarded (ported) phone number(s) in provisioned (activated) state,
     * but the Partner is responsible for all further calls on behalf of this number from fraud perspective.
     * If extension is specified in request body then the number will be added
     * at extension level as `ForwardedNumber`. If extension is not specified in request,
     * a number is assigned directly to an account as `ForwardedCompanyNumber`.
     * A forwarded number can be used as an outbound caller ID.
     * Once a number is finally ported it turns into ordinary (not forwarded) account/extension phone number.
     * <p>
     * **Flow #2. For Partners with RingCentral-managed number pool.**
     * <p>
     * Adds forwarded (ported) phone number(s) in non-activated state. A forwarded number should be activated
     * via separated RC support flow.
     * If extension is specified in request body then the number will be added
     * at extension level as `ForwardedNumber`. If extension is not specified in request,
     * a number is assigned directly to an account as `ForwardedCompanyNumber`.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/forwarded-numbers
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: EditCompanyPhoneNumbers
     */
    public AddForwardedNumbersResponse post(AddForwardedNumbersRequest addForwardedNumbersRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), addForwardedNumbersRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AddForwardedNumbersResponse.class);
    }
}
