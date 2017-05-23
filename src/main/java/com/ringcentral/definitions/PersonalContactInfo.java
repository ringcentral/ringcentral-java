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
}
