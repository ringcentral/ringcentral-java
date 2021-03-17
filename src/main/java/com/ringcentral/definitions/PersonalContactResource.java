package com.ringcentral.definitions;


public class PersonalContactResource
{
    /**
         * Canonical URI of the contact
         */
        public String uri;
  public PersonalContactResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * This property has a special meaning only on Address Book Sync (e.g. a contact can be `Deleted`). For simple contact list reading it has always the default value - `Alive`
         * Enum: Alive, Deleted, Purged
         */
        public String availability;
  public PersonalContactResource availability(String availability)
  {
    this.availability = availability;
    return this;
  }
  

        /**
         * Email of the contact
         */
        public String email;
  public PersonalContactResource email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * Internal identifier of the contact
         */
        public Long id;
  public PersonalContactResource id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Notes for the contact
         */
        public String notes;
  public PersonalContactResource notes(String notes)
  {
    this.notes = notes;
    return this;
  }
  

        /**
         * Company name of the contact
         */
        public String company;
  public PersonalContactResource company(String company)
  {
    this.company = company;
    return this;
  }
  

        /**
         * First name of the contact
         */
        public String firstName;
  public PersonalContactResource firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * Last name of the contact
         */
        public String lastName;
  public PersonalContactResource lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Job title of the contact
         */
        public String jobTitle;
  public PersonalContactResource jobTitle(String jobTitle)
  {
    this.jobTitle = jobTitle;
    return this;
  }
  

        /**
         * Date of birth of the contact
         */
        public String birthday;
  public PersonalContactResource birthday(String birthday)
  {
    this.birthday = birthday;
    return this;
  }
  

        /**
         * The contact home page URL
         */
        public String webPage;
  public PersonalContactResource webPage(String webPage)
  {
    this.webPage = webPage;
    return this;
  }
  

        /**
         * Middle name of the contact
         */
        public String middleName;
  public PersonalContactResource middleName(String middleName)
  {
    this.middleName = middleName;
    return this;
  }
  

        /**
         * Nick name of the contact
         */
        public String nickName;
  public PersonalContactResource nickName(String nickName)
  {
    this.nickName = nickName;
    return this;
  }
  

        /**
         * 2nd email of the contact
         */
        public String email2;
  public PersonalContactResource email2(String email2)
  {
    this.email2 = email2;
    return this;
  }
  

        /**
         * 3rd email of the contact
         */
        public String email3;
  public PersonalContactResource email3(String email3)
  {
    this.email3 = email3;
    return this;
  }
  

        /**
         * Home phone number of the contact in e.164 (with "+") format
         */
        public String homePhone;
  public PersonalContactResource homePhone(String homePhone)
  {
    this.homePhone = homePhone;
    return this;
  }
  

        /**
         * 2nd home phone number of the contact in e.164 (with "+") format
         */
        public String homePhone2;
  public PersonalContactResource homePhone2(String homePhone2)
  {
    this.homePhone2 = homePhone2;
    return this;
  }
  

        /**
         * Business phone of the contact in e.164 (with "+") format
         */
        public String businessPhone;
  public PersonalContactResource businessPhone(String businessPhone)
  {
    this.businessPhone = businessPhone;
    return this;
  }
  

        /**
         * 2nd business phone of the contact in e.164 (with "+") format
         */
        public String businessPhone2;
  public PersonalContactResource businessPhone2(String businessPhone2)
  {
    this.businessPhone2 = businessPhone2;
    return this;
  }
  

        /**
         * Mobile phone of the contact in e.164 (with "+") format
         */
        public String mobilePhone;
  public PersonalContactResource mobilePhone(String mobilePhone)
  {
    this.mobilePhone = mobilePhone;
    return this;
  }
  

        /**
         * Business fax number of the contact in e.164 (with "+") format
         */
        public String businessFax;
  public PersonalContactResource businessFax(String businessFax)
  {
    this.businessFax = businessFax;
    return this;
  }
  

        /**
         * Company number of the contact in e.164 (with "+") format
         */
        public String companyPhone;
  public PersonalContactResource companyPhone(String companyPhone)
  {
    this.companyPhone = companyPhone;
    return this;
  }
  

        /**
         * Phone number of the contact assistant in e.164 (with "+") format
         */
        public String assistantPhone;
  public PersonalContactResource assistantPhone(String assistantPhone)
  {
    this.assistantPhone = assistantPhone;
    return this;
  }
  

        /**
         * Car phone number of the contact in e.164 (with "+") format
         */
        public String carPhone;
  public PersonalContactResource carPhone(String carPhone)
  {
    this.carPhone = carPhone;
    return this;
  }
  

        /**
         * Other phone number of the contact in e.164 (with "+") format
         */
        public String otherPhone;
  public PersonalContactResource otherPhone(String otherPhone)
  {
    this.otherPhone = otherPhone;
    return this;
  }
  

        /**
         * Other fax number of the contact in e.164 (with "+") format
         */
        public String otherFax;
  public PersonalContactResource otherFax(String otherFax)
  {
    this.otherFax = otherFax;
    return this;
  }
  

        /**
         * Callback phone number of the contact in e.164 (with "+") format
         */
        public String callbackPhone;
  public PersonalContactResource callbackPhone(String callbackPhone)
  {
    this.callbackPhone = callbackPhone;
    return this;
  }
  

        /**
         */
        public ContactAddressInfo businessAddress;
  public PersonalContactResource businessAddress(ContactAddressInfo businessAddress)
  {
    this.businessAddress = businessAddress;
    return this;
  }
  

        /**
         */
        public ContactAddressInfo homeAddress;
  public PersonalContactResource homeAddress(ContactAddressInfo homeAddress)
  {
    this.homeAddress = homeAddress;
    return this;
  }
  

        /**
         */
        public ContactAddressInfo otherAddress;
  public PersonalContactResource otherAddress(ContactAddressInfo otherAddress)
  {
    this.otherAddress = otherAddress;
    return this;
  }
  

        /**
         * Contact ringtone. Max number of symbols is 64
         */
        public String ringtoneIndex;
  public PersonalContactResource ringtoneIndex(String ringtoneIndex)
  {
    this.ringtoneIndex = ringtoneIndex;
    return this;
  }
  
}
