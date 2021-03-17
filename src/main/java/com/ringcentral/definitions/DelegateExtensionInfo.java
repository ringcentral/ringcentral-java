package com.ringcentral.definitions;


public class DelegateExtensionInfo
{
    /**
         * Canonical URI of an extension
         */
        public String uri;
  public DelegateExtensionInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Extension name
         */
        public String name;
  public DelegateExtensionInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Number of an extension
         */
        public String extensionNumber;
  public DelegateExtensionInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  
}
