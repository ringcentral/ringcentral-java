package com.ringcentral.definitions;


public class ScheduleMeetingResponse
{
    /**
     */
    public Boolean startHostVideo;
    public ScheduleMeetingResponse startHostVideo(Boolean startHostVideo)
    {
        this.startHostVideo = startHostVideo;
        return this;
    }

    /**
     */
    public Boolean startParticipantVideo;
    public ScheduleMeetingResponse startParticipantVideo(Boolean startParticipantVideo)
    {
        this.startParticipantVideo = startParticipantVideo;
        return this;
    }

    /**
     */
    public Boolean audioOptions;
    public ScheduleMeetingResponse audioOptions(Boolean audioOptions)
    {
        this.audioOptions = audioOptions;
        return this;
    }

    /**
     */
    public Boolean allowJoinBeforeHost;
    public ScheduleMeetingResponse allowJoinBeforeHost(Boolean allowJoinBeforeHost)
    {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    /**
     */
    public Boolean requirePasswordForSchedulingNewMeetings;
    public ScheduleMeetingResponse requirePasswordForSchedulingNewMeetings(Boolean requirePasswordForSchedulingNewMeetings)
    {
        this.requirePasswordForSchedulingNewMeetings = requirePasswordForSchedulingNewMeetings;
        return this;
    }

    /**
     */
    public Boolean requirePasswordForInstantMeetings;
    public ScheduleMeetingResponse requirePasswordForInstantMeetings(Boolean requirePasswordForInstantMeetings)
    {
        this.requirePasswordForInstantMeetings = requirePasswordForInstantMeetings;
        return this;
    }

    /**
     */
    public Boolean requirePasswordForPmiMeetings;
    public ScheduleMeetingResponse requirePasswordForPmiMeetings(Boolean requirePasswordForPmiMeetings)
    {
        this.requirePasswordForPmiMeetings = requirePasswordForPmiMeetings;
        return this;
    }

    /**
     */
    public Boolean enforceLogin;
    public ScheduleMeetingResponse enforceLogin(Boolean enforceLogin)
    {
        this.enforceLogin = enforceLogin;
        return this;
    }
}