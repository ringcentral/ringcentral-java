package com.ringcentral.paths.ai.status.v1.jobs;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.JobStatusResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.status.v1.Index parent;
    public String jobId;

    public Index(com.ringcentral.paths.ai.status.v1.Index parent, String jobId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.jobId = jobId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && jobId != null) {
            return parent.path() + "/jobs/" + jobId;
        }
        return parent.path() + "/jobs";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns async task status by Job ID
     * HTTP Method: get
     * Endpoint: /ai/status/v1/jobs/{jobId}
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public JobStatusResponse get() throws com.ringcentral.RestException, java.io.IOException {
        if (jobId == null) {
            throw new IllegalArgumentException("Parameter jobId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), JobStatusResponse.class);
    }
}
