package com.ringcentral.definitions;


public class ProfileImageResource
{
    /**
         */
        public String uri;
  public ProfileImageResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public String etag;
  public ProfileImageResource etag(String etag)
  {
    this.etag = etag;
    return this;
  }
  

        /**
         */
        public String contentType;
  public ProfileImageResource contentType(String contentType)
  {
    this.contentType = contentType;
    return this;
  }
  

        /**
         */
        public String lastModified;
  public ProfileImageResource lastModified(String lastModified)
  {
    this.lastModified = lastModified;
    return this;
  }
  

        /**
         */
        public ScaledProfileImageResource[] scales;
  public ProfileImageResource scales(ScaledProfileImageResource[] scales)
  {
    this.scales = scales;
    return this;
  }
  
}
