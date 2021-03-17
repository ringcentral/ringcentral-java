package com.ringcentral.definitions;


    // Contact resource
public class AddressBookBulkContactResource
{
    /**
         * Email of a contact
         */
        public String email;
  public AddressBookBulkContactResource email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * Notes for a contact
         */
        public String notes;
  public AddressBookBulkContactResource notes(String notes)
  {
    this.notes = notes;
    return this;
  }
  

        /**
         * Company name of a contact
         */
        public String company;
  public AddressBookBulkContactResource company(String company)
  {
    this.company = company;
    return this;
  }
  

        /**
         * First name of a contact
         */
        public String firstName;
  public AddressBookBulkContactResource firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * Last name of a contact
         */
        public String lastName;
  public AddressBookBulkContactResource lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Job title of a contact
         */
        public String jobTitle;
  public AddressBookBulkContactResource jobTitle(String jobTitle)
  {
    this.jobTitle = jobTitle;
    return this;
  }
  

        /**
         * Date of birth of a contact
         */
        public String birthday;
  public AddressBookBulkContactResource birthday(String birthday)
  {
    this.birthday = birthday;
    return this;
  }
  

        /**
         * Link to a contact home page
         */
        public String webPage;
  public AddressBookBulkContactResource webPage(String webPage)
  {
    this.webPage = webPage;
    return this;
  }
  

        /**
         * Middle name of a contact
         */
        public String middleName;
  public AddressBookBulkContactResource middleName(String middleName)
  {
    this.middleName = middleName;
    return this;
  }
  

        /**
         * Nick name of a contact
         */
        public String nickName;
  public AddressBookBulkContactResource nickName(String nickName)
  {
    this.nickName = nickName;
    return this;
  }
  

        /**
         * Second email of a contact
         */
        public String email2;
  public AddressBookBulkContactResource email2(String email2)
  {
    this.email2 = email2;
    return this;
  }
  

        /**
         * Third email of a contact
         */
        public String email3;
  public AddressBookBulkContactResource email3(String email3)
  {
    this.email3 = email3;
    return this;
  }
  

        /**
         * Home phone number of a contact in e.164 (with "+") format
         */
        public String homePhone;
  public AddressBookBulkContactResource homePhone(String homePhone)
  {
    this.homePhone = homePhone;
    return this;
  }
  

        /**
         * 2nd home phone number of a contact in e.164 (with "+") format
         */
        public String homePhone2;
  public AddressBookBulkContactResource homePhone2(String homePhone2)
  {
    this.homePhone2 = homePhone2;
    return this;
  }
  

        /**
         * Business phone of a contact in e.164 (with "+") format
         */
        public String businessPhone;
  public AddressBookBulkContactResource businessPhone(String businessPhone)
  {
    this.businessPhone = businessPhone;
    return this;
  }
  

        /**
         * 2nd business phone of a contact in e.164 (with "+") format
         */
        public String businessPhone2;
  public AddressBookBulkContactResource businessPhone2(String businessPhone2)
  {
    this.businessPhone2 = businessPhone2;
    return this;
  }
  

        /**
         * Mobile phone of a contact in e.164 (with "+") format
         */
        public String mobilePhone;
  public AddressBookBulkContactResource mobilePhone(String mobilePhone)
  {
    this.mobilePhone = mobilePhone;
    return this;
  }
  

        /**
         * Business fax number of a contact in e.164 (with "+") format
         */
        public String businessFax;
  public AddressBookBulkContactResource businessFax(String businessFax)
  {
    this.businessFax = businessFax;
    return this;
  }
  

        /**
         * Company number of a contact in e.164 (with "+") format
         */
        public String companyPhone;
  public AddressBookBulkContactResource companyPhone(String companyPhone)
  {
    this.companyPhone = companyPhone;
    return this;
  }
  

        /**
         * Phone number of a contact assistant in e.164 (with "+") format
         */
        public String assistantPhone;
  public AddressBookBulkContactResource assistantPhone(String assistantPhone)
  {
    this.assistantPhone = assistantPhone;
    return this;
  }
  

        /**
         * Car phone number of a contact in e.164 (with "+") format
         */
        public String carPhone;
  public AddressBookBulkContactResource carPhone(String carPhone)
  {
    this.carPhone = carPhone;
    return this;
  }
  

        /**
         * Other phone number of a contact in e.164 (with "+") format
         */
        public String otherPhone;
  public AddressBookBulkContactResource otherPhone(String otherPhone)
  {
    this.otherPhone = otherPhone;
    return this;
  }
  

        /**
         * Other fax number of a contact in e.164 (with "+") format
         */
        public String otherFax;
  public AddressBookBulkContactResource otherFax(String otherFax)
  {
    this.otherFax = otherFax;
    return this;
  }
  

        /**
         * Callback phone number of a contact in e.164 (with "+") format
         */
        public String callbackPhone;
  public AddressBookBulkContactResource callbackPhone(String callbackPhone)
  {
    this.callbackPhone = callbackPhone;
    return this;
  }
  

        /**
         */
        public AddressBookBulkContactAddressInfo businessAddress;
  public AddressBookBulkContactResource businessAddress(AddressBookBulkContactAddressInfo businessAddress)
  {
    this.businessAddress = businessAddress;
    return this;
  }
  

        /**
         */
        public AddressBookBulkContactAddressInfo homeAddress;
  public AddressBookBulkContactResource homeAddress(AddressBookBulkContactAddressInfo homeAddress)
  {
    this.homeAddress = homeAddress;
    return this;
  }
  

        /**
         */
        public AddressBookBulkContactAddressInfo otherAddress;
  public AddressBookBulkContactResource otherAddress(AddressBookBulkContactAddressInfo otherAddress)
  {
    this.otherAddress = otherAddress;
    return this;
  }
  
}
