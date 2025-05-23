package com.ringcentral.definitions;


/**
 * Recordings page
 */
public class CloudRecordings {
    /**
     * Recordings array
     * Required
     */
    public CloudRecording[] recordings;
    /**
     * Required
     */
    public BasicPaging paging;

    public CloudRecordings recordings(CloudRecording[] recordings) {
        this.recordings = recordings;
        return this;
    }

    public CloudRecordings paging(BasicPaging paging) {
        this.paging = paging;
        return this;
    }
}
