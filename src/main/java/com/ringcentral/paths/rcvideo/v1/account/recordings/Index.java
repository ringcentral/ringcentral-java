package com.ringcentral.paths.rcvideo.v1.account.recordings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.account.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v1.account.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/recordings";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of meeting recordings owned by all users of the account.
     * <p>
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/account/{accountId}/recordings
     * Rate Limit Group: Light
     * App Permission: Video
     */
    public CloudRecordings get(GetAccountRecordingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CloudRecordings.class);
    }

    public CloudRecordings get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
