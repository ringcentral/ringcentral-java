package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyDirectoryContactInfo
{
    // Internal identifier of an extension
    public String id;
    public CompanyDirectoryContactInfo id(String id) {
        this.id = id;
        return this;
    }
    // Type of an extension
    public String type;
    public CompanyDirectoryContactInfo type(String type) {
        this.type = type;
        return this;
    }
    // Status of an extension
    public String status;
    public CompanyDirectoryContactInfo status(String status) {
        this.status = status;
        return this;
    }
    // User extension first name
    public String firstName;
    public CompanyDirectoryContactInfo firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    // User extension last name
    public String lastName;
    public CompanyDirectoryContactInfo lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    // Name of an extension
    public String name;
    public CompanyDirectoryContactInfo name(String name) {
        this.name = name;
        return this;
    }
    // Department name of an extension
    public String department;
    public CompanyDirectoryContactInfo department(String department) {
        this.department = department;
        return this;
    }
    // Email of an extension
    public String email;
    public CompanyDirectoryContactInfo email(String email) {
        this.email = email;
        return this;
    }
    // Number of an extension
    public String extensionNumber;
    public CompanyDirectoryContactInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    // Account data of an extension
    public CompanyDirectoryAccountInfo account;
    public CompanyDirectoryContactInfo account(CompanyDirectoryAccountInfo account) {
        this.account = account;
        return this;
    }
    // Extension phone numbers information
    public CompanyDirectoryPhoneNumberInfo[] phoneNumbers;
    public CompanyDirectoryContactInfo phoneNumbers(CompanyDirectoryPhoneNumberInfo[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    // Extension profile image information. Not returned if profile images are absent for an extension
    public CompanyDirectoryProfileImageInfo profileImage;
    public CompanyDirectoryContactInfo profileImage(CompanyDirectoryProfileImageInfo profileImage) {
        this.profileImage = profileImage;
        return this;
    }
}
