package com.ringcentral.definitions;

public class ContactInfo {
    // For User extension type only. Extension user first name
    public String firstName;
    // For User extension type only. Extension user last name
    public String lastName;
    // Extension user company name
    public String company;
    // Email of extension user
    public String email;
    // Extension user contact phone number
    public String businessPhone;
    // Business address of extension user company
    public ContactAddressInfo businessAddress;

    public ContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactInfo company(String company) {
        this.company = company;
        return this;
    }

    public ContactInfo email(String email) {
        this.email = email;
        return this;
    }

    public ContactInfo businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    public ContactInfo businessAddress(ContactAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
}
