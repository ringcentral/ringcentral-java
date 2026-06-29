package com.ringcentral.paths.restapi.account.messagethreads.resolve;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagethreads.Index parent;

    public Index(com.ringcentral.paths.restapi.account.messagethreads.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/resolve";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Resolves a message thread (sets the status to `Resolved`). The current status of the thread
     * must be `Open` for this operation to succeed. The authorized user must be in the list of
     * thread monitors, otherwise the API returns a 403 error.
     *
     * <p>Once the thread is resolved its `assignee` attribute is cleared automatically.
     *
     * <p>HTTP Method: post Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/{threadId}/resolve Rate Limit
     * Group: Medium App Permission: SMS
     */
    public MessageThread post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageThread.class);
    }
}
