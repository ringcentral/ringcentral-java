package com.ringcentral.definitions;


public class ContactInfoUpdateRequest
{
    /**
     * For User extension type only. Extension user first name
     */
    public String firstName;
    public ContactInfoUpdateRequest firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * For User extension type only. Extension user last name
     */
    public String lastName;
    public ContactInfoUpdateRequest lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * Extension user company name
     */
    public String company;
    public ContactInfoUpdateRequest company(String company)
    {
        this.company = company;
        return this;
    }

    /**
     */
    public String jobTitle;
    public ContactInfoUpdateRequest jobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Email of extension user
     * Format: email
     */
    public String email;
    public ContactInfoUpdateRequest email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Extension user contact phone number in
    * [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
    * format
     */
    public String businessPhone;
    public ContactInfoUpdateRequest businessPhone(String businessPhone)
    {
        this.businessPhone = businessPhone;
        return this;
    }

    /**
     * Extension user mobile (**non** Toll Free) phone number in
    * [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
    * (with &#039;+&#039; sign) format
     */
    public String mobilePhone;
    public ContactInfoUpdateRequest mobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     */
    public ContactBusinessAddressInfo businessAddress;
    public ContactInfoUpdateRequest businessAddress(ContactBusinessAddressInfo businessAddress)
    {
        this.businessAddress = businessAddress;
        return this;
    }

    /**
     * If &#039;True&#039; then contact email is enabled as login name for
    * this user. Please note that email should be unique in this case.
    * The default value is &#039;False&#039;
     */
    public Boolean emailAsLoginName;
    public ContactInfoUpdateRequest emailAsLoginName(Boolean emailAsLoginName)
    {
        this.emailAsLoginName = emailAsLoginName;
        return this;
    }

    /**
     */
    public PronouncedNameInfo pronouncedName;
    public ContactInfoUpdateRequest pronouncedName(PronouncedNameInfo pronouncedName)
    {
        this.pronouncedName = pronouncedName;
        return this;
    }

    /**
     * Extension user department, if any
     */
    public String department;
    public ContactInfoUpdateRequest department(String department)
    {
        this.department = department;
        return this;
    }
}