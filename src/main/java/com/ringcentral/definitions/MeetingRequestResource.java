package com.ringcentral.definitions;


public class MeetingRequestResource
{
    /**
         * Custom topic of a meeting
         */
        public String topic;
  public MeetingRequestResource topic(String topic)
  {
    this.topic = topic;
    return this;
  }
  

        /**
         * Enum: Instant, Scheduled, ScheduledRecurring, Recurring
         */
        public String meetingType;
  public MeetingRequestResource meetingType(String meetingType)
  {
    this.meetingType = meetingType;
    return this;
  }
  

        /**
         */
        public MeetingScheduleResource schedule;
  public MeetingRequestResource schedule(MeetingScheduleResource schedule)
  {
    this.schedule = schedule;
    return this;
  }
  

        /**
         * Meeting password
         */
        public String password;
  public MeetingRequestResource password(String password)
  {
    this.password = password;
    return this;
  }
  

        /**
         */
        public HostInfoRequest host;
  public MeetingRequestResource host(HostInfoRequest host)
  {
    this.host = host;
    return this;
  }
  

        /**
         */
        public Boolean allowJoinBeforeHost;
  public MeetingRequestResource allowJoinBeforeHost(Boolean allowJoinBeforeHost)
  {
    this.allowJoinBeforeHost = allowJoinBeforeHost;
    return this;
  }
  

        /**
         */
        public Boolean startHostVideo;
  public MeetingRequestResource startHostVideo(Boolean startHostVideo)
  {
    this.startHostVideo = startHostVideo;
    return this;
  }
  

        /**
         * Starting meetings with participant video on/off (true/false)
         */
        public Boolean startParticipantsVideo;
  public MeetingRequestResource startParticipantsVideo(Boolean startParticipantsVideo)
  {
    this.startParticipantsVideo = startParticipantsVideo;
    return this;
  }
  

        /**
         * If true, then personal user's meeting ID is applied for creation of this meeting
         */
        public Boolean usePersonalMeetingId;
  public MeetingRequestResource usePersonalMeetingId(Boolean usePersonalMeetingId)
  {
    this.usePersonalMeetingId = usePersonalMeetingId;
    return this;
  }
  

        /**
         */
        public String[] audioOptions;
  public MeetingRequestResource audioOptions(String[] audioOptions)
  {
    this.audioOptions = audioOptions;
    return this;
  }
  

        /**
         */
        public RecurrenceInfo recurrence;
  public MeetingRequestResource recurrence(RecurrenceInfo recurrence)
  {
    this.recurrence = recurrence;
    return this;
  }
  

        /**
         * Automatic record type
         * Default: none
         * Enum: local, cloud, none
         */
        public String autoRecordType;
  public MeetingRequestResource autoRecordType(String autoRecordType)
  {
    this.autoRecordType = autoRecordType;
    return this;
  }
  

        /**
         * If true, then only signed-in users can join this meeting
         */
        public Boolean enforceLogin;
  public MeetingRequestResource enforceLogin(Boolean enforceLogin)
  {
    this.enforceLogin = enforceLogin;
    return this;
  }
  

        /**
         * If true, then participants are muted on entry
         */
        public Boolean muteParticipantsOnEntry;
  public MeetingRequestResource muteParticipantsOnEntry(Boolean muteParticipantsOnEntry)
  {
    this.muteParticipantsOnEntry = muteParticipantsOnEntry;
    return this;
  }
  

        /**
         * If true, then the waiting room for participants is enabled
         */
        public Boolean enableWaitingRoom;
  public MeetingRequestResource enableWaitingRoom(Boolean enableWaitingRoom)
  {
    this.enableWaitingRoom = enableWaitingRoom;
    return this;
  }
  

        /**
         * List of global dial-in countries (eg. US, UK, AU, etc.)
         */
        public String[] globalDialInCountries;
  public MeetingRequestResource globalDialInCountries(String[] globalDialInCountries)
  {
    this.globalDialInCountries = globalDialInCountries;
    return this;
  }
  
}
