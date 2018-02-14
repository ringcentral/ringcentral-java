package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserInfo
{
    // Status of a user
    public Boolean active;
    public UserInfo active(Boolean active) {
        this.active = active;
        return this;
    }
    // User addresses
    public AddressInfo[] addresses;
    public UserInfo addresses(AddressInfo[] addresses) {
        this.addresses = addresses;
        return this;
    }
    // User email addresses
    public EmailInfo[] emails;
    public UserInfo emails(EmailInfo[] emails) {
        this.emails = emails;
        return this;
    }
    // External identifier of a user
    public String externalId;
    public UserInfo externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    // Internal identifier of a user
    public String id;
    public UserInfo id(String id) {
        this.id = id;
        return this;
    }
    // User name
    public NameInfo name;
    public UserInfo name(NameInfo name) {
        this.name = name;
        return this;
    }
    // User phone numbers
    public PhoneNumberInfoRequest[] phoneNumbers;
    public UserInfo phoneNumbers(PhoneNumberInfoRequest[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    //
    public PhotoInfo[] photos;
    public UserInfo photos(PhotoInfo[] photos) {
        this.photos = photos;
        return this;
    }
    // Specification links
    public String[] schemas;
    public UserInfo schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    //
    // public EnterpriseUser urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    // public UserInfo urn:ietf:params:scim:schemas:extension:enterprise:2.0:User(EnterpriseUser urn:ietf:params:scim:schemas:extension:enterprise:2.0:User) {
    //     this.urn:ietf:params:scim:schemas:extension:enterprise:2.0:User = urn:ietf:params:scim:schemas:extension:enterprise:2.0:User;
    //     return this;
    // }
    // User mailbox. Must be same as work type email address
    public String userName;
    public UserInfo userName(String userName) {
        this.userName = userName;
        return this;
    }
    // User metadata
    public MetaInfo meta;
    public UserInfo meta(MetaInfo meta) {
        this.meta = meta;
        return this;
    }
}
