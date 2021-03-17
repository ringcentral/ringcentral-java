package com.ringcentral.definitions;


public class GetExtensionInfoResponse
{
    /**
         * Internal identifier of an extension
         */
        public Long id;
  public GetExtensionInfoResponse id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of an extension
         */
        public String uri;
  public GetExtensionInfoResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public GetExtensionAccountInfo account;
  public GetExtensionInfoResponse account(GetExtensionAccountInfo account)
  {
    this.account = account;
    return this;
  }
  

        /**
         */
        public ContactInfo contact;
  public GetExtensionInfoResponse contact(ContactInfo contact)
  {
    this.contact = contact;
    return this;
  }
  

        /**
         */
        public CustomFieldInfo[] customFields;
  public GetExtensionInfoResponse customFields(CustomFieldInfo[] customFields)
  {
    this.customFields = customFields;
    return this;
  }
  

        /**
         * Information on department extension(s), to which the requested extension belongs. Returned only for user extensions, members of department, requested by single extensionId. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         */
        public DepartmentInfo[] departments;
  public GetExtensionInfoResponse departments(DepartmentInfo[] departments)
  {
    this.departments = departments;
    return this;
  }
  

        /**
         * Number of extension
         */
        public String extensionNumber;
  public GetExtensionInfoResponse extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public String[] extensionNumbers;
  public GetExtensionInfoResponse extensionNumbers(String[] extensionNumbers)
  {
    this.extensionNumbers = extensionNumbers;
    return this;
  }
  

        /**
         * Extension name. For user extension types the value is a combination of the specified first name and last name
         */
        public String name;
  public GetExtensionInfoResponse name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * For Partner Applications Internal identifier of an extension created by partner. The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension ID for each partner ID of a client application. In request URIs partner IDs are accepted instead of regular RingCentral native IDs as path parameters using pid = XXX clause. Though in response URIs contain the corresponding account IDs and extension IDs. In all request and response bodies these values are reflected via partnerId attributes of account and extension
         */
        public String partnerId;
  public GetExtensionInfoResponse partnerId(String partnerId)
  {
    this.partnerId = partnerId;
    return this;
  }
  

        /**
         */
        public ExtensionPermissions permissions;
  public GetExtensionInfoResponse permissions(ExtensionPermissions permissions)
  {
    this.permissions = permissions;
    return this;
  }
  

        /**
         */
        public ProfileImageInfo profileImage;
  public GetExtensionInfoResponse profileImage(ProfileImageInfo profileImage)
  {
    this.profileImage = profileImage;
    return this;
  }
  

        /**
         * List of non-RC internal identifiers assigned to an extension
         */
        public ReferenceInfo[] references;
  public GetExtensionInfoResponse references(ReferenceInfo[] references)
  {
    this.references = references;
    return this;
  }
  

        /**
         */
        public Roles[] roles;
  public GetExtensionInfoResponse roles(Roles[] roles)
  {
    this.roles = roles;
    return this;
  }
  

        /**
         */
        public RegionalSettings regionalSettings;
  public GetExtensionInfoResponse regionalSettings(RegionalSettings regionalSettings)
  {
    this.regionalSettings = regionalSettings;
    return this;
  }
  

        /**
         * Extension service features returned in response only when the logged-in user requests his/her own extension info, see also Extension Service Features
         */
        public ExtensionServiceFeatureInfo[] serviceFeatures;
  public GetExtensionInfoResponse serviceFeatures(ExtensionServiceFeatureInfo[] serviceFeatures)
  {
    this.serviceFeatures = serviceFeatures;
    return this;
  }
  

        /**
         * Specifies extension configuration wizard state (web service setup).
         * Default: NotStarted
         * Enum: NotStarted, Incomplete, Completed
         */
        public String setupWizardState;
  public GetExtensionInfoResponse setupWizardState(String setupWizardState)
  {
    this.setupWizardState = setupWizardState;
    return this;
  }
  

        /**
         * Extension current state. If 'Unassigned' is specified, then extensions without ‘extensionNumber’ are returned. If not specified, then all extensions are returned
         * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
         */
        public String status;
  public GetExtensionInfoResponse status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public ExtensionStatusInfo statusInfo;
  public GetExtensionInfoResponse statusInfo(ExtensionStatusInfo statusInfo)
  {
    this.statusInfo = statusInfo;
    return this;
  }
  

        /**
         * Extension type. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: User, FaxUser, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, Bot, Room, Limited, Site, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup
         */
        public String type;
  public GetExtensionInfoResponse type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         */
        public CallQueueExtensionInfo callQueueInfo;
  public GetExtensionInfoResponse callQueueInfo(CallQueueExtensionInfo callQueueInfo)
  {
    this.callQueueInfo = callQueueInfo;
    return this;
  }
  

        /**
         * Hides extension from showing in company directory. Supported for extensions of User type only
         */
        public Boolean hidden;
  public GetExtensionInfoResponse hidden(Boolean hidden)
  {
    this.hidden = hidden;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public GetExtensionInfoResponse site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  
}
