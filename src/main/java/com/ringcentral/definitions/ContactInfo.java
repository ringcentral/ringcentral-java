package com.ringcentral.definitions;


/**
 * Detailed contact information
 */
public class ContactInfo {
    /**
     * User&#039;s first name (for extensions of `User` type only)
     */
    public String firstName;
    /**
     * For User extension type only. User&#039;s last name (for extensions of `User` type only)
     */
    public String lastName;
    /**
     * Extension name (for extensions of `User` type - concatenation of first and last name)
     */
    public String name;
    /**
     * User&#039;s company name
     */
    public String company;
    /**
     * User&#039;s job title
     */
    public String jobTitle;
    /**
     * User&#039;s contact email
     * Format: email
     */
    public String email;
    /**
     * User&#039;s contact phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
     * (with &#039;+&#039; sign) format
     */
    public String businessPhone;
    /**
     * User&#039;s mobile (**non** Toll Free) phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
     * (with &#039;+&#039; sign) format
     */
    public String mobilePhone;
    /**
     *
     */
    public ContactBusinessAddressInfo businessAddress;
    /**
     * Indicates that the contact email is enabled as a login name for this
     * user. Please note that the email must be unique in this case.
     */
    public Boolean emailAsLoginName;
    /**
     *
     */
    public PronouncedNameInfo pronouncedName;
    /**
     * User&#039;s department name
     */
    public String department;

    public ContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactInfo name(String name) {
        this.name = name;
        return this;
    }

    public ContactInfo company(String company) {
        this.company = company;
        return this;
    }

    public ContactInfo jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public ContactInfo mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public ContactInfo businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public ContactInfo emailAsLoginName(Boolean emailAsLoginName) {
        this.emailAsLoginName = emailAsLoginName;
        return this;
    }

    public ContactInfo pronouncedName(PronouncedNameInfo pronouncedName) {
        this.pronouncedName = pronouncedName;
        return this;
    }

    public ContactInfo department(String department) {
        this.department = department;
        return this;
    }
}
