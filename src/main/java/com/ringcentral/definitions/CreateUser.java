package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class CreateUser {
    /**
     * User status
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
    @SerializedName("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    public EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
    /**
     * MUST be same as work type email address
     * Required
     */
    public String userName;

    public CreateUser active(Boolean active) {
        this.active = active;
        return this;
    }

    public CreateUser addresses(UserAddress[] addresses) {
        this.addresses = addresses;
        return this;
    }

    public CreateUser emails(Email[] emails) {
        this.emails = emails;
        return this;
    }

    public CreateUser externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public CreateUser name(Name name) {
        this.name = name;
        return this;
    }

    public CreateUser phoneNumbers(PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public CreateUser photos(Photo[] photos) {
        this.photos = photos;
        return this;
    }

    public CreateUser schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public CreateUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User) {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    public CreateUser userName(String userName) {
        this.userName = userName;
        return this;
    }

}
