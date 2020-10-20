package com.ringcentral.definitions;


public class MeetingRecordingInfo {
    /**
     *
     */
    public String id;
    /**
     * Link for recording file download
     */
    public String contentDownloadUri;
    /**
     * Enum: video/mp4, audio/m4a, text/plain
     */
    public String contentType;
    /**
     *
     */
    public Long size;
    /**
     * Starting time of a recording
     */
    public String startTime;
    /**
     * Ending time of a recording
     */
    public String endTime;
    /**
     * Enum: Completed, Processing
     */
    public String status;

    public MeetingRecordingInfo id(String id) {
        this.id = id;
        return this;
    }

    public MeetingRecordingInfo contentDownloadUri(String contentDownloadUri) {
        this.contentDownloadUri = contentDownloadUri;
        return this;
    }

    public MeetingRecordingInfo contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public MeetingRecordingInfo size(Long size) {
        this.size = size;
        return this;
    }

    public MeetingRecordingInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public MeetingRecordingInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public MeetingRecordingInfo status(String status) {
        this.status = status;
        return this;
    }

}
