package com.ringcentral.definitions;


    /**
* Meeting information
*/
public class Meeting
{
    /**
     * Meeting id
     * Required
     */
    public String id;
    public Meeting id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Short bridge id
     * Required
     */
    public String shortId;
    public Meeting shortId(String shortId)
    {
        this.shortId = shortId;
        return this;
    }

    /**
     * Bridge id
     * Required
     */
    public String bridgeId;
    public Meeting bridgeId(String bridgeId)
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
    public Meeting startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Meeting name
     * Required
     */
    public String displayName;
    public Meeting displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Required
     */
    public Host hostInfo;
    public Meeting hostInfo(Host hostInfo)
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
    public Meeting duration(Long duration)
    {
        this.duration = duration;
        return this;
    }

    /**
     * Meeting type
     * Required
     * Enum: Meeting, Call
     */
    public String type;
    public Meeting type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Meeting status
     * Required
     * Enum: InProgress, Done
     */
    public String status;
    public Meeting status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Describe access rights which has participants to meeting
     * Required
     * Enum: delete, download, share
     */
    public String[] rights;
    public Meeting rights(String[] rights)
    {
        this.rights = rights;
        return this;
    }

    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about this meeting
     */
    public String longSummary;
    public Meeting longSummary(String longSummary)
    {
        this.longSummary = longSummary;
        return this;
    }

    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about this meeting
     */
    public String shortSummary;
    public Meeting shortSummary(String shortSummary)
    {
        this.shortSummary = shortSummary;
        return this;
    }

    /**
     * During meeting AI team analyze code and after meeting finished generates key words used in meeting
     */
    public String[] keywords;
    public Meeting keywords(String[] keywords)
    {
        this.keywords = keywords;
        return this;
    }

    /**
     * List of the participants in the meeting
     * Required
     */
    public Participant[] participants;
    public Meeting participants(Participant[] participants)
    {
        this.participants = participants;
        return this;
    }

    /**
     * Recording information
     * Required
     */
    public Recording[] recordings;
    public Meeting recordings(Recording[] recordings)
    {
        this.recordings = recordings;
        return this;
    }

    /**
     * A list of transcriptions references
     */
    public Transcriptions[] transcriptions;
    public Meeting transcriptions(Transcriptions[] transcriptions)
    {
        this.transcriptions = transcriptions;
        return this;
    }

    /**
     * A list of meeting notes documents references
     */
    public MeetingNotes[] notes;
    public Meeting notes(MeetingNotes[] notes)
    {
        this.notes = notes;
        return this;
    }

    /**
     * Meeting summary generated from transcriptions if AI processing was enabled for the meeting
     */
    public String summary;
    public Meeting summary(String summary)
    {
        this.summary = summary;
        return this;
    }

    /**
     * Chat location
     */
    public String chatUrl;
    public Meeting chatUrl(String chatUrl)
    {
        this.chatUrl = chatUrl;
        return this;
    }
}