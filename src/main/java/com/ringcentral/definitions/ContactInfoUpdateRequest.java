package com.ringcentral.definitions;


public class ContactInfoUpdateRequest {
    /**
     * For User extension type only. Extension user first name
     */
    public String firstName;
    /**
     * For User extension type only. Extension user last name
     */
    public String lastName;
    /**
     * Extension user company name
     */
    public String company;
    /**
     *
     */
    public String jobTitle;
    /**
     * Email of extension user
     */
    public String email;
    /**
     * Extension user contact phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String businessPhone;
    /**
     * Extension user mobile (**non** Toll Free) phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with '+' sign) format
     */
    public String mobilePhone;
    /**
     *
     */
    public ContactBusinessAddressInfo businessAddress;
    /**
     * If 'True' then contact email is enabled as login name for this user. Please note that email should be unique in this case. The default value is 'False'
     */
    public Boolean emailAsLoginName;
    /**
     *
     */
    public PronouncedNameInfo pronouncedName;
    /**
     * Extension user department, if any
     */
    public String department;

    public ContactInfoUpdateRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactInfoUpdateRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactInfoUpdateRequest company(String company) {
        this.company = company;
        return this;
    }

    public ContactInfoUpdateRequest jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public ContactInfoUpdateRequest email(String email) {
        this.email = email;
        return this;
    }

    public ContactInfoUpdateRequest businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    public ContactInfoUpdateRequest mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public ContactInfoUpdateRequest businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public ContactInfoUpdateRequest emailAsLoginName(Boolean emailAsLoginName) {
        this.emailAsLoginName = emailAsLoginName;
        return this;
    }

    public ContactInfoUpdateRequest pronouncedName(PronouncedNameInfo pronouncedName) {
        this.pronouncedName = pronouncedName;
        return this;
    }

    public ContactInfoUpdateRequest department(String department) {
        this.department = department;
        return this;
    }

}
