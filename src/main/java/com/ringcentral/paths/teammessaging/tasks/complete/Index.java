package com.ringcentral.paths.teammessaging.tasks.complete;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.TMCompleteTaskRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.tasks.Index parent;

    public Index(com.ringcentral.paths.teammessaging.tasks.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/complete";
    }

    /**
     * Completes a task in the specified chat.
     * HTTP Method: post
     * Endpoint: /team-messaging/{version}/tasks/{taskId}/complete
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post(TMCompleteTaskRequest tMCompleteTaskRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), tMCompleteTaskRequest, null);
        return rb.string();
    }
}
