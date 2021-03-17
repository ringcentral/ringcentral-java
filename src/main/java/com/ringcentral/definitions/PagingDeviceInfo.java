package com.ringcentral.definitions;


public class PagingDeviceInfo
{
    /**
         * Internal identifier of a paging device
         */
        public String id;
  public PagingDeviceInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a paging device resource
         */
        public String uri;
  public PagingDeviceInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Name of a paging device
         */
        public String name;
  public PagingDeviceInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
