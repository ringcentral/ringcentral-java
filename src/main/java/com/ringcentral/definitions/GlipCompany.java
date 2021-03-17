package com.ringcentral.definitions;


public class GlipCompany
{
    /**
         * Internal identifier of an RC account/Glip company, or tilde (~) to indicate a company the current user belongs to
         * Required
         */
        public String id;
  public GlipCompany id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Name of a company
         */
        public String name;
  public GlipCompany name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Domain name of a company
         */
        public String domain;
  public GlipCompany domain(String domain)
  {
    this.domain = domain;
    return this;
  }
  

        /**
         * Datetime of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
         * Required
         */
        public String creationTime;
  public GlipCompany creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Datetime of last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
         * Required
         */
        public String lastModifiedTime;
  public GlipCompany lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  
}
