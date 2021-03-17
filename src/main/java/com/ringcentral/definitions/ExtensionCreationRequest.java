package com.ringcentral.definitions;


public class ExtensionCreationRequest
{
    /**
         */
        public ContactInfoCreationRequest contact;
  public ExtensionCreationRequest contact(ContactInfoCreationRequest contact)
  {
    this.contact = contact;
    return this;
  }
  

        /**
         * Number of extension
         */
        public String extensionNumber;
  public ExtensionCreationRequest extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public CustomFieldInfo[] customFields;
  public ExtensionCreationRequest customFields(CustomFieldInfo[] customFields)
  {
    this.customFields = customFields;
    return this;
  }
  

        /**
         * Password for extension. If not specified, the password is auto-generated
         */
        public String password;
  public ExtensionCreationRequest password(String password)
  {
    this.password = password;
    return this;
  }
  

        /**
         * List of non-RC internal identifiers assigned to an extension
         */
        public ReferenceInfo[] references;
  public ExtensionCreationRequest references(ReferenceInfo[] references)
  {
    this.references = references;
    return this;
  }
  

        /**
         */
        public RegionalSettings regionalSettings;
  public ExtensionCreationRequest regionalSettings(RegionalSettings regionalSettings)
  {
    this.regionalSettings = regionalSettings;
    return this;
  }
  

        /**
         * Additional extension identifier, created by partner application and applied on client side
         */
        public String partnerId;
  public ExtensionCreationRequest partnerId(String partnerId)
  {
    this.partnerId = partnerId;
    return this;
  }
  

        /**
         * IVR PIN
         */
        public String ivrPin;
  public ExtensionCreationRequest ivrPin(String ivrPin)
  {
    this.ivrPin = ivrPin;
    return this;
  }
  

        /**
         * Specifies extension configuration wizard state (web service setup).
         * Default: NotStarted
         * Enum: NotStarted, Incomplete, Completed
         */
        public String setupWizardState;
  public ExtensionCreationRequest setupWizardState(String setupWizardState)
  {
    this.setupWizardState = setupWizardState;
    return this;
  }
  

        /**
         */
        public SiteInfo site;
  public ExtensionCreationRequest site(SiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         * Extension current state
         * Enum: Enabled, Disabled, NotActivated, Unassigned, Frozen
         */
        public String status;
  public ExtensionCreationRequest status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public ExtensionStatusInfo statusInfo;
  public ExtensionCreationRequest statusInfo(ExtensionStatusInfo statusInfo)
  {
    this.statusInfo = statusInfo;
    return this;
  }
  

        /**
         * Extension type. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, Limited
         */
        public String type;
  public ExtensionCreationRequest type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Hides extension from showing in company directory. Supported for extensions of User type only. For unassigned extensions the value is set to 'True' by default. For assigned extensions the value is set to 'False' by default
         */
        public Boolean hidden;
  public ExtensionCreationRequest hidden(Boolean hidden)
  {
    this.hidden = hidden;
    return this;
  }
  
}
