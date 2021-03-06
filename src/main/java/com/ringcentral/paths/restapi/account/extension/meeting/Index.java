package com.ringcentral.paths.restapi.account.extension.meeting;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.MeetingRequestResource;
import com.ringcentral.definitions.MeetingResponseResource;
import com.ringcentral.definitions.MeetingsResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String meetingId;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String meetingId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.meetingId = meetingId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && meetingId != null) {
            return parent.path() + "/meeting/" + meetingId;
        }
        return parent.path() + "/meeting";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of user meetings scheduled for the future (meetings of &#039;Instant&#039; type are not included).
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting
     * Rate Limit Group: Light
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public MeetingsResource list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingsResource.class);
    }

    /**
     * Creates a new meeting.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting
     * Rate Limit Group: Medium
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public MeetingResponseResource post(MeetingRequestResource meetingRequestResource) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), meetingRequestResource, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingResponseResource.class);
    }

    /**
     * Returns a particular meetings details by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
     * Rate Limit Group: Light
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public MeetingResponseResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (meetingId == null) {
            throw new IllegalArgumentException("Parameter meetingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingResponseResource.class);
    }

    /**
     * Modifies a particular meeting.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
     * Rate Limit Group: Medium
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public MeetingResponseResource put(MeetingRequestResource meetingRequestResource) throws com.ringcentral.RestException, java.io.IOException {
        if (meetingId == null) {
            throw new IllegalArgumentException("Parameter meetingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), meetingRequestResource, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingResponseResource.class);
    }

    /**
     * Deletes a scheduled meeting.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/meeting/{meetingId}
     * Rate Limit Group: Medium
     * App Permission: Meetings
     * User Permission: Meetings
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (meetingId == null) {
            throw new IllegalArgumentException("Parameter meetingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.account.extension.meeting.end.Index end() {
        return new com.ringcentral.paths.restapi.account.extension.meeting.end.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.meeting.invitation.Index invitation() {
        return new com.ringcentral.paths.restapi.account.extension.meeting.invitation.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.meeting.serviceinfo.Index serviceInfo() {
        return new com.ringcentral.paths.restapi.account.extension.meeting.serviceinfo.Index(this);
    }


    public com.ringcentral.paths.restapi.account.extension.meeting.usersettings.Index userSettings() {
        return new com.ringcentral.paths.restapi.account.extension.meeting.usersettings.Index(this);
    }

}
