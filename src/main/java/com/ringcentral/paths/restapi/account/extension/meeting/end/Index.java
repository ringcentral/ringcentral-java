package com.ringcentral.paths.restapi.account.extension.meeting.end;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.meeting.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.meeting.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/end";
    }

    /**
     * Ends a meetings which is in progress.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/end
     * Rate Limit Group: Medium
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
