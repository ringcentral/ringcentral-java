package com.ringcentral.definitions;


    // Extension profile image information. Not returned if profile images are absent for an extension
public class CompanyDirectoryProfileImageInfo
{
    /**
         * Link to a profile image resource
         */
        public String uri;
  public CompanyDirectoryProfileImageInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of an image
         */
        public String etag;
  public CompanyDirectoryProfileImageInfo etag(String etag)
  {
    this.etag = etag;
    return this;
  }
  
}
