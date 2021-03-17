package com.ringcentral.definitions;


    // Information on extension, for which this presence data is returned
public class GetPresenceExtensionInfo
{
    /**
         * Internal identifier of an extension
         */
        public Long id;
  public GetPresenceExtensionInfo id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of an extension
         */
        public String uri;
  public GetPresenceExtensionInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Extension number (usually 3 or 4 digits)
         */
        public String extensionNumber;
  public GetPresenceExtensionInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  
}
