package com.ringcentral.definitions;


    // Contact detailed information
public class ContactInfo
{
    /**
         * For User extension type only. Extension user first name
         */
        public String firstName;
  public ContactInfo firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * For User extension type only. Extension user last name
         */
        public String lastName;
  public ContactInfo lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Extension user company name
         */
        public String company;
  public ContactInfo company(String company)
  {
    this.company = company;
    return this;
  }
  

        /**
         */
        public String jobTitle;
  public ContactInfo jobTitle(String jobTitle)
  {
    this.jobTitle = jobTitle;
    return this;
  }
  

        /**
         * Email of extension user
         */
        public String email;
  public ContactInfo email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * Extension user contact phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
         */
        public String businessPhone;
  public ContactInfo businessPhone(String businessPhone)
  {
    this.businessPhone = businessPhone;
    return this;
  }
  

        /**
         * Extension user mobile (**non** Toll Free) phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
         */
        public String mobilePhone;
  public ContactInfo mobilePhone(String mobilePhone)
  {
    this.mobilePhone = mobilePhone;
    return this;
  }
  

        /**
         */
        public ContactBusinessAddressInfo businessAddress;
  public ContactInfo businessAddress(ContactBusinessAddressInfo businessAddress)
  {
    this.businessAddress = businessAddress;
    return this;
  }
  

        /**
         * If 'True' then contact email is enabled as login name for this user. Please note that email should be unique in this case.
         */
        public Boolean emailAsLoginName;
  public ContactInfo emailAsLoginName(Boolean emailAsLoginName)
  {
    this.emailAsLoginName = emailAsLoginName;
    return this;
  }
  

        /**
         */
        public PronouncedNameInfo pronouncedName;
  public ContactInfo pronouncedName(PronouncedNameInfo pronouncedName)
  {
    this.pronouncedName = pronouncedName;
    return this;
  }
  

        /**
         * Extension user department, if any
         */
        public String department;
  public ContactInfo department(String department)
  {
    this.department = department;
    return this;
  }
  
}
