package com.ringcentral.definitions;


public class ExtensionBulkUpdateInfo
{
    /**
         * Internal identifier of an extension
         */
        public String id;
  public ExtensionBulkUpdateInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Enum: Disabled, Enabled, NotActivated, Frozen
         */
        public String status;
  public ExtensionBulkUpdateInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public ExtensionStatusInfo statusInfo;
  public ExtensionBulkUpdateInfo statusInfo(ExtensionStatusInfo statusInfo)
  {
    this.statusInfo = statusInfo;
    return this;
  }
  

        /**
         * Type of suspension
         */
        public String reason;
  public ExtensionBulkUpdateInfo reason(String reason)
  {
    this.reason = reason;
    return this;
  }
  

        /**
         * Free form user comment
         */
        public String comment;
  public ExtensionBulkUpdateInfo comment(String comment)
  {
    this.comment = comment;
    return this;
  }
  

        /**
         * Extension number available
         */
        public String extensionNumber;
  public ExtensionBulkUpdateInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public ContactInfoUpdateRequest contact;
  public ExtensionBulkUpdateInfo contact(ContactInfoUpdateRequest contact)
  {
    this.contact = contact;
    return this;
  }
  

        /**
         */
        public ExtensionRegionalSettingRequest regionalSettings;
  public ExtensionBulkUpdateInfo regionalSettings(ExtensionRegionalSettingRequest regionalSettings)
  {
    this.regionalSettings = regionalSettings;
    return this;
  }
  

        /**
         * Enum: NotStarted, Incomplete, Completed
         */
        public String setupWizardState;
  public ExtensionBulkUpdateInfo setupWizardState(String setupWizardState)
  {
    this.setupWizardState = setupWizardState;
    return this;
  }
  

        /**
         * Additional extension identifier created by partner application and applied on client side
         */
        public String partnerId;
  public ExtensionBulkUpdateInfo partnerId(String partnerId)
  {
    this.partnerId = partnerId;
    return this;
  }
  

        /**
         * IVR PIN
         */
        public String ivrPin;
  public ExtensionBulkUpdateInfo ivrPin(String ivrPin)
  {
    this.ivrPin = ivrPin;
    return this;
  }
  

        /**
         * Password for extension
         */
        public String password;
  public ExtensionBulkUpdateInfo password(String password)
  {
    this.password = password;
    return this;
  }
  

        /**
         */
        public CallQueueInfoRequest callQueueInfo;
  public ExtensionBulkUpdateInfo callQueueInfo(CallQueueInfoRequest callQueueInfo)
  {
    this.callQueueInfo = callQueueInfo;
    return this;
  }
  

        /**
         */
        public UserTransitionInfo transition;
  public ExtensionBulkUpdateInfo transition(UserTransitionInfo transition)
  {
    this.transition = transition;
    return this;
  }
  

        /**
         */
        public CustomFieldInfo[] customFields;
  public ExtensionBulkUpdateInfo customFields(CustomFieldInfo[] customFields)
  {
    this.customFields = customFields;
    return this;
  }
  

        /**
         * Hides extension from showing in company directory. Supported for extensions of User type only
         */
        public Boolean hidden;
  public ExtensionBulkUpdateInfo hidden(Boolean hidden)
  {
    this.hidden = hidden;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public ExtensionBulkUpdateInfo site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         * Extension type. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: User, Fax User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, DelegatedLinesGroup
         */
        public String type;
  public ExtensionBulkUpdateInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * List of non-RC internal identifiers assigned to an extension
         */
        public ReferenceInfo[] references;
  public ExtensionBulkUpdateInfo references(ReferenceInfo[] references)
  {
    this.references = references;
    return this;
  }
  
}
