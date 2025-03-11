package com.ringcentral.paths.restapi.v2.accounts.extensions.callflipnumbers;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.extensions.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.extensions.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/call-flip-numbers";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns call flip settings. Call flip destination is an extension level setting.
     * The following numbers can be used for call flip:
     * <p>
     * * User&#039;s DL numbers (added/removed automatically by the System)
     * * PSTN numbers in E.164 format (added/removed manually by User)
     * <p>
     * Call flip list is generally limited up to 10 numbers.
     * <p>
     * **Please note:** This API is only working with the new Communication Handling flow.
     * To ensure that please check if the &#039;NewCallHandlingAndForwarding&#039; feature is supported.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/call-flip-numbers
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public CallFlipNumberListResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallFlipNumberListResource.class);
    }

    /**
     * Updates call flip settings. Call flip destination is an extension level setting.
     * The following numbers can be used for call flip:
     * <p>
     * * User&#039;s DL numbers (added/removed automatically by the System)
     * * PSTN numbers in E.164 format (added/removed manually by User)
     * <p>
     * Call flip list is generally limited up to 10 numbers.
     * <p>
     * **Please note:** This API is only working with the new Communication Handling flow.
     * To ensure that please check if the &#039;NewCallHandlingAndForwarding&#039; feature is supported.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/v2/accounts/{accountId}/extensions/{extensionId}/call-flip-numbers
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     */
    public CallFlipNumberListResource put(CallFlipNumberListResource callFlipNumberListResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), callFlipNumberListResource, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallFlipNumberListResource.class);
    }
}
