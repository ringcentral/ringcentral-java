package com.ringcentral.definitions;


public class MeetingResponseResource
{
    /**
         * Link to a meeting resource
         */
        public String uri;
  public MeetingResponseResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Universally unique identifier of a meeting"
         */
        public String uuid;
  public MeetingResponseResource uuid(String uuid)
  {
    this.uuid = uuid;
    return this;
  }
  

        /**
         * Internal identifier of a meeting
         */
        public String id;
  public MeetingResponseResource id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Custom topic of a meeting
         */
        public String topic;
  public MeetingResponseResource topic(String topic)
  {
    this.topic = topic;
    return this;
  }
  

        /**
         * Enum: Instant, Scheduled, ScheduledRecurring, Recurring
         */
        public String meetingType;
  public MeetingResponseResource meetingType(String meetingType)
  {
    this.meetingType = meetingType;
    return this;
  }
  

        /**
         * Meeting password
         */
        public String password;
  public MeetingResponseResource password(String password)
  {
    this.password = password;
    return this;
  }
  

        /**
         */
        public String h323Password;
  public MeetingResponseResource h323Password(String h323Password)
  {
    this.h323Password = h323Password;
    return this;
  }
  

        /**
         * Status of a meeting
         */
        public String status;
  public MeetingResponseResource status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public MeetingLinks links;
  public MeetingResponseResource links(MeetingLinks links)
  {
    this.links = links;
    return this;
  }
  

        /**
         */
        public MeetingScheduleResource schedule;
  public MeetingResponseResource schedule(MeetingScheduleResource schedule)
  {
    this.schedule = schedule;
    return this;
  }
  

        /**
         */
        public HostInfoRequest host;
  public MeetingResponseResource host(HostInfoRequest host)
  {
    this.host = host;
    return this;
  }
  

        /**
         * If true, then participants can join the meeting before host arrives
         */
        public Boolean allowJoinBeforeHost;
  public MeetingResponseResource allowJoinBeforeHost(Boolean allowJoinBeforeHost)
  {
    this.allowJoinBeforeHost = allowJoinBeforeHost;
    return this;
  }
  

        /**
         * Starting meetings with host video on/off (true/false)
         */
        public Boolean startHostVideo;
  public MeetingResponseResource startHostVideo(Boolean startHostVideo)
  {
    this.startHostVideo = startHostVideo;
    return this;
  }
  

        /**
         * Starting meetings with participant video on/off (true/false)
         */
        public Boolean startParticipantsVideo;
  public MeetingResponseResource startParticipantsVideo(Boolean startParticipantsVideo)
  {
    this.startParticipantsVideo = startParticipantsVideo;
    return this;
  }
  

        /**
         */
        public String[] audioOptions;
  public MeetingResponseResource audioOptions(String[] audioOptions)
  {
    this.audioOptions = audioOptions;
    return this;
  }
  

        /**
         */
        public RecurrenceInfo reccurence;
  public MeetingResponseResource reccurence(RecurrenceInfo reccurence)
  {
    this.reccurence = reccurence;
    return this;
  }
  

        /**
         * Automatic record type
         * Default: none
         * Enum: local, cloud, none
         */
        public String autoRecordType;
  public MeetingResponseResource autoRecordType(String autoRecordType)
  {
    this.autoRecordType = autoRecordType;
    return this;
  }
  

        /**
         * If true, then only signed-in users can join this meeting
         */
        public Boolean enforceLogin;
  public MeetingResponseResource enforceLogin(Boolean enforceLogin)
  {
    this.enforceLogin = enforceLogin;
    return this;
  }
  

        /**
         * If true, then participants are muted on entry
         */
        public Boolean muteParticipantsOnEntry;
  public MeetingResponseResource muteParticipantsOnEntry(Boolean muteParticipantsOnEntry)
  {
    this.muteParticipantsOnEntry = muteParticipantsOnEntry;
    return this;
  }
  

        /**
         * If true, then the waiting room for participants is enabled
         */
        public Boolean enableWaitingRoom;
  public MeetingResponseResource enableWaitingRoom(Boolean enableWaitingRoom)
  {
    this.enableWaitingRoom = enableWaitingRoom;
    return this;
  }
  

        /**
         * List of global dial-in countries (eg. US, UK, AU, etc.)
         */
        public String[] globalDialInCountries;
  public MeetingResponseResource globalDialInCountries(String[] globalDialInCountries)
  {
    this.globalDialInCountries = globalDialInCountries;
    return this;
  }
  
}
