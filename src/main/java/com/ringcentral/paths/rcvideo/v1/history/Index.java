package com.ringcentral.paths.rcvideo.v1.history;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/history";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.rcvideo.v1.history.account.Index account() {
        return this.account(null);
    }

    public com.ringcentral.paths.rcvideo.v1.history.account.Index account(String accountId) {
        return new com.ringcentral.paths.rcvideo.v1.history.account.Index(this, accountId);
    }


    public com.ringcentral.paths.rcvideo.v1.history.meetings.Index meetings() {
        return this.meetings(null);
    }

    public com.ringcentral.paths.rcvideo.v1.history.meetings.Index meetings(String meetingId) {
        return new com.ringcentral.paths.rcvideo.v1.history.meetings.Index(this, meetingId);
    }

}
