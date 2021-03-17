package com.ringcentral.definitions;


public class GetVersionResponse
{
    /**
         * Canonical URI of the version info resource
         */
        public String uri;
  public GetVersionResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Version of the RingCentral REST API
         */
        public String versionString;
  public GetVersionResponse versionString(String versionString)
  {
    this.versionString = versionString;
    return this;
  }
  

        /**
         * Release date of this version
         */
        public String releaseDate;
  public GetVersionResponse releaseDate(String releaseDate)
  {
    this.releaseDate = releaseDate;
    return this;
  }
  

        /**
         * URI part determining the current version
         */
        public String uriString;
  public GetVersionResponse uriString(String uriString)
  {
    this.uriString = uriString;
    return this;
  }
  
}
