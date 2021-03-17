package com.ringcentral.definitions;


public class FederationResource
{
    /**
         */
        public FederatedAccountResource[] accounts;
  public FederationResource accounts(FederatedAccountResource[] accounts)
  {
    this.accounts = accounts;
    return this;
  }
  

        /**
         */
        public String creationTime;
  public FederationResource creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         */
        public String displayName;
  public FederationResource displayName(String displayName)
  {
    this.displayName = displayName;
    return this;
  }
  

        /**
         */
        public String id;
  public FederationResource id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public String lastModifiedTime;
  public FederationResource lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  
}
