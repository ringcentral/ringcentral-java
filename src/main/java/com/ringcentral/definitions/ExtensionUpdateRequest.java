package com.ringcentral.definitions;


public class ExtensionUpdateRequest
{
    /**
         * Enum: Disabled, Enabled, NotActivated, Frozen
         */
        public String status;
  public ExtensionUpdateRequest status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public ExtensionStatusInfo statusInfo;
  public ExtensionUpdateRequest statusInfo(ExtensionStatusInfo statusInfo)
  {
    this.statusInfo = statusInfo;
    return this;
  }
  

        /**
         * Type of suspension
         */
        public String reason;
  public ExtensionUpdateRequest reason(String reason)
  {
    this.reason = reason;
    return this;
  }
  

        /**
         * Free Form user comment
         */
        public String comment;
  public ExtensionUpdateRequest comment(String comment)
  {
    this.comment = comment;
    return this;
  }
  

        /**
         * Extension number available
         */
        public String extensionNumber;
  public ExtensionUpdateRequest extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public ContactInfoUpdateRequest contact;
  public ExtensionUpdateRequest contact(ContactInfoUpdateRequest contact)
  {
    this.contact = contact;
    return this;
  }
  

        /**
         */
        public ExtensionRegionalSettingRequest regionalSettings;
  public ExtensionUpdateRequest regionalSettings(ExtensionRegionalSettingRequest regionalSettings)
  {
    this.regionalSettings = regionalSettings;
    return this;
  }
  

        /**
         * Enum: NotStarted, Incomplete, Completed
         */
        public String setupWizardState;
  public ExtensionUpdateRequest setupWizardState(String setupWizardState)
  {
    this.setupWizardState = setupWizardState;
    return this;
  }
  

        /**
         * Additional extension identifier, created by partner application and applied on client side
         */
        public String partnerId;
  public ExtensionUpdateRequest partnerId(String partnerId)
  {
    this.partnerId = partnerId;
    return this;
  }
  

        /**
         * IVR PIN
         */
        public String ivrPin;
  public ExtensionUpdateRequest ivrPin(String ivrPin)
  {
    this.ivrPin = ivrPin;
    return this;
  }
  

        /**
         * Password for extension
         */
        public String password;
  public ExtensionUpdateRequest password(String password)
  {
    this.password = password;
    return this;
  }
  

        /**
         */
        public CallQueueInfoRequest callQueueInfo;
  public ExtensionUpdateRequest callQueueInfo(CallQueueInfoRequest callQueueInfo)
  {
    this.callQueueInfo = callQueueInfo;
    return this;
  }
  

        /**
         */
        public UserTransitionInfo transition;
  public ExtensionUpdateRequest transition(UserTransitionInfo transition)
  {
    this.transition = transition;
    return this;
  }
  

        /**
         */
        public CustomFieldInfo[] customFields;
  public ExtensionUpdateRequest customFields(CustomFieldInfo[] customFields)
  {
    this.customFields = customFields;
    return this;
  }
  

        /**
         * Hides extension from showing in company directory. Supported for extensions of User type only
         */
        public Boolean hidden;
  public ExtensionUpdateRequest hidden(Boolean hidden)
  {
    this.hidden = hidden;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public ExtensionUpdateRequest site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         * Extension type. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: User, Fax User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, ParkLocation, DelegatedLinesGroup, GroupCallPickup
         */
        public String type;
  public ExtensionUpdateRequest type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * List of non-RC internal identifiers assigned to an extension
         */
        public ReferenceInfo[] references;
  public ExtensionUpdateRequest references(ReferenceInfo[] references)
  {
    this.references = references;
    return this;
  }
  
}
