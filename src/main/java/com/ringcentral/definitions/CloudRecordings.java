package com.ringcentral.definitions;

/** Recordings page */
public class CloudRecordings {
    /** Recordings array Required */
    public CloudRecording[] recordings;

    public CloudRecordings recordings(CloudRecording[] recordings) {
        this.recordings = recordings;
        return this;
    }

    /** Required */
    public BasicPaging paging;

    public CloudRecordings paging(BasicPaging paging) {
        this.paging = paging;
        return this;
    }
}
