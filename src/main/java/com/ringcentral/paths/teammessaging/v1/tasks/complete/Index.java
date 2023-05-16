package com.ringcentral.paths.teammessaging.v1.tasks.complete;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.TMCompleteTaskRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.tasks.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.tasks.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/complete";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Completes a task in the specified chat.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/tasks/{taskId}/complete
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post(TMCompleteTaskRequest tMCompleteTaskRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), tMCompleteTaskRequest, null);
        return rb.string();
    }
}
