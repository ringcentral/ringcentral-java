package com.ringcentral.definitions;


    /**
* Meeting information
*/
public class CloudRecording
{
    /**
     * Meeting id
     * Required
     */
    public String id;
    public CloudRecording id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Short bridge id
     * Required
     */
    public String shortId;
    public CloudRecording shortId(String shortId)
    {
        this.shortId = shortId;
        return this;
    }

    /**
     * Bridge id
     */
    public String bridgeId;
    public CloudRecording bridgeId(String bridgeId)
    {
        this.bridgeId = bridgeId;
        return this;
    }

    /**
     * Start time ISO 8601
     * Required
     * Format: date-time
     */
    public String startTime;
    public CloudRecording startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Meeting name
     * Required
     */
    public String displayName;
    public CloudRecording displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Required
     */
    public Host hostInfo;
    public CloudRecording hostInfo(Host hostInfo)
    {
        this.hostInfo = hostInfo;
        return this;
    }

    /**
     * Meeting duration in seconds
     * Format: int32
     * Example: 36
     */
    public Long duration;
    public CloudRecording duration(Long duration)
    {
        this.duration = duration;
        return this;
    }

    /**
     * Link to the recording file. Not used anymore by Web team
     * Required
     */
    public String mediaLink;
    public CloudRecording mediaLink(String mediaLink)
    {
        this.mediaLink = mediaLink;
        return this;
    }

    /**
     * Encrypted link to the recording file
     * Required
     */
    public String url;
    public CloudRecording url(String url)
    {
        this.url = url;
        return this;
    }

    /**
     * Date after which recording will be deleted
     */
    public String expiresIn;
    public CloudRecording expiresIn(String expiresIn)
    {
        this.expiresIn = expiresIn;
        return this;
    }
}