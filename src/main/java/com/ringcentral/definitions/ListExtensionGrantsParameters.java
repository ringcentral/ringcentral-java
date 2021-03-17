package com.ringcentral.definitions;


public class ListExtensionGrantsParameters
{
    /**
         * Type of extension to be returned. Multiple values are supported. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Limited, Bot
         */
        public String extensionType;
  public ListExtensionGrantsParameters extensionType(String extensionType)
  {
    this.extensionType = extensionType;
    return this;
  }
  

        /**
         * Default: 1
         */
        public String page;
  public ListExtensionGrantsParameters page(String page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Default: 100
         */
        public String perPage;
  public ListExtensionGrantsParameters perPage(String perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
