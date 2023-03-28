package com.ringcentral.paths.restapi.account.extension.meeting.serviceinfo;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.MeetingServiceInfoRequest;
import com.ringcentral.definitions.MeetingServiceInfoResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.meeting.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.meeting.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/service-info";
    }

    /**
     * Returns information on dial-in numbers for meetings, support and international dial-in numbers URIs and meeting account information.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/service-info
     * Rate Limit Group: Light
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public MeetingServiceInfoResource get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingServiceInfoResource.class);
    }

    /**
     * Updates personal meeting identifier.
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/service-info
     * Rate Limit Group: Medium
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public MeetingServiceInfoResource patch(MeetingServiceInfoRequest meetingServiceInfoRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), meetingServiceInfoRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingServiceInfoResource.class);
    }
}
