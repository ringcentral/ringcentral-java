package com.ringcentral.paths.restapi.v2.accounts.regionalsettings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AccountRegionalSettingRequest;
import com.ringcentral.definitions.RegionalSettings;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.v2.accounts.Index parent;

    public Index(com.ringcentral.paths.restapi.v2.accounts.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/regional-settings";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns information about particular account regional settings
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/v2/accounts/{accountId}/regional-settings
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     */
    public RegionalSettings get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RegionalSettings.class);
    }

    /**
     * Change information about particular account regional settings
     * HTTP Method: patch
     * Endpoint: /restapi/v2/accounts/{accountId}/regional-settings
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     */
    public RegionalSettings patch(AccountRegionalSettingRequest accountRegionalSettingRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), accountRegionalSettingRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RegionalSettings.class);
    }
}
