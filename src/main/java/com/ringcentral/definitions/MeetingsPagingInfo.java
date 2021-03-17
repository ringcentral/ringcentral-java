package com.ringcentral.definitions;


public class MeetingsPagingInfo
{
    /**
         */
        public Long page;
  public MeetingsPagingInfo page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         */
        public Long totalPages;
  public MeetingsPagingInfo totalPages(Long totalPages)
  {
    this.totalPages = totalPages;
    return this;
  }
  

        /**
         */
        public Long perPage;
  public MeetingsPagingInfo perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         */
        public Long totalElements;
  public MeetingsPagingInfo totalElements(Long totalElements)
  {
    this.totalElements = totalElements;
    return this;
  }
  

        /**
         */
        public Long pageStart;
  public MeetingsPagingInfo pageStart(Long pageStart)
  {
    this.pageStart = pageStart;
    return this;
  }
  

        /**
         */
        public Long pageEnd;
  public MeetingsPagingInfo pageEnd(Long pageEnd)
  {
    this.pageEnd = pageEnd;
    return this;
  }
  
}
