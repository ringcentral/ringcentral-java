package com.ringcentral.paths.restapi.account.extension.conferencing;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetConferencingInfoResponse;
import com.ringcentral.definitions.ReadConferencingSettingsParameters;
import com.ringcentral.definitions.UpdateConferencingInfoRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/conferencing";
    }

    /**
     * Returns information on Free Conference Calling (FCC) feature
     * for a given extension.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/conferencing
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: OrganizeConference
     */
    public GetConferencingInfoResponse get(ReadConferencingSettingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetConferencingInfoResponse.class);
    }

    public GetConferencingInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }

    /**
     * Updates the default conferencing number for the current extension.
     * The number can be selected from conferencing numbers of the current extension.
     * Updates the setting, allowing participants join the conference before host.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/conferencing
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: OrganizeConference
     */
    public GetConferencingInfoResponse put(UpdateConferencingInfoRequest updateConferencingInfoRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateConferencingInfoRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GetConferencingInfoResponse.class);
    }
}
