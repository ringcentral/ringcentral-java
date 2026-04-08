package com.ringcentral.paths.restapi.account.smsregistrationbrands;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String tcrBrandId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String tcrBrandId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.tcrBrandId = tcrBrandId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && tcrBrandId != null) {
            return parent.path() + "/sms-registration-brands/" + tcrBrandId;
        }
        return parent.path() + "/sms-registration-brands";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of all TCR brands. HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/sms-registration-brands Rate Limit Group: Light App
     * Permission: ReadAccounts
     */
    public BrandListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BrandListResponse.class);
    }

    /**
     * Returns the TCR brand by ID. HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/sms-registration-brands/{tcrBrandId} Rate Limit
     * Group: Light App Permission: ReadAccounts User Permission: ReadSMSRegistration
     */
    public TcrBrandRecord get() throws com.ringcentral.RestException, java.io.IOException {
        if (tcrBrandId == null) {
            throw new IllegalArgumentException("Parameter tcrBrandId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TcrBrandRecord.class);
    }

    public com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns.Index campaigns() {
        return this.campaigns(null);
    }

    public com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns.Index campaigns(
            String tcrCampaignId) {
        return new com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns.Index(
                this, tcrCampaignId);
    }
}
