package com.ringcentral.definitions;


    // Information on navigation
public class CallLogNavigationInfo
{
    /**
         */
        public CallLogNavigationInfoURI firstPage;
  public CallLogNavigationInfo firstPage(CallLogNavigationInfoURI firstPage)
  {
    this.firstPage = firstPage;
    return this;
  }
  

        /**
         */
        public CallLogNavigationInfoURI nextPage;
  public CallLogNavigationInfo nextPage(CallLogNavigationInfoURI nextPage)
  {
    this.nextPage = nextPage;
    return this;
  }
  

        /**
         */
        public CallLogNavigationInfoURI previousPage;
  public CallLogNavigationInfo previousPage(CallLogNavigationInfoURI previousPage)
  {
    this.previousPage = previousPage;
    return this;
  }
  
}
