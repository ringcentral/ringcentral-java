package com.ringcentral.paths.restapi.v2.accounts;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.Index parent;
    public String accountId;

    public Index(com.ringcentral.paths.restapi.v2.Index parent) {
        this(parent, "~");
    }

    public Index(com.ringcentral.paths.restapi.v2.Index parent, String accountId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.accountId = accountId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && accountId != null) {
            return parent.path() + "/accounts/" + accountId;
        }
        return parent.path() + "/accounts";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns basic information about particular RingCentral account
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyInfo
     */
    public AccountInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (accountId == null) {
            throw new IllegalArgumentException("Parameter accountId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AccountInfo.class);
    }

    public com.ringcentral.paths.restapi.v2.accounts.devices.Index devices() {
        return this.devices(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.devices.Index devices(String deviceId) {
        return new com.ringcentral.paths.restapi.v2.accounts.devices.Index(this, deviceId);
    }


    public com.ringcentral.paths.restapi.v2.accounts.extensions.Index extensions() {
        return new com.ringcentral.paths.restapi.v2.accounts.extensions.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.costcenters.Index costCenters() {
        return new com.ringcentral.paths.restapi.v2.accounts.costcenters.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.phonenumbers.Index phoneNumbers() {
        return this.phoneNumbers(null);
    }

    public com.ringcentral.paths.restapi.v2.accounts.phonenumbers.Index phoneNumbers(String phoneNumberId) {
        return new com.ringcentral.paths.restapi.v2.accounts.phonenumbers.Index(this, phoneNumberId);
    }


    public com.ringcentral.paths.restapi.v2.accounts.deviceinventory.Index deviceInventory() {
        return new com.ringcentral.paths.restapi.v2.accounts.deviceinventory.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.batchprovisioning.Index batchProvisioning() {
        return new com.ringcentral.paths.restapi.v2.accounts.batchprovisioning.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.sendwelcomeemail.Index sendWelcomeEmail() {
        return new com.ringcentral.paths.restapi.v2.accounts.sendwelcomeemail.Index(this);
    }


    public com.ringcentral.paths.restapi.v2.accounts.sendactivationemail.Index sendActivationEmail() {
        return new com.ringcentral.paths.restapi.v2.accounts.sendactivationemail.Index(this);
    }

}
