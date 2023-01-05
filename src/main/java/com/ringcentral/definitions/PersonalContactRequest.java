package com.ringcentral.definitions;


public class PersonalContactRequest
{
    /**
     * First name of a contact
     * Example: Charlie
     */
    public String firstName;
    public PersonalContactRequest firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of a contact
     * Example: Williams
     */
    public String lastName;
    public PersonalContactRequest lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * Middle name of a contact
     * Example: J
     */
    public String middleName;
    public PersonalContactRequest middleName(String middleName)
    {
        this.middleName = middleName;
        return this;
    }

    /**
     * Nick name of a contact
     * Example: The Boss
     */
    public String nickName;
    public PersonalContactRequest nickName(String nickName)
    {
        this.nickName = nickName;
        return this;
    }

    /**
     * Company name of a contact
     * Example: Example, Inc.
     */
    public String company;
    public PersonalContactRequest company(String company)
    {
        this.company = company;
        return this;
    }

    /**
     * Job title of a contact
     * Example: CEO
     */
    public String jobTitle;
    public PersonalContactRequest jobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Email of a contact
     * Format: email
     * Example: charlie.williams@example.com
     */
    public String email;
    public PersonalContactRequest email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Second email of a contact
     * Format: email
     * Example: charlie-example@gmail.com
     */
    public String email2;
    public PersonalContactRequest email2(String email2)
    {
        this.email2 = email2;
        return this;
    }

    /**
     * Third email of a contact
     * Format: email
     * Example: theboss-example@hotmail.com
     */
    public String email3;
    public PersonalContactRequest email3(String email3)
    {
        this.email3 = email3;
        return this;
    }

    /**
     * Date of birth of a contact
     * Format: date-time
     */
    public String birthday;
    public PersonalContactRequest birthday(String birthday)
    {
        this.birthday = birthday;
        return this;
    }

    /**
     * Contact home page URL
     * Format: uri
     * Example: http://www.example.com
     */
    public String webPage;
    public PersonalContactRequest webPage(String webPage)
    {
        this.webPage = webPage;
        return this;
    }

    /**
     * Notes for a contact
     * Example: #1 Customer
     */
    public String notes;
    public PersonalContactRequest notes(String notes)
    {
        this.notes = notes;
        return this;
    }

    /**
     * Home phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String homePhone;
    public PersonalContactRequest homePhone(String homePhone)
    {
        this.homePhone = homePhone;
        return this;
    }

    /**
     * Second home phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String homePhone2;
    public PersonalContactRequest homePhone2(String homePhone2)
    {
        this.homePhone2 = homePhone2;
        return this;
    }

    /**
     * Business phone of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String businessPhone;
    public PersonalContactRequest businessPhone(String businessPhone)
    {
        this.businessPhone = businessPhone;
        return this;
    }

    /**
     * Second business phone of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String businessPhone2;
    public PersonalContactRequest businessPhone2(String businessPhone2)
    {
        this.businessPhone2 = businessPhone2;
        return this;
    }

    /**
     * Mobile phone of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String mobilePhone;
    public PersonalContactRequest mobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * Business fax number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String businessFax;
    public PersonalContactRequest businessFax(String businessFax)
    {
        this.businessFax = businessFax;
        return this;
    }

    /**
     * Company number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String companyPhone;
    public PersonalContactRequest companyPhone(String companyPhone)
    {
        this.companyPhone = companyPhone;
        return this;
    }

    /**
     * Phone number of a contact assistant in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String assistantPhone;
    public PersonalContactRequest assistantPhone(String assistantPhone)
    {
        this.assistantPhone = assistantPhone;
        return this;
    }

    /**
     * Car phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String carPhone;
    public PersonalContactRequest carPhone(String carPhone)
    {
        this.carPhone = carPhone;
        return this;
    }

    /**
     * Other phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String otherPhone;
    public PersonalContactRequest otherPhone(String otherPhone)
    {
        this.otherPhone = otherPhone;
        return this;
    }

    /**
     * Other fax number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String otherFax;
    public PersonalContactRequest otherFax(String otherFax)
    {
        this.otherFax = otherFax;
        return this;
    }

    /**
     * Callback phone number of a contact in e.164 (with &quot;+&quot;) format
     * Example: 15551234567
     */
    public String callbackPhone;
    public PersonalContactRequest callbackPhone(String callbackPhone)
    {
        this.callbackPhone = callbackPhone;
        return this;
    }

    /**
     */
    public ContactAddressInfo homeAddress;
    public PersonalContactRequest homeAddress(ContactAddressInfo homeAddress)
    {
        this.homeAddress = homeAddress;
        return this;
    }

    /**
     */
    public ContactAddressInfo businessAddress;
    public PersonalContactRequest businessAddress(ContactAddressInfo businessAddress)
    {
        this.businessAddress = businessAddress;
        return this;
    }

    /**
     */
    public ContactAddressInfo otherAddress;
    public PersonalContactRequest otherAddress(ContactAddressInfo otherAddress)
    {
        this.otherAddress = otherAddress;
        return this;
    }

    /**
     * Contact ringtone. Max number of symbols is 64
     */
    public String ringtoneIndex;
    public PersonalContactRequest ringtoneIndex(String ringtoneIndex)
    {
        this.ringtoneIndex = ringtoneIndex;
        return this;
    }
}