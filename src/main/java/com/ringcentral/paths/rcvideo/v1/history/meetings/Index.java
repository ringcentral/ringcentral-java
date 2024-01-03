package com.ringcentral.paths.rcvideo.v1.history.meetings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListVideoMeetingsParameters;
import com.ringcentral.definitions.Meeting;
import com.ringcentral.definitions.MeetingPage;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.history.Index parent;
    public String meetingId;

    public Index(com.ringcentral.paths.rcvideo.v1.history.Index parent, String meetingId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.meetingId = meetingId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && meetingId != null) {
            return parent.path() + "/meetings/" + meetingId;
        }
        return parent.path() + "/meetings";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of user meetings.
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/history/meetings
     * Rate Limit Group: Light
     * App Permission: Video
     */
    public MeetingPage list(ListVideoMeetingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MeetingPage.class);
    }

    public MeetingPage list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns a user meeting by ID.
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/history/meetings/{meetingId}
     * Rate Limit Group: Light
     * App Permission: Video
     */
    public Meeting get() throws com.ringcentral.RestException, java.io.IOException {
        if (meetingId == null) {
            throw new IllegalArgumentException("Parameter meetingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), Meeting.class);
    }
}
