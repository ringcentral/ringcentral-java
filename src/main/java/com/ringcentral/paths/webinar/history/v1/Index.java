package com.ringcentral.paths.webinar.history.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.Index parent;

    public Index(com.ringcentral.paths.webinar.history.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.webinar.history.v1.company.Index company() {
        return new com.ringcentral.paths.webinar.history.v1.company.Index(this);
    }


    public com.ringcentral.paths.webinar.history.v1.webinars.Index webinars() {
        return this.webinars(null);
    }

    public com.ringcentral.paths.webinar.history.v1.webinars.Index webinars(String webinarId) {
        return new com.ringcentral.paths.webinar.history.v1.webinars.Index(this, webinarId);
    }


    public com.ringcentral.paths.webinar.history.v1.sessions.Index sessions() {
        return new com.ringcentral.paths.webinar.history.v1.sessions.Index(this);
    }


    public com.ringcentral.paths.webinar.history.v1.recordings.Index recordings() {
        return this.recordings(null);
    }

    public com.ringcentral.paths.webinar.history.v1.recordings.Index recordings(String recordingId) {
        return new com.ringcentral.paths.webinar.history.v1.recordings.Index(this, recordingId);
    }

}
