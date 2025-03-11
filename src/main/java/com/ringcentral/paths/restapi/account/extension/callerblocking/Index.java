package com.ringcentral.paths.restapi.account.extension.callerblocking;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/caller-blocking";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the current caller blocking settings of a user.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadBlockedNumbers
     */
    public CallerBlockingSettings get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallerBlockingSettings.class);
    }

    /**
     * Updates the current caller blocking settings of a user.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/caller-blocking
     * Rate Limit Group: Light
     * App Permission: EditExtensions
     * User Permission: EditBlockedNumbers
     */
    public CallerBlockingSettings put(CallerBlockingSettingsUpdate callerBlockingSettingsUpdate) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), callerBlockingSettingsUpdate, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallerBlockingSettings.class);
    }

    public com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers.Index phoneNumbers() {
        return this.phoneNumbers(null);
    }

    public com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers.Index phoneNumbers(String blockedNumberId) {
        return new com.ringcentral.paths.restapi.account.extension.callerblocking.phonenumbers.Index(this, blockedNumberId);
    }

}
