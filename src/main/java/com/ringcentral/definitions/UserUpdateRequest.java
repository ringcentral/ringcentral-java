package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserUpdateRequest
{
    // Status of a user
    public Boolean active;
    public UserUpdateRequest active(Boolean active) {
        this.active = active;
        return this;
    }
    // User addresses
    public AddressInfo[] addresses;
    public UserUpdateRequest addresses(AddressInfo[] addresses) {
        this.addresses = addresses;
        return this;
    }
    // User email addresses
    public EmailInfo[] emails;
    public UserUpdateRequest emails(EmailInfo[] emails) {
        this.emails = emails;
        return this;
    }
    // External identifier of a user
    public String externalId;
    public UserUpdateRequest externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    // Internal identifier of a user
    public String id;
    public UserUpdateRequest id(String id) {
        this.id = id;
        return this;
    }
    // User name
    public NameInfo name;
    public UserUpdateRequest name(NameInfo name) {
        this.name = name;
        return this;
    }
    // User phone numbers
    public PhoneNumberInfoRequest[] phoneNumbers;
    public UserUpdateRequest phoneNumbers(PhoneNumberInfoRequest[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    //
    public PhotoInfo[] photos;
    public UserUpdateRequest photos(PhotoInfo[] photos) {
        this.photos = photos;
        return this;
    }
    // Specification links
    public String[] schemas;
    public UserUpdateRequest schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    //
    // public EnterpriseUser urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    // public UserUpdateRequest urn:ietf:params:scim:schemas:extension:enterprise:2.0:User(EnterpriseUser urn:ietf:params:scim:schemas:extension:enterprise:2.0:User) {
    //     this.urn:ietf:params:scim:schemas:extension:enterprise:2.0:User = urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    //     return this;
    // }
    // User mailbox. Must be same as work type email address
    public String userName;
    public UserUpdateRequest userName(String userName) {
        this.userName = userName;
        return this;
    }
}
