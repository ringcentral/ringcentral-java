package com.ringcentral.definitions;


    /**
* Options for selecting breakdown for calls duration
*/
public class TimelineResponseOptionsTimers
{
    /**
     * Include data for all calls duration
     */
    public Boolean allCallsDuration;
    public TimelineResponseOptionsTimers allCallsDuration(Boolean allCallsDuration)
    {
        this.allCallsDuration = allCallsDuration;
        return this;
    }

    /**
     * Include breakdown of calls duration by direction (Inbound, Outbound)
     */
    public Boolean callsDurationByDirection;
    public TimelineResponseOptionsTimers callsDurationByDirection(Boolean callsDurationByDirection)
    {
        this.callsDurationByDirection = callsDurationByDirection;
        return this;
    }

    /**
     * Include breakdown of calls duration by origin (Internal, External)
     */
    public Boolean callsDurationByOrigin;
    public TimelineResponseOptionsTimers callsDurationByOrigin(Boolean callsDurationByOrigin)
    {
        this.callsDurationByOrigin = callsDurationByOrigin;
        return this;
    }

    /**
     * Include breakdown of calls duration by response (Answered, NotAnswered, Connected, NotConnected)
     */
    public Boolean callsDurationByResponse;
    public TimelineResponseOptionsTimers callsDurationByResponse(Boolean callsDurationByResponse)
    {
        this.callsDurationByResponse = callsDurationByResponse;
        return this;
    }

    /**
     * Include breakdown of calls duration by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
     */
    public Boolean callsSegmentsDuration;
    public TimelineResponseOptionsTimers callsSegmentsDuration(Boolean callsSegmentsDuration)
    {
        this.callsSegmentsDuration = callsSegmentsDuration;
        return this;
    }

    /**
     * Include breakdown of calls duration by result (Completed, Abandoned, Voicemail, Unknown, Missed, Accepted)
     */
    public Boolean callsDurationByResult;
    public TimelineResponseOptionsTimers callsDurationByResult(Boolean callsDurationByResult)
    {
        this.callsDurationByResult = callsDurationByResult;
        return this;
    }

    /**
     * Include breakdown of calls duration by company hours (BusinessHours, AfterHours)
     */
    public Boolean callsDurationByCompanyHours;
    public TimelineResponseOptionsTimers callsDurationByCompanyHours(Boolean callsDurationByCompanyHours)
    {
        this.callsDurationByCompanyHours = callsDurationByCompanyHours;
        return this;
    }

    /**
     * Include breakdown of calls duration by queue SLA (InSLA, OutSLA). This timer is only applicable to Queues grouping
     */
    public Boolean callsDurationByQueueSla;
    public TimelineResponseOptionsTimers callsDurationByQueueSla(Boolean callsDurationByQueueSla)
    {
        this.callsDurationByQueueSla = callsDurationByQueueSla;
        return this;
    }

    /**
     * Include breakdown of calls duration by type (Direct, FromQueue, ParkRetrieval, Transferred, Outbound)
     */
    public Boolean callsDurationByType;
    public TimelineResponseOptionsTimers callsDurationByType(Boolean callsDurationByType)
    {
        this.callsDurationByType = callsDurationByType;
        return this;
    }
}