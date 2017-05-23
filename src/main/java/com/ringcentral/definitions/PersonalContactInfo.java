package com.ringcentral.definitions;

public class PersonalContactInfo {
    // Standard resource properties ID
    public String id;
    // Canonical URI
    public String url;
    // This property has a special meaning only on Address Book Sync (e.g. a contact can be 'Deleted'). For simple contact list reading it has always the default value - 'Alive'
    public String availability;
    // First name of a personal contact
    public String firstName;
    // Last name of a personal contact
    public String lastName;
    // Middle name of a personal contact
    public String middleName;
    // Nick name of a personal contact
    public String nickName;
    // Company name of a personal contact
    public String company;
    // Job title of a personal contact
    public String jobTitle;
    // Home phone of a personal contact
    public String homePhone;
    // The 2-d home phone of a personal contact
    public String homePhone2;
    // Business phone of a personal contact
    public String businessPhone;
    // The 2-d business phone of a personal contact
    public String businessPhone2;
    // Mobile phone of a personal contact
    public String mobilePhone;
    // Business fax of a personal contact
    public String businessFax;
    // Company phone of a personal contact
    public String companyPhone;
    // Assistant phone of a personal contact
    public String assistantPhone;
    // Car phone of a personal contact
    public String carPhone;
    // Other phone of a personal contact
    public String otherPhone;
    // Other fax of a personal contact
    public String otherFax;
    // Callback phone of a personal contact
    public String callbackPhone;
    // Email of a personal contact
    public String email;
    // The 2-d email of a personal contact
    public String email2;
    // The 3-d email of a personal contact
    public String email3;
    // Home address of a personal contact
    public ContactAddressInfo homeAddress;
    // Business address of a personal contact
    public ContactAddressInfo businessAddress;
    // Other address of a personal contact
    public ContactAddressInfo otherAddress;
    // Date of birth of a personal contact in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String birthday;
    // Web page of a personal contact
    public String webPage;
    // Notes of a personal contact
    public String notes;

    public PersonalContactInfo id(String id) {
        this.id = id;
        return this;
    }

    public PersonalContactInfo url(String url) {
        this.url = url;
        return this;
    }

    public PersonalContactInfo availability(String availability) {
        this.availability = availability;
        return this;
    }

    public PersonalContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonalContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonalContactInfo middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonalContactInfo nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public PersonalContactInfo company(String company) {
        this.company = company;
        return this;
    }

    public PersonalContactInfo jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public PersonalContactInfo homePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public PersonalContactInfo homePhone2(String homePhone2) {
        this.homePhone2 = homePhone2;
        return this;
    }

    public PersonalContactInfo businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    public PersonalContactInfo businessPhone2(String businessPhone2) {
        this.businessPhone2 = businessPhone2;
        return this;
    }

    public PersonalContactInfo mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public PersonalContactInfo businessFax(String businessFax) {
        this.businessFax = businessFax;
        return this;
    }

    public PersonalContactInfo companyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }

    public PersonalContactInfo assistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
        return this;
    }

    public PersonalContactInfo carPhone(String carPhone) {
        this.carPhone = carPhone;
        return this;
    }

    public PersonalContactInfo otherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
        return this;
    }

    public PersonalContactInfo otherFax(String otherFax) {
        this.otherFax = otherFax;
        return this;
    }

    public PersonalContactInfo callbackPhone(String callbackPhone) {
        this.callbackPhone = callbackPhone;
        return this;
    }

    public PersonalContactInfo email(String email) {
        this.email = email;
        return this;
    }

    public PersonalContactInfo email2(String email2) {
        this.email2 = email2;
        return this;
    }

    public PersonalContactInfo email3(String email3) {
        this.email3 = email3;
        return this;
    }

    public PersonalContactInfo homeAddress(ContactAddressInfo homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public PersonalContactInfo businessAddress(ContactAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public PersonalContactInfo otherAddress(ContactAddressInfo otherAddress) {
        this.otherAddress = otherAddress;
        return this;
    }

    public PersonalContactInfo birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public PersonalContactInfo webPage(String webPage) {
        this.webPage = webPage;
        return this;
    }

    public PersonalContactInfo notes(String notes) {
        this.notes = notes;
        return this;
    }
}
