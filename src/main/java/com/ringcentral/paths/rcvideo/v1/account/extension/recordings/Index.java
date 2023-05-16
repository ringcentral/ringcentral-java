package com.ringcentral.paths.rcvideo.v1.account.extension.recordings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CloudRecordings;
import com.ringcentral.definitions.GetExtensionRecordingsParameters;

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
     * Returns the list of meeting recordings belonging to particular user.
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
