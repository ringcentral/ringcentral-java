package com.ringcentral.definitions;


public class ArchiveInfo
{
    /**
         * Archive size in bytes
         */
        public Long size;
  public ArchiveInfo size(Long size)
  {
    this.size = size;
    return this;
  }
  

        /**
         * Link for archive download
         */
        public String uri;
  public ArchiveInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  
}
