package com.ringcentral.definitions;


public class ScheduleMeetingResponse {
    /**
     *
     */
    public Boolean startHostVideo;
    /**
     *
     */
    public Boolean startParticipantVideo;
    /**
     *
     */
    public Boolean audioOptions;
    /**
     *
     */
    public Boolean allowJoinBeforeHost;
    /**
     *
     */
    public Boolean requirePasswordForSchedulingNewMeetings;
    /**
     *
     */
    public Boolean requirePasswordForInstantMeetings;
    /**
     *
     */
    public Boolean requirePasswordForPmiMeetings;
    /**
     *
     */
    public Boolean enforceLogin;

    public ScheduleMeetingResponse startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }

    public ScheduleMeetingResponse startParticipantVideo(Boolean startParticipantVideo) {
        this.startParticipantVideo = startParticipantVideo;
        return this;
    }

    public ScheduleMeetingResponse audioOptions(Boolean audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }

    public ScheduleMeetingResponse allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public ScheduleMeetingResponse requirePasswordForSchedulingNewMeetings(Boolean requirePasswordForSchedulingNewMeetings) {
        this.requirePasswordForSchedulingNewMeetings = requirePasswordForSchedulingNewMeetings;
        return this;
    }

    public ScheduleMeetingResponse requirePasswordForInstantMeetings(Boolean requirePasswordForInstantMeetings) {
        this.requirePasswordForInstantMeetings = requirePasswordForInstantMeetings;
        return this;
    }

    public ScheduleMeetingResponse requirePasswordForPmiMeetings(Boolean requirePasswordForPmiMeetings) {
        this.requirePasswordForPmiMeetings = requirePasswordForPmiMeetings;
        return this;
    }

    public ScheduleMeetingResponse enforceLogin(Boolean enforceLogin) {
        this.enforceLogin = enforceLogin;
        return this;
    }
}
