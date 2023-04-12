package com.ringcentral.paths.webinar.history.v1.company.recordings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.RcwHistoryAdminListRecordingsParameters;
import com.ringcentral.definitions.RecordingAdminExtendedItemModel;
import com.ringcentral.definitions.RecordingAdminListResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.company.Index parent;
    public String recordingId;

    public Index(com.ringcentral.paths.webinar.history.v1.company.Index parent, String recordingId) {
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
     * Returns the list of webinar recordings (Administrator&#039;s interface).
     * The user must have &quot;WebinarSettings&quot; permission granted otherwise the API returns HTTP 403.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/company/recordings
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RecordingAdminListResource list(RcwHistoryAdminListRecordingsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RecordingAdminListResource.class);
    }

    public RecordingAdminListResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns the webinar recording by ID (Administrator&#039;s interface).
     * <p>
     * The user must have &quot;WebinarSettings&quot; permission granted otherwise the API returns HTTP 403.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/company/recordings/{recordingId}
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RecordingAdminExtendedItemModel get() throws com.ringcentral.RestException, java.io.IOException {
        if (recordingId == null) {
            throw new IllegalArgumentException("Parameter recordingId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RecordingAdminExtendedItemModel.class);
    }
}
