package com.ringcentral.paths.restapi.account.messagestorereport.archive;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.messagestorereport.Index parent;

    public Index(com.ringcentral.paths.restapi.account.messagestorereport.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/archive";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the created report with message data not including attachments.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/message-store-report/{taskId}/archive
     * Rate Limit Group: Heavy
     * App Permission: ReadMessages
     * User Permission: Users
     */
    public MessageStoreReportArchive get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), MessageStoreReportArchive.class);
    }
}
