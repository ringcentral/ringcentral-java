package com.ringcentral.definitions;


public class MeetingRecordingInfo {
    /**
     * Unique identifier of a meeting instance
     */
    public String uuid;
    /**
     *
     */
    public String id;
    /**
     * Link for downloading the recorded file (mp4, mp3 audio and text/plain chat file)
     * Format: uri
     */
    public String contentDownloadUri;
    /**
     * Enum: video/mp4, audio/m4a, text/vtt
     */
    public String contentType;
    /**
     * Format: int32
     */
    public Long size;
    /**
     * Starting time of a recording
     * Format: date-time
     */
    public String startTime;
    /**
     * Ending time of a recording
     * Format: date-time
     */
    public String endTime;
    /**
     * Enum: Completed, Processing
     */
    public String status;

    public MeetingRecordingInfo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

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
