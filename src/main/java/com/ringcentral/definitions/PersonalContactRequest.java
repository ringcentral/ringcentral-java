package com.ringcentral.definitions;


public class PersonalContactRequest
{
    /**
         * First name of the contact
         */
        public String firstName;
  public PersonalContactRequest firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * Last name of the contact
         */
        public String lastName;
  public PersonalContactRequest lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Middle name of the contact
         */
        public String middleName;
  public PersonalContactRequest middleName(String middleName)
  {
    this.middleName = middleName;
    return this;
  }
  

        /**
         * Nick name of the contact
         */
        public String nickName;
  public PersonalContactRequest nickName(String nickName)
  {
    this.nickName = nickName;
    return this;
  }
  

        /**
         * Company name of the contact
         */
        public String company;
  public PersonalContactRequest company(String company)
  {
    this.company = company;
    return this;
  }
  

        /**
         * Job title of the contact
         */
        public String jobTitle;
  public PersonalContactRequest jobTitle(String jobTitle)
  {
    this.jobTitle = jobTitle;
    return this;
  }
  

        /**
         * Email of the contact
         */
        public String email;
  public PersonalContactRequest email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * 2nd email of the contact
         */
        public String email2;
  public PersonalContactRequest email2(String email2)
  {
    this.email2 = email2;
    return this;
  }
  

        /**
         * 3rd email of the contact
         */
        public String email3;
  public PersonalContactRequest email3(String email3)
  {
    this.email3 = email3;
    return this;
  }
  

        /**
         * Date of birth of the contact
         */
        public String birthday;
  public PersonalContactRequest birthday(String birthday)
  {
    this.birthday = birthday;
    return this;
  }
  

        /**
         * The contact home page URL
         */
        public String webPage;
  public PersonalContactRequest webPage(String webPage)
  {
    this.webPage = webPage;
    return this;
  }
  

        /**
         * Notes for the contact
         */
        public String notes;
  public PersonalContactRequest notes(String notes)
  {
    this.notes = notes;
    return this;
  }
  

        /**
         * Home phone number of the contact in e.164 (with "+") format
         */
        public String homePhone;
  public PersonalContactRequest homePhone(String homePhone)
  {
    this.homePhone = homePhone;
    return this;
  }
  

        /**
         * 2nd home phone number of the contact in e.164 (with "+") format
         */
        public String homePhone2;
  public PersonalContactRequest homePhone2(String homePhone2)
  {
    this.homePhone2 = homePhone2;
    return this;
  }
  

        /**
         * Business phone of the contact in e.164 (with "+") format
         */
        public String businessPhone;
  public PersonalContactRequest businessPhone(String businessPhone)
  {
    this.businessPhone = businessPhone;
    return this;
  }
  

        /**
         * 2nd business phone of the contact in e.164 (with "+") format
         */
        public String businessPhone2;
  public PersonalContactRequest businessPhone2(String businessPhone2)
  {
    this.businessPhone2 = businessPhone2;
    return this;
  }
  

        /**
         * Mobile phone of the contact in e.164 (with "+") format
         */
        public String mobilePhone;
  public PersonalContactRequest mobilePhone(String mobilePhone)
  {
    this.mobilePhone = mobilePhone;
    return this;
  }
  

        /**
         * Business fax number of the contact in e.164 (with "+") format
         */
        public String businessFax;
  public PersonalContactRequest businessFax(String businessFax)
  {
    this.businessFax = businessFax;
    return this;
  }
  

        /**
         * Company number of the contact in e.164 (with "+") format
         */
        public String companyPhone;
  public PersonalContactRequest companyPhone(String companyPhone)
  {
    this.companyPhone = companyPhone;
    return this;
  }
  

        /**
         * Phone number of the contact assistant in e.164 (with "+") format
         */
        public String assistantPhone;
  public PersonalContactRequest assistantPhone(String assistantPhone)
  {
    this.assistantPhone = assistantPhone;
    return this;
  }
  

        /**
         * Car phone number of the contact in e.164 (with "+") format
         */
        public String carPhone;
  public PersonalContactRequest carPhone(String carPhone)
  {
    this.carPhone = carPhone;
    return this;
  }
  

        /**
         * Other phone number of the contact in e.164 (with "+") format
         */
        public String otherPhone;
  public PersonalContactRequest otherPhone(String otherPhone)
  {
    this.otherPhone = otherPhone;
    return this;
  }
  

        /**
         * Other fax number of the contact in e.164 (with "+") format
         */
        public String otherFax;
  public PersonalContactRequest otherFax(String otherFax)
  {
    this.otherFax = otherFax;
    return this;
  }
  

        /**
         * Callback phone number of the contact in e.164 (with "+") format
         */
        public String callbackPhone;
  public PersonalContactRequest callbackPhone(String callbackPhone)
  {
    this.callbackPhone = callbackPhone;
    return this;
  }
  

        /**
         */
        public ContactAddressInfo homeAddress;
  public PersonalContactRequest homeAddress(ContactAddressInfo homeAddress)
  {
    this.homeAddress = homeAddress;
    return this;
  }
  

        /**
         */
        public ContactAddressInfo businessAddress;
  public PersonalContactRequest businessAddress(ContactAddressInfo businessAddress)
  {
    this.businessAddress = businessAddress;
    return this;
  }
  

        /**
         */
        public ContactAddressInfo otherAddress;
  public PersonalContactRequest otherAddress(ContactAddressInfo otherAddress)
  {
    this.otherAddress = otherAddress;
    return this;
  }
  

        /**
         * Contact ringtone. Max number of symbols is 64
         */
        public String ringtoneIndex;
  public PersonalContactRequest ringtoneIndex(String ringtoneIndex)
  {
    this.ringtoneIndex = ringtoneIndex;
    return this;
  }
  
}
