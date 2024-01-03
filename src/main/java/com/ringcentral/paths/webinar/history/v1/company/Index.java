package com.ringcentral.paths.webinar.history.v1.company;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.Index parent;

    public Index(com.ringcentral.paths.webinar.history.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/company";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.webinar.history.v1.company.sessions.Index sessions() {
        return new com.ringcentral.paths.webinar.history.v1.company.sessions.Index(this);
    }


    public com.ringcentral.paths.webinar.history.v1.company.recordings.Index recordings() {
        return this.recordings(null);
    }

    public com.ringcentral.paths.webinar.history.v1.company.recordings.Index recordings(String recordingId) {
        return new com.ringcentral.paths.webinar.history.v1.company.recordings.Index(this, recordingId);
    }

}
