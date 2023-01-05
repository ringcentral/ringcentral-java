package com.ringcentral.definitions;


public class AddressBookBulkContactResource
{
    /**
     * Email of a contact
     * Format: email
     * Example: charlie.williams@example.com
     */
    public String email;
    public AddressBookBulkContactResource email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Notes for a contact
     * Example: #1 Customer
     */
    public String notes;
    public AddressBookBulkContactResource notes(String notes)
    {
        this.notes = notes;
        return this;
    }

    /**
     * Company name of a contact
     * Example: Example, Inc.
     */
    public String company;
    public AddressBookBulkContactResource company(String company)
    {
        this.company = company;
        return this;
    }

    /**
     * First name of a contact
     * Example: Charlie
     */
    public String firstName;
    public AddressBookBulkContactResource firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of a contact
     * Example: Williams
     */
    public String lastName;
    public AddressBookBulkContactResource lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * Job title of a contact
     * Example: CEO
     */
    public String jobTitle;
    public AddressBookBulkContactResource jobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Date of birth of a contact
     * Format: date-time
     */
    public String birthday;
    public AddressBookBulkContactResource birthday(String birthday)
    {
        this.birthday = birthday;
        return this;
    }

    /**
     * Link to a contact home page
     * Example: http://www.example.com
     */
    public String webPage;
    public AddressBookBulkContactResource webPage(String webPage)
    {
        this.webPage = webPage;
        return this;
    }

    /**
     * Middle name of a contact
     * Example: J
     */
    public String middleName;
    public AddressBookBulkContactResource middleName(String middleName)
    {
        this.middleName = middleName;
        return this;
    }

    /**
     * Nick name of a contact
     * Example: The Boss
     */
    public String nickName;
    public AddressBookBulkContactResource nickName(String nickName)
    {
        this.nickName = nickName;
        return this;
    }

    /**
     * Second email of a contact
     * Format: email
     * Example: charlie-example@gmail.com
     */
    public String email2;
    public AddressBookBulkContactResource email2(String email2)
    {
        this.email2 = email2;
        return this;
    }

    /**
     * Third email of the contact
     * Format: email
     * Example: theboss-example@hotmail.com
     */
    public String email3;
    public AddressBookBulkContactResource email3(String email3)
    {
        this.email3 = email3;
        return this;
    }

    /**
     * Home phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String homePhone;
    public AddressBookBulkContactResource homePhone(String homePhone)
    {
        this.homePhone = homePhone;
        return this;
    }

    /**
     * Second home phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String homePhone2;
    public AddressBookBulkContactResource homePhone2(String homePhone2)
    {
        this.homePhone2 = homePhone2;
        return this;
    }

    /**
     * Business phone of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String businessPhone;
    public AddressBookBulkContactResource businessPhone(String businessPhone)
    {
        this.businessPhone = businessPhone;
        return this;
    }

    /**
     * Second business phone of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String businessPhone2;
    public AddressBookBulkContactResource businessPhone2(String businessPhone2)
    {
        this.businessPhone2 = businessPhone2;
        return this;
    }

    /**
     * Mobile phone of the contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String mobilePhone;
    public AddressBookBulkContactResource mobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * Business fax number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String businessFax;
    public AddressBookBulkContactResource businessFax(String businessFax)
    {
        this.businessFax = businessFax;
        return this;
    }

    /**
     * Company number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String companyPhone;
    public AddressBookBulkContactResource companyPhone(String companyPhone)
    {
        this.companyPhone = companyPhone;
        return this;
    }

    /**
     * Phone number of a contact assistant in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String assistantPhone;
    public AddressBookBulkContactResource assistantPhone(String assistantPhone)
    {
        this.assistantPhone = assistantPhone;
        return this;
    }

    /**
     * Car phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String carPhone;
    public AddressBookBulkContactResource carPhone(String carPhone)
    {
        this.carPhone = carPhone;
        return this;
    }

    /**
     * Other phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String otherPhone;
    public AddressBookBulkContactResource otherPhone(String otherPhone)
    {
        this.otherPhone = otherPhone;
        return this;
    }

    /**
     * Other fax number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String otherFax;
    public AddressBookBulkContactResource otherFax(String otherFax)
    {
        this.otherFax = otherFax;
        return this;
    }

    /**
     * Callback phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
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