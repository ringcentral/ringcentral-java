package com.ringcentral.definitions;


    // Scheduling meeting settings locked on account level || Settings defining how to schedule user meetingsxs
public class ScheduleUserMeetingInfo
{
    /**
         * If true, then only signed-in users can join this meeting
         */
        public Boolean enforceLogin;
  public ScheduleUserMeetingInfo enforceLogin(Boolean enforceLogin)
  {
    this.enforceLogin = enforceLogin;
    return this;
  }
  

        /**
         * Starting meetings with host video on/off (true/false)
         */
        public Boolean startHostVideo;
  public ScheduleUserMeetingInfo startHostVideo(Boolean startHostVideo)
  {
    this.startHostVideo = startHostVideo;
    return this;
  }
  

        /**
         * Starting meetings with participant video on/off (true/false)
         */
        public Boolean startParticipantsVideo;
  public ScheduleUserMeetingInfo startParticipantsVideo(Boolean startParticipantsVideo)
  {
    this.startParticipantsVideo = startParticipantsVideo;
    return this;
  }
  

        /**
         * Determines how participants can join the audio channel of a meeting
         */
        public String[] audioOptions;
  public ScheduleUserMeetingInfo audioOptions(String[] audioOptions)
  {
    this.audioOptions = audioOptions;
    return this;
  }
  

        /**
         * Allows participants to join the meeting before the host arrives
         */
        public Boolean allowJoinBeforeHost;
  public ScheduleUserMeetingInfo allowJoinBeforeHost(Boolean allowJoinBeforeHost)
  {
    this.allowJoinBeforeHost = allowJoinBeforeHost;
    return this;
  }
  

        /**
         * Determines whether to use Personal Meeting ID (PMI) when scheduling a meeting
         */
        public Boolean usePmiForScheduledMeetings;
  public ScheduleUserMeetingInfo usePmiForScheduledMeetings(Boolean usePmiForScheduledMeetings)
  {
    this.usePmiForScheduledMeetings = usePmiForScheduledMeetings;
    return this;
  }
  

        /**
         * Determines whether to use Personal Meeting ID (PMI) when starting an instant meeting
         */
        public Boolean usePmiForInstantMeetings;
  public ScheduleUserMeetingInfo usePmiForInstantMeetings(Boolean usePmiForInstantMeetings)
  {
    this.usePmiForInstantMeetings = usePmiForInstantMeetings;
    return this;
  }
  

        /**
         * A password will be generated when scheduling a meeting and participants will require password to join a meeting. The Personal Meeting ID (PMI) meetings are not included
         */
        public Boolean requirePasswordForSchedulingNewMeetings;
  public ScheduleUserMeetingInfo requirePasswordForSchedulingNewMeetings(Boolean requirePasswordForSchedulingNewMeetings)
  {
    this.requirePasswordForSchedulingNewMeetings = requirePasswordForSchedulingNewMeetings;
    return this;
  }
  

        /**
         * Specifies whether to require a password for meetings which have already been scheduled
         */
        public Boolean requirePasswordForScheduledMeetings;
  public ScheduleUserMeetingInfo requirePasswordForScheduledMeetings(Boolean requirePasswordForScheduledMeetings)
  {
    this.requirePasswordForScheduledMeetings = requirePasswordForScheduledMeetings;
    return this;
  }
  

        /**
         * Password for already scheduled meetings. Users can set it individually
         */
        public String defaultPasswordForScheduledMeetings;
  public ScheduleUserMeetingInfo defaultPasswordForScheduledMeetings(String defaultPasswordForScheduledMeetings)
  {
    this.defaultPasswordForScheduledMeetings = defaultPasswordForScheduledMeetings;
    return this;
  }
  

        /**
         * A random password will be generated for an instant meeting, if set to 'True'. If you use PMI for your instant meetings, this option will be disabled
         */
        public Boolean requirePasswordForInstantMeetings;
  public ScheduleUserMeetingInfo requirePasswordForInstantMeetings(Boolean requirePasswordForInstantMeetings)
  {
    this.requirePasswordForInstantMeetings = requirePasswordForInstantMeetings;
    return this;
  }
  

        /**
         * Specifies whether to require a password for meetings using Personal Meeting ID (PMI). The supported values are: 'none', 'all' and 'jbhOnly' (joined before host only)
         * Enum: all, none, jbhOnly
         */
        public String requirePasswordForPmiMeetings;
  public ScheduleUserMeetingInfo requirePasswordForPmiMeetings(String requirePasswordForPmiMeetings)
  {
    this.requirePasswordForPmiMeetings = requirePasswordForPmiMeetings;
    return this;
  }
  

        /**
         * The default password for Personal Meeting ID (PMI) meetings
         */
        public String pmiPassword;
  public ScheduleUserMeetingInfo pmiPassword(String pmiPassword)
  {
    this.pmiPassword = pmiPassword;
    return this;
  }
  

        /**
         * Specifies whether to generate and require a password for participants joining by phone
         */
        public Boolean pstnPasswordProtected;
  public ScheduleUserMeetingInfo pstnPasswordProtected(Boolean pstnPasswordProtected)
  {
    this.pstnPasswordProtected = pstnPasswordProtected;
    return this;
  }
  
}
