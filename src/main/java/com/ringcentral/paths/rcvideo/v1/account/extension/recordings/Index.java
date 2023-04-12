package com.ringcentral.paths.rcvideo.v1.account.extension.recordings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CloudRecording;
import com.ringcentral.definitions.CloudRecordings;
import com.ringcentral.definitions.GetExtensionRecordingsParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.account.extension.Index parent;
    public String recordingId;

    public Index(com.ringcentral.paths.rcvideo.v1.account.extension.Index parent, String recordingId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.recordingId = recordingId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && recordingId != null) {
            return parent.path() + "/recordings/" + recordingId;
        }
        return parent.path() + "/recordings";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of meeting recordings belonging to particular user.
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/account/{accountId}/extension/{extensionId}/recordings
     * Rate Limit Group: Light
     * App Permission: Video
     */
    public CloudRecordings list(GetExtensionRecordingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CloudRecordings.class);
    }

    public CloudRecordings list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns the information about particular user&#039;s recording.
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/account/{accountId}/extension/{extensionId}/recordings/{recordingId}
     * Rate Limit Group: Light
     * App Permission: Video
     */
    public CloudRecording get() throws com.ringcentral.RestException, java.io.IOException {
        if (recordingId == null) {
            throw new IllegalArgumentException("Parameter recordingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CloudRecording.class);
    }
}
