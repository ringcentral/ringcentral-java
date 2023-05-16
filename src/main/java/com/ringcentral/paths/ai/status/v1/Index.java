package com.ringcentral.paths.ai.status.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.status.Index parent;

    public Index(com.ringcentral.paths.ai.status.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/v1";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.status.v1.jobs.Index jobs() {
        return this.jobs(null);
    }

    public com.ringcentral.paths.ai.status.v1.jobs.Index jobs(String jobId) {
        return new com.ringcentral.paths.ai.status.v1.jobs.Index(this, jobId);
    }

}
