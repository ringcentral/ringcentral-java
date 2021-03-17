package com.ringcentral.definitions;


public class AuthProfileCheckResource
{
    /**
         */
        public String uri;
  public AuthProfileCheckResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public Boolean successful;
  public AuthProfileCheckResource successful(Boolean successful)
  {
    this.successful = successful;
    return this;
  }
  

        /**
         */
        public ActivePermissionResource details;
  public AuthProfileCheckResource details(ActivePermissionResource details)
  {
    this.details = details;
    return this;
  }
  
}
