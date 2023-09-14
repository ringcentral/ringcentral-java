package com.ringcentral.paths.restapi.v2.accounts.phonenumbers.bulkadd;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.phonenumbers.Index parent;
    public String taskId;

    public Index(com.ringcentral.paths.restapi.v2.accounts.phonenumbers.Index parent, String taskId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.taskId = taskId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && taskId != null) {
            return parent.path() + "/bulk-add/" + taskId;
        }
        return parent.path() + "/bulk-add";
    }

    public String path() {
        return path(true);
    }

    /**
     * Adds phone numbers to the account Inventory as unassigned. Currently we support the following three enum values: &#039;Inventory&#039;,
     * &#039;InventoryPartnerBusinessMobileNumber&#039; and &#039;PartnerBusinessMobileNumber&#039;. Later we may support some other values like &#039;ForwardedNumber&#039;, etc.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/v2/accounts/{accountId}/phone-numbers/bulk-add
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: EditCompanyPhoneNumbers
     */
    public AddPhoneNumbersResponse post(AddPhoneNumbersRequest addPhoneNumbersRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), addPhoneNumbersRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AddPhoneNumbersResponse.class);
    }

    /**
     * Returns the result of asynchronous operation which adds phone numbers to the account Inventory.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/phone-numbers/bulk-add/{taskId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: EditCompanyPhoneNumbers
     */
    public GetBulkAddTaskResultsV2Response get() throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetBulkAddTaskResultsV2Response.class);
    }
}
