package com.ringcentral.paths.ai.audio.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.audio.Index parent;

    public Index(com.ringcentral.paths.ai.audio.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/v1";
    }


    public com.ringcentral.paths.ai.audio.v1.async.Index async() {
        return new com.ringcentral.paths.ai.audio.v1.async.Index(this);
    }


    public com.ringcentral.paths.ai.audio.v1.enrollments.Index enrollments() {
        return this.enrollments(null);
    }

    public com.ringcentral.paths.ai.audio.v1.enrollments.Index enrollments(String enrollmentId) {
        return new com.ringcentral.paths.ai.audio.v1.enrollments.Index(this, enrollmentId);
    }

}
