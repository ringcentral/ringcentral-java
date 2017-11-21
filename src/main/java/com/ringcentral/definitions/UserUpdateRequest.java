package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserUpdateRequest
{
    // Specification links
    public String[] schemas;
    public UserUpdateRequest schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    // User name
    public NameInfoRequest name;
    public UserUpdateRequest name(NameInfoRequest name) {
        this.name = name;
        return this;
    }
    // User mailbox
    public String userName;
    public UserUpdateRequest userName(String userName) {
        this.userName = userName;
        return this;
    }
    // User email addresses
    public EmailInfoRequest[] emails;
    public UserUpdateRequest emails(EmailInfoRequest[] emails) {
        this.emails = emails;
        return this;
    }
    // Status of a user
    public Boolean active;
    public UserUpdateRequest active(Boolean active) {
        this.active = active;
        return this;
    }
    // User phone numbers
    public PhoneNumberInfoRequest[] phoneNumbers;
    public UserUpdateRequest phoneNumbers(PhoneNumberInfoRequest[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    // External identifier of a user
    public String externalId;
    public UserUpdateRequest externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    // User addresses
    public AddressInfoRequest addresses;
    public UserUpdateRequest addresses(AddressInfoRequest addresses) {
        this.addresses = addresses;
        return this;
    }
    // Internal identifier of a user
    public String id;
    public UserUpdateRequest id(String id) {
        this.id = id;
        return this;
    }
}
