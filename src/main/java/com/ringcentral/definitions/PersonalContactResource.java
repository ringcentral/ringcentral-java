package com.ringcentral.definitions;


public class PersonalContactResource {
    /**
     * Canonical URI of the contact
     */
    public String uri;
    /**
     * This property has a special meaning only on Address Book Sync (e.g. a contact can be `Deleted`). For simple contact list reading it has always the default value - `Alive`
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * Email of the contact
     */
    public String email;
    /**
     *
     */
    public String id;
    /**
     * Notes for the contact
     */
    public String notes;
    /**
     * Company name of the contact
     */
    public String company;
    /**
     * First name of the contact
     */
    public String firstName;
    /**
     * Last name of the contact
     */
    public String lastName;
    /**
     * Job title of the contact
     */
    public String jobTitle;
    /**
     * Date of birth of the contact
     */
    public String birthday;
    /**
     * The contact home page URL
     */
    public String webPage;
    /**
     * Middle name of the contact
     */
    public String middleName;
    /**
     * Nick name of the contact
     */
    public String nickName;
    /**
     * 2nd email of the contact
     */
    public String email2;
    /**
     * 3rd email of the contact
     */
    public String email3;
    /**
     * Home phone number of the contact in e.164 (with "+") format
     */
    public String homePhone;
    /**
     * 2nd home phone number of the contact in e.164 (with "+") format
     */
    public String homePhone2;
    /**
     * Business phone of the contact in e.164 (with "+") format
     */
    public String businessPhone;
    /**
     * 2nd business phone of the contact in e.164 (with "+") format
     */
    public String businessPhone2;
    /**
     * Mobile phone of the contact in e.164 (with "+") format
     */
    public String mobilePhone;
    /**
     * Business fax number of the contact in e.164 (with "+") format
     */
    public String businessFax;
    /**
     * Company number of the contact in e.164 (with "+") format
     */
    public String companyPhone;
    /**
     * Phone number of the contact assistant in e.164 (with "+") format
     */
    public String assistantPhone;
    /**
     * Car phone number of the contact in e.164 (with "+") format
     */
    public String carPhone;
    /**
     * Other phone number of the contact in e.164 (with "+") format
     */
    public String otherPhone;
    /**
     * Other fax number of the contact in e.164 (with "+") format
     */
    public String otherFax;
    /**
     * Callback phone number of the contact in e.164 (with "+") format
     */
    public String callbackPhone;
    /**
     *
     */
    public ContactAddressInfo businessAddress;
    /**
     *
     */
    public ContactAddressInfo homeAddress;
    /**
     *
     */
    public ContactAddressInfo otherAddress;

    public PersonalContactResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PersonalContactResource availability(String availability) {
        this.availability = availability;
        return this;
    }

    public PersonalContactResource email(String email) {
        this.email = email;
        return this;
    }

    public PersonalContactResource id(String id) {
        this.id = id;
        return this;
    }

    public PersonalContactResource notes(String notes) {
        this.notes = notes;
        return this;
    }

    public PersonalContactResource company(String company) {
        this.company = company;
        return this;
    }

    public PersonalContactResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonalContactResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonalContactResource jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public PersonalContactResource birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public PersonalContactResource webPage(String webPage) {
        this.webPage = webPage;
        return this;
    }

    public PersonalContactResource middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonalContactResource nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public PersonalContactResource email2(String email2) {
        this.email2 = email2;
        return this;
    }

    public PersonalContactResource email3(String email3) {
        this.email3 = email3;
        return this;
    }

    public PersonalContactResource homePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public PersonalContactResource homePhone2(String homePhone2) {
        this.homePhone2 = homePhone2;
        return this;
    }

    public PersonalContactResource businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    public PersonalContactResource businessPhone2(String businessPhone2) {
        this.businessPhone2 = businessPhone2;
        return this;
    }

    public PersonalContactResource mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public PersonalContactResource businessFax(String businessFax) {
        this.businessFax = businessFax;
        return this;
    }

    public PersonalContactResource companyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }

    public PersonalContactResource assistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
        return this;
    }

    public PersonalContactResource carPhone(String carPhone) {
        this.carPhone = carPhone;
        return this;
    }

    public PersonalContactResource otherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
        return this;
    }

    public PersonalContactResource otherFax(String otherFax) {
        this.otherFax = otherFax;
        return this;
    }

    public PersonalContactResource callbackPhone(String callbackPhone) {
        this.callbackPhone = callbackPhone;
        return this;
    }

    public PersonalContactResource businessAddress(ContactAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public PersonalContactResource homeAddress(ContactAddressInfo homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public PersonalContactResource otherAddress(ContactAddressInfo otherAddress) {
        this.otherAddress = otherAddress;
        return this;
    }

}
