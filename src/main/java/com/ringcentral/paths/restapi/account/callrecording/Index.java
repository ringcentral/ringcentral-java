package com.ringcentral.paths.restapi.account.callrecording;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallRecordingSettingsResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;

    public Index(com.ringcentral.paths.restapi.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/call-recording";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns call recording settings.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recording
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadCompanyInfo
     */
    public CallRecordingSettingsResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallRecordingSettingsResource.class);
    }

    /**
     * Updates current call recording settings.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/call-recording
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: EditCompanyInfo
     */
    public CallRecordingSettingsResource put(CallRecordingSettingsResource callRecordingSettingsResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), callRecordingSettingsResource, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallRecordingSettingsResource.class);
    }

    public com.ringcentral.paths.restapi.account.callrecording.extensions.Index extensions() {
        return new com.ringcentral.paths.restapi.account.callrecording.extensions.Index(this);
    }


    public com.ringcentral.paths.restapi.account.callrecording.bulkassign.Index bulkAssign() {
        return new com.ringcentral.paths.restapi.account.callrecording.bulkassign.Index(this);
    }


    public com.ringcentral.paths.restapi.account.callrecording.customgreetings.Index customGreetings() {
        return this.customGreetings(null);
    }

    public com.ringcentral.paths.restapi.account.callrecording.customgreetings.Index customGreetings(String greetingId) {
        return new com.ringcentral.paths.restapi.account.callrecording.customgreetings.Index(this, greetingId);
    }

}
