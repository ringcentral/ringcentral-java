package com.ringcentral.definitions;


public class CallRecordingExtensions
{
    /**
         * Link to call recording extension list resource
         */
        public String uri;
  public CallRecordingExtensions uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public CallRecordingExtensionInfo[] records;
  public CallRecordingExtensions records(CallRecordingExtensionInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfo navigation;
  public CallRecordingExtensions navigation(CallHandlingNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public CallHandlingPagingInfo paging;
  public CallRecordingExtensions paging(CallHandlingPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
