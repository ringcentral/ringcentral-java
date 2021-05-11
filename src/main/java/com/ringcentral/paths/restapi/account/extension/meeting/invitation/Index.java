package com.ringcentral.paths.restapi.account.extension.meeting.invitation;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.PublicMeetingInvitationResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.meeting.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.meeting.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/invitation";
    }

    /**
     * Returns a meeting invitation by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}/invitation
     * Rate Limit Group: Light
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public PublicMeetingInvitationResponse get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PublicMeetingInvitationResponse.class);
    }
}
