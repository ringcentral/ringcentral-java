package com.ringcentral.paths.restapi.account.extension.greeting.holdmusic;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.greeting.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.greeting.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/hold-music";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a custom hold music greeting for user. HTTP Method: get Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/greeting/hold-music Rate
     * Limit Group: Medium App Permission: ReadAccounts User Permission: ReadUserInfo
     */
    public CustomUserGreetingInfo get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomUserGreetingInfo.class);
    }
}
