package com.ringcentral.paths.webinar.history.v1.recordings.download;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.RcwHistoryGetRecordingDownloadParameters;
import com.ringcentral.definitions.RecordingDownloadModel;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.history.v1.recordings.Index parent;

    public Index(com.ringcentral.paths.webinar.history.v1.recordings.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/download";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the webinar recording download link (both Webinar host&#039;s and admin interface).
     * <p>
     * If called by a webinar host, the API returns error (403) if recording downloading is prohibited by company settings.
     * The admin user who has &quot;WebinarSettings&quot; permission should be able to download recording regardless of current company settings.
     * <p>
     * HTTP Method: get
     * Endpoint: /webinar/history/v1/recordings/{recordingId}/download
     * Rate Limit Group: Heavy
     * App Permission: ReadWebinars
     */
    public RecordingDownloadModel get(RcwHistoryGetRecordingDownloadParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), RecordingDownloadModel.class);
    }

    public RecordingDownloadModel get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
