package com.ringcentral.paths.rcvideo.history;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.Index parent;

    public Index(com.ringcentral.paths.rcvideo.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/history";
    }


    public com.ringcentral.paths.rcvideo.history.meetings.Index meetings() {
        return this.meetings(null);
    }

    public com.ringcentral.paths.rcvideo.history.meetings.Index meetings(String meetingId) {
        return new com.ringcentral.paths.rcvideo.history.meetings.Index(this, meetingId);
    }

}
