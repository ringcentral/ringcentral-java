package com.ringcentral.paths.rcvideo.v1.account.extension.recordings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.account.extension.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v1.account.extension.Index parent) {
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
     * Returns all recordings owned by a specific extension.
     * <p>
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/account/{accountId}/extension/{extensionId}/recordings
     * Rate Limit Group: Light
     * App Permission: Video
     */
    public CloudRecordings get(GetExtensionRecordingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CloudRecordings.class);
    }

    public CloudRecordings get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
