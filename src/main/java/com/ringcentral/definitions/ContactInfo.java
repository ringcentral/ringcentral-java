package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ContactInfo
{
    // For User extension type only. Extension user first name
    public String firstName;
    public ContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    // For User extension type only. Extension user last name
    public String lastName;
    public ContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    // Extension user company name
    public String company;
    public ContactInfo company(String company) {
        this.company = company;
        return this;
    }
    // Email of extension user
    public String email;
    public ContactInfo email(String email) {
        this.email = email;
        return this;
    }
    // Extension user contact phone number
    public String businessPhone;
    public ContactInfo businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }
    // Business address of extension user company
    public ContactAddressInfo businessAddress;
    public ContactInfo businessAddress(ContactAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
}
