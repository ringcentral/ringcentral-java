package com.ringcentral.definitions;


public class MeetingRecordingInfo
{
    /**
     * Unique identifier of a meeting instance
     */
    public String uuid;
    public MeetingRecordingInfo uuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    /**
     */
    public String id;
    public MeetingRecordingInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link for downloading the recorded file (mp4, mp3 audio and text/plain chat file)
     * Format: uri
     */
    public String contentDownloadUri;
    public MeetingRecordingInfo contentDownloadUri(String contentDownloadUri)
    {
        this.contentDownloadUri = contentDownloadUri;
        return this;
    }

    /**
     * Enum: video/mp4, audio/m4a, text/vtt
     */
    public String contentType;
    public MeetingRecordingInfo contentType(String contentType)
    {
        this.contentType = contentType;
        return this;
    }

    /**
     * Format: int32
     */
    public Long size;
    public MeetingRecordingInfo size(Long size)
    {
        this.size = size;
        return this;
    }

    /**
     * Starting time of a recording
     * Format: date-time
     */
    public String startTime;
    public MeetingRecordingInfo startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Ending time of a recording
     * Format: date-time
     */
    public String endTime;
    public MeetingRecordingInfo endTime(String endTime)
    {
        this.endTime = endTime;
        return this;
    }

    /**
     * Enum: Completed, Processing
     */
    public String status;
    public MeetingRecordingInfo status(String status)
    {
        this.status = status;
        return this;
    }
}