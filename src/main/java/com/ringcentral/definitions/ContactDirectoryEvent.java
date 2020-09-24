package com.ringcentral.definitions;


public class ContactDirectoryEvent {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Type of change
     */
    public String eventType;
    /**
     * Extension Type
     */
    public String type;
    /**
     * Status of an extension
     * Enum: Disabled, Enabled, NotActivated
     */
    public String status;
    /**
     * First name of an extension user
     */
    public String firstName;
    /**
     * Last name of an extension user
     */
    public String lastName;
    /**
     * Department Name
     */
    public String department;
    /**
     * Email of an extension user
     */
    public String email;
    /**
     * Extension number
     */
    public String extensionNumber;
    /**
     * Account data of an extension
     */
    public CompanyDirectoryAccountInfo account;
    /**
     * Extension phone number information
     */
    public CompanyDirectoryPhoneNumberInfo phoneNumbers;
    /**
     * Site Data
     */
    public ContactDirectorySiteInfo site;
    /**
     * Extension profile image information. Not returned if profile images are absent for an extension
     */
    public CompanyDirectoryProfileImageInfo profileImage;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public ContactDirectoryEvent id(String id) {
        this.id = id;
        return this;
    }

    public ContactDirectoryEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public ContactDirectoryEvent type(String type) {
        this.type = type;
        return this;
    }

    public ContactDirectoryEvent status(String status) {
        this.status = status;
        return this;
    }

    public ContactDirectoryEvent firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactDirectoryEvent lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactDirectoryEvent department(String department) {
        this.department = department;
        return this;
    }

    public ContactDirectoryEvent email(String email) {
        this.email = email;
        return this;
    }

    public ContactDirectoryEvent extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ContactDirectoryEvent account(CompanyDirectoryAccountInfo account) {
        this.account = account;
        return this;
    }

    public ContactDirectoryEvent phoneNumbers(CompanyDirectoryPhoneNumberInfo phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public ContactDirectoryEvent site(ContactDirectorySiteInfo site) {
        this.site = site;
        return this;
    }

    public ContactDirectoryEvent profileImage(CompanyDirectoryProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    public ContactDirectoryEvent ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
