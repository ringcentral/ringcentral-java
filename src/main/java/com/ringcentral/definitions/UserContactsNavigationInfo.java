package com.ringcentral.definitions;


    // Information on navigation
public class UserContactsNavigationInfo
{
    /**
         */
        public UserContactsNavigationInfoUri firstPage;
  public UserContactsNavigationInfo firstPage(UserContactsNavigationInfoUri firstPage)
  {
    this.firstPage = firstPage;
    return this;
  }
  

        /**
         */
        public UserContactsNavigationInfoUri nextPage;
  public UserContactsNavigationInfo nextPage(UserContactsNavigationInfoUri nextPage)
  {
    this.nextPage = nextPage;
    return this;
  }
  

        /**
         */
        public UserContactsNavigationInfoUri previousPage;
  public UserContactsNavigationInfo previousPage(UserContactsNavigationInfoUri previousPage)
  {
    this.previousPage = previousPage;
    return this;
  }
  

        /**
         */
        public UserContactsNavigationInfoUri lastPage;
  public UserContactsNavigationInfo lastPage(UserContactsNavigationInfoUri lastPage)
  {
    this.lastPage = lastPage;
    return this;
  }
  
}
