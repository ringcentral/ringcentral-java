package com.ringcentral.paths.restapi.account.extension.forwardingnumber;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String forwardingNumberId;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String forwardingNumberId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.forwardingNumberId = forwardingNumberId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && forwardingNumberId != null) {
            return parent.path() + "/forwarding-number/" + forwardingNumberId;
        }
        return parent.path() + "/forwarding-number";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of extension phone numbers used for call forwarding and call flip. The returned list contains all the extension phone numbers used for call forwarding and call flip.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadUserForwardingFlipNumbers
     */
    public GetExtensionForwardingNumberListResponse list(ListForwardingNumbersParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetExtensionForwardingNumberListResponse.class);
    }

    public GetExtensionForwardingNumberListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Adds a new forwarding number to the forwarding number list.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserForwardingFlipNumbers
     */
    public ForwardingNumberInfo post(CreateForwardingNumberRequest createForwardingNumberRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createForwardingNumberRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ForwardingNumberInfo.class);
    }

    /**
     * Returns a specific forwarding number.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadUserForwardingFlipNumbers
     */
    public ForwardingNumberInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (forwardingNumberId == null) {
            throw new IllegalArgumentException("Parameter forwardingNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ForwardingNumberInfo.class);
    }

    /**
     * Updates the existing forwarding number from the forwarding number list.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserForwardingFlipNumbers
     */
    public ForwardingNumberInfo put(UpdateForwardingNumberRequest updateForwardingNumberRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (forwardingNumberId == null) {
            throw new IllegalArgumentException("Parameter forwardingNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateForwardingNumberRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ForwardingNumberInfo.class);
    }

    /**
     * Deletes a forwarding number from the forwarding number list by its ID.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/forwarding-number/{forwardingNumberId}
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditUserForwardingFlipNumbers
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (forwardingNumberId == null) {
            throw new IllegalArgumentException("Parameter forwardingNumberId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }
}
