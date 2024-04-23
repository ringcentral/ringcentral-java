package com.ringcentral.definitions;


/**
 * Recording information
 */
public class CloudRecording {
    /**
     * Call id
     * Required
     */
    public String id;
    /**
     * Short bridge id
     * Required
     */
    public String shortId;
    /**
     * Start time ISO 8601
     * Required
     * Format: date-time
     */
    public String startTime;
    /**
     * Meeting duration in seconds
     * Format: int32
     * Example: 36
     */
    public Long duration;
    /**
     * Meeting name
     * Required
     */
    public String displayName;
    /**
     * Required
     */
    public Host hostInfo;
    /**
     * Link to the recording file. Not used anymore by Web team
     * Required
     */
    public String mediaLink;
    /**
     * Encrypted link to the recording file
     * Required
     */
    public String url;
    /**
     * Date after which recording will be deleted
     */
    public String expiresIn;

    public CloudRecording id(String id) {
        this.id = id;
        return this;
    }

    public CloudRecording shortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public CloudRecording startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CloudRecording duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CloudRecording displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public CloudRecording hostInfo(Host hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public CloudRecording mediaLink(String mediaLink) {
        this.mediaLink = mediaLink;
        return this;
    }

    public CloudRecording url(String url) {
        this.url = url;
        return this;
    }

    public CloudRecording expiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
