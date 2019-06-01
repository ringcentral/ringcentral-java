package com.ringcentral.definitions;


public class ContactResource {
    /**
     *
     */
    public AccountResource account;
    /**
     *
     */
    public String department;
    /**
     *
     */
    public String email;
    /**
     *
     */
    public String extensionNumber;
    /**
     * First name of a contact, for user extensions only
     */
    public String firstName;
    /**
     * Last name of a contact, for user extensions only
     */
    public String lastName;
    /**
     * Name of a contact, for non-user extensions
     */
    public String name;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String jobTitle;
    /**
     *
     */
    public PhoneNumberResource[] phoneNumbers;
    /**
     *
     */
    public AccountDirectoryProfileImageResource profileImage;
    /**
     *
     */
    public BusinessSiteResource site;
    /**
     *
     */
    public String status;
    /**
     *
     */
    public String type;

    public ContactResource account(AccountResource account) {
        this.account = account;
        return this;
    }

    public ContactResource department(String department) {
        this.department = department;
        return this;
    }

    public ContactResource email(String email) {
        this.email = email;
        return this;
    }

    public ContactResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ContactResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactResource name(String name) {
        this.name = name;
        return this;
    }

    public ContactResource id(String id) {
        this.id = id;
        return this;
    }

    public ContactResource jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public ContactResource phoneNumbers(PhoneNumberResource[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public ContactResource profileImage(AccountDirectoryProfileImageResource profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    public ContactResource site(BusinessSiteResource site) {
        this.site = site;
        return this;
    }

    public ContactResource status(String status) {
        this.status = status;
        return this;
    }

    public ContactResource type(String type) {
        this.type = type;
        return this;
    }

}
