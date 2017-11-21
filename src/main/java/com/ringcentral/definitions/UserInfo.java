package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserInfo
{
    // Specification links
    public String[] schemas;
    public UserInfo schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    // Internal identifier of a user
    public String id;
    public UserInfo id(String id) {
        this.id = id;
        return this;
    }
    // External identifier of a user
    public String externalId;
    public UserInfo externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    // User metadata
    public MetaInfo meta;
    public UserInfo meta(MetaInfo meta) {
        this.meta = meta;
        return this;
    }
    // User mailbox
    public String userName;
    public UserInfo userName(String userName) {
        this.userName = userName;
        return this;
    }
    // User name
    public NameInfo name;
    public UserInfo name(NameInfo name) {
        this.name = name;
        return this;
    }
    // Status of a user
    public Boolean active;
    public UserInfo active(Boolean active) {
        this.active = active;
        return this;
    }
    // User email addresses
    public EmailInfo[] emails;
    public UserInfo emails(EmailInfo[] emails) {
        this.emails = emails;
        return this;
    }
    // User phone numbers
    public PhoneNumberInfo[] phoneNumbers;
    public UserInfo phoneNumbers(PhoneNumberInfo[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    // User addresses
    public AddressInfo[] addresses;
    public UserInfo addresses(AddressInfo[] addresses) {
        this.addresses = addresses;
        return this;
    }
}
