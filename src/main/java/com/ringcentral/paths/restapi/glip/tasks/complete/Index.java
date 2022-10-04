package com.ringcentral.paths.restapi.glip.tasks.complete;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipCompleteTask;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.tasks.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.tasks.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/complete";
    }

    /**
     * Completes a task in the specified chat.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/tasks/{taskId}/complete
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post(GlipCompleteTask glipCompleteTask) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), glipCompleteTask, null);
        return rb.string();
    }
}
