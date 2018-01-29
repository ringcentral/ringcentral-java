package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserCreationRequest
{
    // Specification links
    public String[] schemas;
    public UserCreationRequest schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    // User name
    public NameInfoRequest name;
    public UserCreationRequest name(NameInfoRequest name) {
        this.name = name;
        return this;
    }
    // User mailbox
    public String userName;
    public UserCreationRequest userName(String userName) {
        this.userName = userName;
        return this;
    }
    // User email addresses
    public EmailInfoRequest[] emails;
    public UserCreationRequest emails(EmailInfoRequest[] emails) {
        this.emails = emails;
        return this;
    }
    // User phone numbers
    public PhoneNumberInfoRequest[] phoneNumbers;
    public UserCreationRequest phoneNumbers(PhoneNumberInfoRequest[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    // External identifier of a user
    public String externalId;
    public UserCreationRequest externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    // User addresses
    public AddressInfoRequest addresses;
    public UserCreationRequest addresses(AddressInfoRequest addresses) {
        this.addresses = addresses;
        return this;
    }
    // Urn link
    // public UrnInfoRequest urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    // public UserCreationRequest urn:ietf:params:scim:schemas:extension:enterprise:2.0:User(UrnInfoRequest urn:ietf:params:scim:schemas:extension:enterprise:2.0:User) {
    //     this.urn:ietf:params:scim:schemas:extension:enterprise:2.0:User = urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    //     return this;
    // }
}
