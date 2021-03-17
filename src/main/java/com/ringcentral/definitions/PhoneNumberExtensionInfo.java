package com.ringcentral.definitions;


    // Information on an extension to which the phone number is assigned
public class PhoneNumberExtensionInfo
{
    /**
         */
        public String uri;
  public PhoneNumberExtensionInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public String id;
  public PhoneNumberExtensionInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public String partnerId;
  public PhoneNumberExtensionInfo partnerId(String partnerId)
  {
    this.partnerId = partnerId;
    return this;
  }
  

        /**
         */
        public String extensionNumber;
  public PhoneNumberExtensionInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public String loginName;
  public PhoneNumberExtensionInfo loginName(String loginName)
  {
    this.loginName = loginName;
    return this;
  }
  

        /**
         */
        public ExtensionContactInfo contact;
  public PhoneNumberExtensionInfo contact(ExtensionContactInfo contact)
  {
    this.contact = contact;
    return this;
  }
  

        /**
         */
        public Reference[] references;
  public PhoneNumberExtensionInfo references(Reference[] references)
  {
    this.references = references;
    return this;
  }
  

        /**
         */
        public String name;
  public PhoneNumberExtensionInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Extension type. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: Unknown, User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, IvrMenu, ApplicationExtension, ParkLocation
         */
        public String type;
  public PhoneNumberExtensionInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned
         */
        public String status;
  public PhoneNumberExtensionInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public StatusInfo statusInfo;
  public PhoneNumberExtensionInfo statusInfo(StatusInfo statusInfo)
  {
    this.statusInfo = statusInfo;
    return this;
  }
  

        /**
         */
        public DepartmentResource[] departments;
  public PhoneNumberExtensionInfo departments(DepartmentResource[] departments)
  {
    this.departments = departments;
    return this;
  }
  

        /**
         */
        public ServiceFeatureValue[] serviceFeatures;
  public PhoneNumberExtensionInfo serviceFeatures(ServiceFeatureValue[] serviceFeatures)
  {
    this.serviceFeatures = serviceFeatures;
    return this;
  }
  

        /**
         */
        public RegionalSettingsInfo regionalSettings;
  public PhoneNumberExtensionInfo regionalSettings(RegionalSettingsInfo regionalSettings)
  {
    this.regionalSettings = regionalSettings;
    return this;
  }
  

        /**
         * Enum: NotStarted, Incomplete, Completed, Unknown
         */
        public String setupWizardState;
  public PhoneNumberExtensionInfo setupWizardState(String setupWizardState)
  {
    this.setupWizardState = setupWizardState;
    return this;
  }
  

        /**
         */
        public ExtensionPermissionsResource permissions;
  public PhoneNumberExtensionInfo permissions(ExtensionPermissionsResource permissions)
  {
    this.permissions = permissions;
    return this;
  }
  

        /**
         */
        public String password;
  public PhoneNumberExtensionInfo password(String password)
  {
    this.password = password;
    return this;
  }
  

        /**
         */
        public String ivrPin;
  public PhoneNumberExtensionInfo ivrPin(String ivrPin)
  {
    this.ivrPin = ivrPin;
    return this;
  }
  

        /**
         */
        public ProfileImageResource profileImage;
  public PhoneNumberExtensionInfo profileImage(ProfileImageResource profileImage)
  {
    this.profileImage = profileImage;
    return this;
  }
  
}
