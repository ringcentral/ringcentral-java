package com.ringcentral.paths.restapi.account.messagethreads.assign;

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
        return parent.path() + "/assign";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Assigns, unassigns, or reassigns the thread. The authorized user must be in the list of
     * thread monitors, otherwise the API returns a 403 error.
     *
     * <p>HTTP Method: post Endpoint:
     * /restapi/{apiVersion}/account/{accountId}/message-threads/{threadId}/assign Rate Limit Group:
     * Medium App Permission: SMS
     */
    public MessageThread post(AssignMessageThreadRequest assignMessageThreadRequest)
            throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), assignMessageThreadRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageThread.class);
    }
}
