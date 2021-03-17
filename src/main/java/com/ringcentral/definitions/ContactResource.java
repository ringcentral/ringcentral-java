package com.ringcentral.definitions;


public class ContactResource
{
    /**
         */
        public AccountResource account;
  public ContactResource account(AccountResource account)
  {
    this.account = account;
    return this;
  }
  

        /**
         */
        public String department;
  public ContactResource department(String department)
  {
    this.department = department;
    return this;
  }
  

        /**
         */
        public String email;
  public ContactResource email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         */
        public String extensionNumber;
  public ContactResource extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * First name of a contact, for user extensions only
         */
        public String firstName;
  public ContactResource firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * Last name of a contact, for user extensions only
         */
        public String lastName;
  public ContactResource lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Name of a contact, for non-user extensions
         */
        public String name;
  public ContactResource name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public String id;
  public ContactResource id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public String jobTitle;
  public ContactResource jobTitle(String jobTitle)
  {
    this.jobTitle = jobTitle;
    return this;
  }
  

        /**
         */
        public PhoneNumberResource[] phoneNumbers;
  public ContactResource phoneNumbers(PhoneNumberResource[] phoneNumbers)
  {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  

        /**
         */
        public AccountDirectoryProfileImageResource profileImage;
  public ContactResource profileImage(AccountDirectoryProfileImageResource profileImage)
  {
    this.profileImage = profileImage;
    return this;
  }
  

        /**
         */
        public BusinessSiteResource site;
  public ContactResource site(BusinessSiteResource site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public String status;
  public ContactResource status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public String type;
  public ContactResource type(String type)
  {
    this.type = type;
    return this;
  }
  
}
