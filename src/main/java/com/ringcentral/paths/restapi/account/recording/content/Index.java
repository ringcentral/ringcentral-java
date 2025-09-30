package com.ringcentral.paths.restapi.account.recording.content;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ReadCallRecordingContentParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.recording.Index parent;

    public Index(com.ringcentral.paths.restapi.account.recording.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/content";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns media content of a call recording (`audio/mpeg` or `audio/wav`)
     * <p>
     * **This API must be called via media API entry point, e.g. https://media.ringcentral.com**
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/recording/{recordingId}/content
     * Rate Limit Group: Heavy
     * App Permission: ReadCallRecording
     */
    public byte[] get(ReadCallRecordingContentParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return rb.bytes();
    }

    public byte[] get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
