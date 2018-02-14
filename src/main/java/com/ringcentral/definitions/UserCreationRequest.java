package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserCreationRequest
{
    // Status of a user
    public Boolean active;
    public UserCreationRequest active(Boolean active) {
        this.active = active;
        return this;
    }
    // User addresses
    public AddressInfo[] addresses;
    public UserCreationRequest addresses(AddressInfo[] addresses) {
        this.addresses = addresses;
        return this;
    }
    // User email addresses
    public EmailInfo[] emails;
    public UserCreationRequest emails(EmailInfo[] emails) {
        this.emails = emails;
        return this;
    }
    // External identifier of a user
    public String externalId;
    public UserCreationRequest externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    // Internal identifier of a user
    public String id;
    public UserCreationRequest id(String id) {
        this.id = id;
        return this;
    }
    // User name
    public NameInfo name;
    public UserCreationRequest name(NameInfo name) {
        this.name = name;
        return this;
    }
    // User phone numbers
    public PhoneNumberInfoRequest[] phoneNumbers;
    public UserCreationRequest phoneNumbers(PhoneNumberInfoRequest[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    //
    public PhotoInfo[] photos;
    public UserCreationRequest photos(PhotoInfo[] photos) {
        this.photos = photos;
        return this;
    }
    // Specification links
    public String[] schemas;
    public UserCreationRequest schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    //
    // public EnterpriseUser urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    // public UserCreationRequest urn:ietf:params:scim:schemas:extension:enterprise:2.0:User(EnterpriseUser urn:ietf:params:scim:schemas:extension:enterprise:2.0:User) {
    //     this.urn:ietf:params:scim:schemas:extension:enterprise:2.0:User = urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    //     return this;
    // }
    // User mailbox. Must be same as work type email address
    public String userName;
    public UserCreationRequest userName(String userName) {
        this.userName = userName;
        return this;
    }
}
