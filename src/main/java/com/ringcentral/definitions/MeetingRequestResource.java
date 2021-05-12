package com.ringcentral.definitions;


public class MeetingRequestResource {
    /**
     * Custom topic of a meeting
     */
    public String topic;
    /**
     * Enum: Instant, Scheduled, ScheduledRecurring, Recurring
     */
    public String meetingType;
    /**
     *
     */
    public MeetingScheduleResource schedule;
    /**
     * Meeting password
     */
    public String password;
    /**
     *
     */
    public HostInfoRequest host;
    /**
     *
     */
    public Boolean allowJoinBeforeHost;
    /**
     *
     */
    public Boolean startHostVideo;
    /**
     * Starting meetings with participant video on/off (true/false)
     */
    public Boolean startParticipantsVideo;
    /**
     * If true, then personal user&#039;s meeting ID is applied for creation of this meeting
     */
    public Boolean usePersonalMeetingId;
    /**
     * Enum: Phone, ComputerAudio
     */
    public String[] audioOptions;
    /**
     *
     */
    public RecurrenceInfo recurrence;
    /**
     * Automatic record type
     * Default: none
     * Enum: local, cloud, none
     */
    public String autoRecordType;
    /**
     * If true, then only signed-in users can join this meeting
     */
    public Boolean enforceLogin;
    /**
     * If true, then participants are muted on entry
     */
    public Boolean muteParticipantsOnEntry;
    /**
     * If true, then the waiting room for participants is enabled
     */
    public Boolean enableWaitingRoom;
    /**
     * List of global dial-in countries (eg. US, UK, AU, etc.)
     */
    public String[] globalDialInCountries;

    public MeetingRequestResource topic(String topic) {
        this.topic = topic;
        return this;
    }

    public MeetingRequestResource meetingType(String meetingType) {
        this.meetingType = meetingType;
        return this;
    }

    public MeetingRequestResource schedule(MeetingScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }

    public MeetingRequestResource password(String password) {
        this.password = password;
        return this;
    }

    public MeetingRequestResource host(HostInfoRequest host) {
        this.host = host;
        return this;
    }

    public MeetingRequestResource allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public MeetingRequestResource startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }

    public MeetingRequestResource startParticipantsVideo(Boolean startParticipantsVideo) {
        this.startParticipantsVideo = startParticipantsVideo;
        return this;
    }

    public MeetingRequestResource usePersonalMeetingId(Boolean usePersonalMeetingId) {
        this.usePersonalMeetingId = usePersonalMeetingId;
        return this;
    }

    public MeetingRequestResource audioOptions(String[] audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }

    public MeetingRequestResource recurrence(RecurrenceInfo recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public MeetingRequestResource autoRecordType(String autoRecordType) {
        this.autoRecordType = autoRecordType;
        return this;
    }

    public MeetingRequestResource enforceLogin(Boolean enforceLogin) {
        this.enforceLogin = enforceLogin;
        return this;
    }

    public MeetingRequestResource muteParticipantsOnEntry(Boolean muteParticipantsOnEntry) {
        this.muteParticipantsOnEntry = muteParticipantsOnEntry;
        return this;
    }

    public MeetingRequestResource enableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
        return this;
    }

    public MeetingRequestResource globalDialInCountries(String[] globalDialInCountries) {
        this.globalDialInCountries = globalDialInCountries;
        return this;
    }
}
