package com.ringcentral.paths.restapi.account.extension.meetingrecordings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListMeetingRecordingsResponse;
import com.ringcentral.definitions.ListUserMeetingRecordingsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/meeting-recordings";
    }

    /**
     * Returns the list of meetings recordings for the current user.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting-recordings
     * Rate Limit Group: Medium
     * App Permission: Meetings
     */
    public ListMeetingRecordingsResponse get(ListUserMeetingRecordingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ListMeetingRecordingsResponse.class);
    }

    public ListMeetingRecordingsResponse get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
