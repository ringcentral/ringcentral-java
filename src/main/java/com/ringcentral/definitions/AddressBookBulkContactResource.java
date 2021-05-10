package com.ringcentral.definitions;


// Contact resource
public class AddressBookBulkContactResource {
    /**
     * Email of a contact
     * Example: charlie.williams@example.com
     */
    public String email;
    /**
     * Notes for a contact
     * Example: #1 Customer
     */
    public String notes;
    /**
     * Company name of a contact
     * Example: Example, Inc.
     */
    public String company;
    /**
     * First name of a contact
     * Example: Charlie
     */
    public String firstName;
    /**
     * Last name of a contact
     * Example: Williams
     */
    public String lastName;
    /**
     * Job title of a contact
     * Example: CEO
     */
    public String jobTitle;
    /**
     * Date of birth of a contact
     * Format: date-time
     */
    public String birthday;
    /**
     * Link to a contact home page
     * Example: http://www.example.com
     */
    public String webPage;
    /**
     * Middle name of a contact
     * Example: J
     */
    public String middleName;
    /**
     * Nick name of a contact
     * Example: The Boss
     */
    public String nickName;
    /**
     * Second email of a contact
     * Example: charlie.williams2@example.com
     */
    public String email2;
    /**
     * Third email of a contact
     * Example: charlie.williams3@example.com
     */
    public String email3;
    /**
     * Home phone number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String homePhone;
    /**
     * 2nd home phone number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String homePhone2;
    /**
     * Business phone of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String businessPhone;
    /**
     * 2nd business phone of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String businessPhone2;
    /**
     * Mobile phone of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String mobilePhone;
    /**
     * Business fax number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String businessFax;
    /**
     * Company number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String companyPhone;
    /**
     * Phone number of a contact assistant in e.164 (with "+") format
     * Example: +15551234567
     */
    public String assistantPhone;
    /**
     * Car phone number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String carPhone;
    /**
     * Other phone number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String otherPhone;
    /**
     * Other fax number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String otherFax;
    /**
     * Callback phone number of a contact in e.164 (with "+") format
     * Example: +15551234567
     */
    public String callbackPhone;
    /**
     *
     */
    public AddressBookBulkContactAddressInfo businessAddress;
    /**
     *
     */
    public AddressBookBulkContactAddressInfo homeAddress;
    /**
     *
     */
    public AddressBookBulkContactAddressInfo otherAddress;

    public AddressBookBulkContactResource email(String email) {
        this.email = email;
        return this;
    }

    public AddressBookBulkContactResource notes(String notes) {
        this.notes = notes;
        return this;
    }

    public AddressBookBulkContactResource company(String company) {
        this.company = company;
        return this;
    }

    public AddressBookBulkContactResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AddressBookBulkContactResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AddressBookBulkContactResource jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public AddressBookBulkContactResource birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public AddressBookBulkContactResource webPage(String webPage) {
        this.webPage = webPage;
        return this;
    }

    public AddressBookBulkContactResource middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public AddressBookBulkContactResource nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public AddressBookBulkContactResource email2(String email2) {
        this.email2 = email2;
        return this;
    }

    public AddressBookBulkContactResource email3(String email3) {
        this.email3 = email3;
        return this;
    }

    public AddressBookBulkContactResource homePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public AddressBookBulkContactResource homePhone2(String homePhone2) {
        this.homePhone2 = homePhone2;
        return this;
    }

    public AddressBookBulkContactResource businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    public AddressBookBulkContactResource businessPhone2(String businessPhone2) {
        this.businessPhone2 = businessPhone2;
        return this;
    }

    public AddressBookBulkContactResource mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public AddressBookBulkContactResource businessFax(String businessFax) {
        this.businessFax = businessFax;
        return this;
    }

    public AddressBookBulkContactResource companyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }

    public AddressBookBulkContactResource assistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
        return this;
    }

    public AddressBookBulkContactResource carPhone(String carPhone) {
        this.carPhone = carPhone;
        return this;
    }

    public AddressBookBulkContactResource otherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
        return this;
    }

    public AddressBookBulkContactResource otherFax(String otherFax) {
        this.otherFax = otherFax;
        return this;
    }

    public AddressBookBulkContactResource callbackPhone(String callbackPhone) {
        this.callbackPhone = callbackPhone;
        return this;
    }

    public AddressBookBulkContactResource businessAddress(AddressBookBulkContactAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public AddressBookBulkContactResource homeAddress(AddressBookBulkContactAddressInfo homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public AddressBookBulkContactResource otherAddress(AddressBookBulkContactAddressInfo otherAddress) {
        this.otherAddress = otherAddress;
        return this;
    }
}
