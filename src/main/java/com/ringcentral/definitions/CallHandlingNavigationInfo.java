package com.ringcentral.definitions;


    // Information on navigation
public class CallHandlingNavigationInfo
{
    /**
         */
        public CallHandlingNavigationInfoUri firstPage;
  public CallHandlingNavigationInfo firstPage(CallHandlingNavigationInfoUri firstPage)
  {
    this.firstPage = firstPage;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfoUri nextPage;
  public CallHandlingNavigationInfo nextPage(CallHandlingNavigationInfoUri nextPage)
  {
    this.nextPage = nextPage;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfoUri previousPage;
  public CallHandlingNavigationInfo previousPage(CallHandlingNavigationInfoUri previousPage)
  {
    this.previousPage = previousPage;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfoUri lastPage;
  public CallHandlingNavigationInfo lastPage(CallHandlingNavigationInfoUri lastPage)
  {
    this.lastPage = lastPage;
    return this;
  }
  
}
