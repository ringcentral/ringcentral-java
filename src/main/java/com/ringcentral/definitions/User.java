package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class User {
    /**
     * user status
     */
    public Boolean active;
    /**
     *
     */
    public UserAddress[] addresses;
    /**
     * Required
     */
    public Email[] emails;
    /**
     * external unique resource id defined by provisioning client
     */
    public String externalId;
    /**
     * unique resource id defined by RingCentral
     */
    public String id;
    /**
     * Required
     */
    public Name name;
    /**
     *
     */
    public PhoneNumber[] phoneNumbers;
    /**
     *
     */
    public Photo[] photos;
    /**
     * Required
     */
    public String[] schemas;
    /**
     *
     */
    @JSONField(name = "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    public EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
    /**
     * MUST be same as work type email address
     * Required
     */
    public String userName;

    public User active(Boolean active) {
        this.active = active;
        return this;
    }

    public User addresses(UserAddress[] addresses) {
        this.addresses = addresses;
        return this;
    }

    public User emails(Email[] emails) {
        this.emails = emails;
        return this;
    }

    public User externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public User id(String id) {
        this.id = id;
        return this;
    }

    public User name(Name name) {
        this.name = name;
        return this;
    }

    public User phoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public User photos(Photo[] photos) {
        this.photos = photos;
        return this;
    }

    public User schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public User urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User) {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    public User userName(String userName) {
        this.userName = userName;
        return this;
    }

}
