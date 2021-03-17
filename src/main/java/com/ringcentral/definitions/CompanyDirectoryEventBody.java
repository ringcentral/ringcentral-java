package com.ringcentral.definitions;


    // Notification payload body
public class CompanyDirectoryEventBody
{
    /**
         * Internal identifier of an extension
         */
        public String id;
  public CompanyDirectoryEventBody id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of change
         */
        public String eventType;
  public CompanyDirectoryEventBody eventType(String eventType)
  {
    this.eventType = eventType;
    return this;
  }
  

        /**
         * Type of extension
         */
        public String type;
  public CompanyDirectoryEventBody type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Status of an extension
         * Enum: Enabled, NotActivated, Disabled
         */
        public String status;
  public CompanyDirectoryEventBody status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * First name of a user extension
         */
        public String firstName;
  public CompanyDirectoryEventBody firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * Last name of a user extension
         */
        public String lastName;
  public CompanyDirectoryEventBody lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Name of a contact, for non-user extensions
         */
        public String name;
  public CompanyDirectoryEventBody name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Department name
         */
        public String department;
  public CompanyDirectoryEventBody department(String department)
  {
    this.department = department;
    return this;
  }
  

        /**
         */
        public String email;
  public CompanyDirectoryEventBody email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         */
        public String extensionNumber;
  public CompanyDirectoryEventBody extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public CompanyDirectoryAccountInfo account;
  public CompanyDirectoryEventBody account(CompanyDirectoryAccountInfo account)
  {
    this.account = account;
    return this;
  }
  

        /**
         */
        public CompanyDirectoryPhoneNumberInfo[] phoneNumbers;
  public CompanyDirectoryEventBody phoneNumbers(CompanyDirectoryPhoneNumberInfo[] phoneNumbers)
  {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  

        /**
         */
        public ContactDirectorySiteInfo site;
  public CompanyDirectoryEventBody site(ContactDirectorySiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public CompanyDirectoryProfileImageInfo profileImage;
  public CompanyDirectoryEventBody profileImage(CompanyDirectoryProfileImageInfo profileImage)
  {
    this.profileImage = profileImage;
    return this;
  }
  
}
