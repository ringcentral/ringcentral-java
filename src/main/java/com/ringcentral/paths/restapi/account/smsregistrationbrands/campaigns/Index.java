package com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.smsregistrationbrands.Index parent;
    public String tcrCampaignId;

    public Index(
            com.ringcentral.paths.restapi.account.smsregistrationbrands.Index parent,
            String tcrCampaignId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.tcrCampaignId = tcrCampaignId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && tcrCampaignId != null) {
            return parent.path() + "/campaigns/" + tcrCampaignId;
        }
        return parent.path() + "/campaigns";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of TCR campaigns by the TCR brand ID. HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/sms-registration-brands/{tcrBrandId}/campaigns Rate
     * Limit Group: Light App Permission: ReadAccounts User Permission: ReadSMSRegistration
     */
    public CampaignListResponse list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CampaignListResponse.class);
    }

    /**
     * Returns the TCR campaign by ID. HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/sms-registration-brands/{tcrBrandId}/campaigns/{tcrCampaignId}
     * Rate Limit Group: Light App Permission: ReadAccounts User Permission: ReadSMSRegistration
     */
    public TcrCampaignRecord get() throws com.ringcentral.RestException, java.io.IOException {
        if (tcrCampaignId == null) {
            throw new IllegalArgumentException("Parameter tcrCampaignId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TcrCampaignRecord.class);
    }

    public com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns.submitphonenumbers
                    .Index
            submitPhoneNumbers() {
        return new com.ringcentral.paths.restapi.account.smsregistrationbrands.campaigns
                .submitphonenumbers.Index(this);
    }
}
