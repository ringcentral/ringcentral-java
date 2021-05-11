package com.ringcentral.paths.restapi.account.extension.videoconfiguration;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.UserVideoConfiguration;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/video-configuration";
    }

    /**
     * Returns information about video configuration of the current user.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/video-configuration
     * Rate Limit Group: Light
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public UserVideoConfiguration get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserVideoConfiguration.class);
    }

    /**
     * Allows to update user video settings, for example video provider.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/video-configuration
     * Rate Limit Group: Light
     * App Permission: Meetings
     */
    public UserVideoConfiguration put(UserVideoConfiguration userVideoConfiguration) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), userVideoConfiguration, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), UserVideoConfiguration.class);
    }
}
