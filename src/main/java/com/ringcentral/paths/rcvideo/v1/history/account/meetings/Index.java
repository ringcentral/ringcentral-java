package com.ringcentral.paths.rcvideo.v1.history.account.meetings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AdminAccessMeetings;
import com.ringcentral.definitions.ListAccountMeetingsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.history.account.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v1.history.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/meetings";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of completed meetings owned by all users of the account.
     * <p>
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/history/account/{accountId}/meetings
     * Rate Limit Group: Light
     * App Permission: Video
     */
    public AdminAccessMeetings get(ListAccountMeetingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AdminAccessMeetings.class);
    }

    public AdminAccessMeetings get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
