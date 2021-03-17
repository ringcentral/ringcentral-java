package com.ringcentral.definitions;


public class Roles
{
    /**
         * Link to a role
         */
        public String uri;
  public Roles uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a role
         */
        public String id;
  public Roles id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public Boolean autoAssigned;
  public Roles autoAssigned(Boolean autoAssigned)
  {
    this.autoAssigned = autoAssigned;
    return this;
  }
  

        /**
         */
        public String displayName;
  public Roles displayName(String displayName)
  {
    this.displayName = displayName;
    return this;
  }
  

        /**
         */
        public Boolean siteCompatible;
  public Roles siteCompatible(Boolean siteCompatible)
  {
    this.siteCompatible = siteCompatible;
    return this;
  }
  

        /**
         */
        public Boolean siteRestricted;
  public Roles siteRestricted(Boolean siteRestricted)
  {
    this.siteRestricted = siteRestricted;
    return this;
  }
  
}
