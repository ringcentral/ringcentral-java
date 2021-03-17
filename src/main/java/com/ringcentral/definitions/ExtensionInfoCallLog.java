package com.ringcentral.definitions;


    // Information on extension
public class ExtensionInfoCallLog
{
    /**
         * Internal identifier of an extension
         */
        public Long id;
  public ExtensionInfoCallLog id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of an extension
         */
        public String uri;
  public ExtensionInfoCallLog uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  
}
