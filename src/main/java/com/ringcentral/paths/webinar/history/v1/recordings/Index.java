package com.ringcentral.paths.webinar.history.v1.recordings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.RcwHistoryListRecordingsParameters;
import com.ringcentral.definitions.RecordingItemExtendedModel;
import com.ringcentral.definitions.RecordingListResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.Index parent;
    public String recordingId;

    public Index(com.ringcentral.paths.webinar.history.v1.Index parent, String recordingId) {
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
     * Returns the list of webinar recordings for a given webinar host user
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/recordings
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RecordingListResource list(RcwHistoryListRecordingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RecordingListResource.class);
    }

    public RecordingListResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns the webinar recording by ID (Webinar host&#039;s interface).
     * This API also returns sharing link if sharing is enabled.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/recordings/{recordingId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RecordingItemExtendedModel get() throws com.ringcentral.RestException, java.io.IOException {
        if (recordingId == null) {
            throw new IllegalArgumentException("Parameter recordingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RecordingItemExtendedModel.class);
    }

    public com.ringcentral.paths.webinar.history.v1.recordings.download.Index download() {
        return new com.ringcentral.paths.webinar.history.v1.recordings.download.Index(this);
    }

}
