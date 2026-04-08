package com.ringcentral.definitions;


    /**
* Meeting information
*/
public class AdminAccessMeeting
{
    /**
     * Meeting id
     * Required
     */
    public String id;
    public AdminAccessMeeting id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Short bridge id
     * Required
     */
    public String shortId;
    public AdminAccessMeeting shortId(String shortId)
    {
        this.shortId = shortId;
        return this;
    }

    /**
     * Bridge id
     * Required
     */
    public String bridgeId;
    public AdminAccessMeeting bridgeId(String bridgeId)
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
    public AdminAccessMeeting startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Meeting name
     * Required
     */
    public String displayName;
    public AdminAccessMeeting displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Required
     */
    public Host hostInfo;
    public AdminAccessMeeting hostInfo(Host hostInfo)
    {
        this.hostInfo = hostInfo;
        return this;
    }

    /**
     * Meeting duration in seconds
     * Required
     * Format: int32
     * Example: 36
     */
    public Long duration;
    public AdminAccessMeeting duration(Long duration)
    {
        this.duration = duration;
        return this;
    }

    /**
     * List of the participants in the meeting
     * Required
     */
    public BasicParticipant[] participants;
    public AdminAccessMeeting participants(BasicParticipant[] participants)
    {
        this.participants = participants;
        return this;
    }

    /**
     * Public chat txt file for the meeting
     */
    public String chatContentUri;
    public AdminAccessMeeting chatContentUri(String chatContentUri)
    {
        this.chatContentUri = chatContentUri;
        return this;
    }
}