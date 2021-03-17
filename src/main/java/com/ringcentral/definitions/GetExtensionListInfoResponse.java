package com.ringcentral.definitions;


public class GetExtensionListInfoResponse
{
    /**
         * Internal identifier of an extension
         */
        public Long id;
  public GetExtensionListInfoResponse id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of an extension
         */
        public String uri;
  public GetExtensionListInfoResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public ContactInfo contact;
  public GetExtensionListInfoResponse contact(ContactInfo contact)
  {
    this.contact = contact;
    return this;
  }
  

        /**
         * Number of an extension
         */
        public String extensionNumber;
  public GetExtensionListInfoResponse extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Extension name. For user extension types the value is a combination of the specified first name and last name
         */
        public String name;
  public GetExtensionListInfoResponse name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public ExtensionPermissions permissions;
  public GetExtensionListInfoResponse permissions(ExtensionPermissions permissions)
  {
    this.permissions = permissions;
    return this;
  }
  

        /**
         */
        public ProfileImageInfo profileImage;
  public GetExtensionListInfoResponse profileImage(ProfileImageInfo profileImage)
  {
    this.profileImage = profileImage;
    return this;
  }
  

        /**
         * Extension current state. If 'Unassigned' is specified, then extensions without ‘extensionNumber’ are returned. If not specified, then all extensions are returned
         * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
         */
        public String status;
  public GetExtensionListInfoResponse status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Extension type. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Bot, Room, Limited, Site, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup
         */
        public String type;
  public GetExtensionListInfoResponse type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         */
        public CallQueueExtensionInfo callQueueInfo;
  public GetExtensionListInfoResponse callQueueInfo(CallQueueExtensionInfo callQueueInfo)
  {
    this.callQueueInfo = callQueueInfo;
    return this;
  }
  

        /**
         * Hides extension from showing in company directory. Supported for extensions of User type only
         */
        public Boolean hidden;
  public GetExtensionListInfoResponse hidden(Boolean hidden)
  {
    this.hidden = hidden;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public GetExtensionListInfoResponse site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  
}
