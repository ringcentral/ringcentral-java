package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ContactDirectoryEvent
{
    // Internal identifier of an extension
    public String id;
    public ContactDirectoryEvent id(String id) {
        this.id = id;
        return this;
    }
    // Type of change
    public String eventType;
    public ContactDirectoryEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    // Extension Type
    public String type;
    public ContactDirectoryEvent type(String type) {
        this.type = type;
        return this;
    }
    // Status of an extension
    public String status;
    public ContactDirectoryEvent status(String status) {
        this.status = status;
        return this;
    }
    // First name of an extension user
    public String firstName;
    public ContactDirectoryEvent firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    // Last name of an extension user
    public String lastName;
    public ContactDirectoryEvent lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    // Department Name
    public String department;
    public ContactDirectoryEvent department(String department) {
        this.department = department;
        return this;
    }
    // Email of an extension user
    public String email;
    public ContactDirectoryEvent email(String email) {
        this.email = email;
        return this;
    }
    // Extension number
    public String extensionNumber;
    public ContactDirectoryEvent extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Account data of an extension
    public CompanyDirectoryAccountInfo account;
    public ContactDirectoryEvent account(CompanyDirectoryAccountInfo account) {
        this.account = account;
        return this;
    }
    // Extension phone number information
    public CompanyDirectoryPhoneNumberInfo phoneNumbers;
    public ContactDirectoryEvent phoneNumbers(CompanyDirectoryPhoneNumberInfo phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    // Site Data
    public SiteInfo site;
    public ContactDirectoryEvent site(SiteInfo site) {
        this.site = site;
        return this;
    }
    // Extension profile image information. Not returned if profile images are absent for an extension
    public CompanyDirectoryProfileImageInfo profileImage;
    public ContactDirectoryEvent profileImage(CompanyDirectoryProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }
}
