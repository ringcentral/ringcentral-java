package com.ringcentral.definitions;


public class MeetingResponseResource {
    /**
     * Link to a meeting resource
     * Format: uri
     */
    public String uri;
    /**
     * Universally unique identifier of a meeting"
     */
    public String uuid;
    /**
     * Internal identifier of a meeting
     */
    public String id;
    /**
     * Custom topic of a meeting
     */
    public String topic;
    /**
     * Enum: Instant, Scheduled, ScheduledRecurring, Recurring
     */
    public String meetingType;
    /**
     * Meeting password
     */
    public String password;
    /**
     *
     */
    public String h323Password;
    /**
     * Status of a meeting
     */
    public String status;
    /**
     *
     */
    public MeetingLinks links;
    /**
     *
     */
    public MeetingScheduleResource schedule;
    /**
     *
     */
    public HostInfoRequest host;
    /**
     * If true, then participants can join the meeting before host arrives
     */
    public Boolean allowJoinBeforeHost;
    /**
     * Starting meetings with host video on/off (true/false)
     */
    public Boolean startHostVideo;
    /**
     * Starting meetings with participant video on/off (true/false)
     */
    public Boolean startParticipantsVideo;
    /**
     * Enum: Phone, ComputerAudio
     */
    public String[] audioOptions;
    /**
     *
     */
    public RecurrenceInfo reccurence;
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

    public MeetingResponseResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingResponseResource uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public MeetingResponseResource id(String id) {
        this.id = id;
        return this;
    }

    public MeetingResponseResource topic(String topic) {
        this.topic = topic;
        return this;
    }

    public MeetingResponseResource meetingType(String meetingType) {
        this.meetingType = meetingType;
        return this;
    }

    public MeetingResponseResource password(String password) {
        this.password = password;
        return this;
    }

    public MeetingResponseResource h323Password(String h323Password) {
        this.h323Password = h323Password;
        return this;
    }

    public MeetingResponseResource status(String status) {
        this.status = status;
        return this;
    }

    public MeetingResponseResource links(MeetingLinks links) {
        this.links = links;
        return this;
    }

    public MeetingResponseResource schedule(MeetingScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }

    public MeetingResponseResource host(HostInfoRequest host) {
        this.host = host;
        return this;
    }

    public MeetingResponseResource allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public MeetingResponseResource startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }

    public MeetingResponseResource startParticipantsVideo(Boolean startParticipantsVideo) {
        this.startParticipantsVideo = startParticipantsVideo;
        return this;
    }

    public MeetingResponseResource audioOptions(String[] audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }

    public MeetingResponseResource reccurence(RecurrenceInfo reccurence) {
        this.reccurence = reccurence;
        return this;
    }

    public MeetingResponseResource autoRecordType(String autoRecordType) {
        this.autoRecordType = autoRecordType;
        return this;
    }

    public MeetingResponseResource enforceLogin(Boolean enforceLogin) {
        this.enforceLogin = enforceLogin;
        return this;
    }

    public MeetingResponseResource muteParticipantsOnEntry(Boolean muteParticipantsOnEntry) {
        this.muteParticipantsOnEntry = muteParticipantsOnEntry;
        return this;
    }

    public MeetingResponseResource enableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
        return this;
    }

    public MeetingResponseResource globalDialInCountries(String[] globalDialInCountries) {
        this.globalDialInCountries = globalDialInCountries;
        return this;
    }
}
