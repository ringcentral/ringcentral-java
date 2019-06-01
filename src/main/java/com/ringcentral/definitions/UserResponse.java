package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class UserResponse {
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
    /**
     *
     */
    public Meta meta;

    public UserResponse active(Boolean active) {
        this.active = active;
        return this;
    }

    public UserResponse addresses(UserAddress[] addresses) {
        this.addresses = addresses;
        return this;
    }

    public UserResponse emails(Email[] emails) {
        this.emails = emails;
        return this;
    }

    public UserResponse externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public UserResponse id(String id) {
        this.id = id;
        return this;
    }

    public UserResponse name(Name name) {
        this.name = name;
        return this;
    }

    public UserResponse phoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public UserResponse photos(Photo[] photos) {
        this.photos = photos;
        return this;
    }

    public UserResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public UserResponse urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User) {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    public UserResponse userName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserResponse meta(Meta meta) {
        this.meta = meta;
        return this;
    }

}
