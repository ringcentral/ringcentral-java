package com.ringcentral.definitions;


public class ContactDirectoryEvent
{
    /**
         * Internal identifier of an extension
         */
        public String id;
  public ContactDirectoryEvent id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of change
         */
        public String eventType;
  public ContactDirectoryEvent eventType(String eventType)
  {
    this.eventType = eventType;
    return this;
  }
  

        /**
         * Extension Type
         */
        public String type;
  public ContactDirectoryEvent type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Status of an extension
         * Enum: Disabled, Enabled, NotActivated
         */
        public String status;
  public ContactDirectoryEvent status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * First name of an extension user
         */
        public String firstName;
  public ContactDirectoryEvent firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * Last name of an extension user
         */
        public String lastName;
  public ContactDirectoryEvent lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Department Name
         */
        public String department;
  public ContactDirectoryEvent department(String department)
  {
    this.department = department;
    return this;
  }
  

        /**
         * Email of an extension user
         */
        public String email;
  public ContactDirectoryEvent email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * Extension number
         */
        public String extensionNumber;
  public ContactDirectoryEvent extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public CompanyDirectoryAccountInfo account;
  public ContactDirectoryEvent account(CompanyDirectoryAccountInfo account)
  {
    this.account = account;
    return this;
  }
  

        /**
         */
        public CompanyDirectoryPhoneNumberInfo phoneNumbers;
  public ContactDirectoryEvent phoneNumbers(CompanyDirectoryPhoneNumberInfo phoneNumbers)
  {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  

        /**
         */
        public ContactDirectorySiteInfo site;
  public ContactDirectoryEvent site(ContactDirectorySiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public CompanyDirectoryProfileImageInfo profileImage;
  public ContactDirectoryEvent profileImage(CompanyDirectoryProfileImageInfo profileImage)
  {
    this.profileImage = profileImage;
    return this;
  }
  

        /**
         * Internal identifier of a subscription owner extension
         */
        public String ownerId;
  public ContactDirectoryEvent ownerId(String ownerId)
  {
    this.ownerId = ownerId;
    return this;
  }
  
}
