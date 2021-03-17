package com.ringcentral.definitions;


public class GetMessageList
{
    /**
         * Link to the list of user messages
         */
        public String uri;
  public GetMessageList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of records with message information
         * Required
         */
        public GetMessageInfoResponse[] records;
  public GetMessageList records(GetMessageInfoResponse[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public MessagingNavigationInfo navigation;
  public GetMessageList navigation(MessagingNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public MessagingPagingInfo paging;
  public GetMessageList paging(MessagingPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
