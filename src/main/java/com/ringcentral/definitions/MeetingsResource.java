package com.ringcentral.definitions;


public class MeetingsResource
{
    /**
         */
        public String uri;
  public MeetingsResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public MeetingResponseResource[] records;
  public MeetingsResource records(MeetingResponseResource[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public MeetingsPagingInfo paging;
  public MeetingsResource paging(MeetingsPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  

        /**
         */
        public MeetingsNavigationInfo navigation;
  public MeetingsResource navigation(MeetingsNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  
}
