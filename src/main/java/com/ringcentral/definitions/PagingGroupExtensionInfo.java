package com.ringcentral.definitions;


public class PagingGroupExtensionInfo
{
    /**
         * Internal identifier of a paging group user extension
         */
        public String id;
  public PagingGroupExtensionInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a paging group user extension
         */
        public String uri;
  public PagingGroupExtensionInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Extension number of a paging group user
         */
        public String extensionNumber;
  public PagingGroupExtensionInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Name of a paging group user
         */
        public String name;
  public PagingGroupExtensionInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
