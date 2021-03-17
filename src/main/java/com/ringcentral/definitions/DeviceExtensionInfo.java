package com.ringcentral.definitions;


    // Internal identifier of an extension the device should be assigned to
public class DeviceExtensionInfo
{
    /**
         * Internal identifier of an extension
         */
        public Long id;
  public DeviceExtensionInfo id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to an extension resource
         */
        public String uri;
  public DeviceExtensionInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Number of extension
         */
        public String extensionNumber;
  public DeviceExtensionInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  
}
