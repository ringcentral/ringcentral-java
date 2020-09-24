package com.ringcentral.definitions;


public class CompanyDirectoryEventBody {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Type of change
     */
    public String eventType;
    /**
     * Type of extension
     */
    public String type;
    /**
     * Status of an extension
     * Enum: Enabled, NotActivated, Disabled
     */
    public String status;
    /**
     * First name of a user extension
     */
    public String firstName;
    /**
     * Last name of a user extension
     */
    public String lastName;
    /**
     * Name of a contact, for non-user extensions
     */
    public String name;
    /**
     * Department name
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
     *
     */
    public CompanyDirectoryAccountInfo account;
    /**
     *
     */
    public CompanyDirectoryPhoneNumberInfo[] phoneNumbers;
    /**
     * Site data
     */
    public ContactDirectorySiteInfo site;
    /**
     * Extension profile image information. Not returned if profile images are absent for an extension
     */
    public CompanyDirectoryProfileImageInfo profileImage;

    public CompanyDirectoryEventBody id(String id) {
        this.id = id;
        return this;
    }

    public CompanyDirectoryEventBody eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public CompanyDirectoryEventBody type(String type) {
        this.type = type;
        return this;
    }

    public CompanyDirectoryEventBody status(String status) {
        this.status = status;
        return this;
    }

    public CompanyDirectoryEventBody firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CompanyDirectoryEventBody lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CompanyDirectoryEventBody name(String name) {
        this.name = name;
        return this;
    }

    public CompanyDirectoryEventBody department(String department) {
        this.department = department;
        return this;
    }

    public CompanyDirectoryEventBody email(String email) {
        this.email = email;
        return this;
    }

    public CompanyDirectoryEventBody extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CompanyDirectoryEventBody account(CompanyDirectoryAccountInfo account) {
        this.account = account;
        return this;
    }

    public CompanyDirectoryEventBody phoneNumbers(CompanyDirectoryPhoneNumberInfo[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public CompanyDirectoryEventBody site(ContactDirectorySiteInfo site) {
        this.site = site;
        return this;
    }

    public CompanyDirectoryEventBody profileImage(CompanyDirectoryProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }

}
