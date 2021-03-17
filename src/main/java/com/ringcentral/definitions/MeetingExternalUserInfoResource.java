package com.ringcentral.definitions;


public class MeetingExternalUserInfoResource
{
    /**
         */
        public String uri;
  public MeetingExternalUserInfoResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public String userId;
  public MeetingExternalUserInfoResource userId(String userId)
  {
    this.userId = userId;
    return this;
  }
  

        /**
         */
        public String accountId;
  public MeetingExternalUserInfoResource accountId(String accountId)
  {
    this.accountId = accountId;
    return this;
  }
  

        /**
         */
        public Long userType;
  public MeetingExternalUserInfoResource userType(Long userType)
  {
    this.userType = userType;
    return this;
  }
  

        /**
         */
        public String userToken;
  public MeetingExternalUserInfoResource userToken(String userToken)
  {
    this.userToken = userToken;
    return this;
  }
  

        /**
         */
        public String hostKey;
  public MeetingExternalUserInfoResource hostKey(String hostKey)
  {
    this.hostKey = hostKey;
    return this;
  }
  

        /**
         */
        public String personalMeetingId;
  public MeetingExternalUserInfoResource personalMeetingId(String personalMeetingId)
  {
    this.personalMeetingId = personalMeetingId;
    return this;
  }
  

        /**
         * Link to the user's personal meeting room, used as an alias for personal meeting URL (with personal meeting ID)
         */
        public String personalLink;
  public MeetingExternalUserInfoResource personalLink(String personalLink)
  {
    this.personalLink = personalLink;
    return this;
  }
  

        /**
         * Enables using personal meeting ID for instant meetings
         */
        public Boolean usePmiForInstantMeetings;
  public MeetingExternalUserInfoResource usePmiForInstantMeetings(Boolean usePmiForInstantMeetings)
  {
    this.usePmiForInstantMeetings = usePmiForInstantMeetings;
    return this;
  }
  
}
