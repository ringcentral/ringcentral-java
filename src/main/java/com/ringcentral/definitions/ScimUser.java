package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ScimUser {
    /**
     * User status
     */
    public Boolean active;
    /**
     *
     */
    public ScimUserAddress[] addresses;
    /**
     * Required
     */
    public ScimEmail[] emails;
    /**
     * External unique resource id defined by provisioning client
     */
    public String externalId;
    /**
     * Unique resource id defined by RingCentral
     */
    public String id;
    /**
     * Required
     */
    public ScimName name;
    /**
     *
     */
    public ScimPhoneNumber[] phoneNumbers;
    /**
     *
     */
    public ScimPhoto[] photos;
    /**
     * Required
     * Enum: urn:ietf:params:scim:schemas:core:2.0:User
     */
    public String[] schemas;
    /**
     * User title
     */
    public String title;
    /**
     *
     */
    @SerializedName("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    public ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
    /**
     * MUST be same as work type email address
     * Required
     */
    public String userName;

    public ScimUser active(Boolean active) {
        this.active = active;
        return this;
    }

    public ScimUser addresses(ScimUserAddress[] addresses) {
        this.addresses = addresses;
        return this;
    }

    public ScimUser emails(ScimEmail[] emails) {
        this.emails = emails;
        return this;
    }

    public ScimUser externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public ScimUser id(String id) {
        this.id = id;
        return this;
    }

    public ScimUser name(ScimName name) {
        this.name = name;
        return this;
    }

    public ScimUser phoneNumbers(ScimPhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public ScimUser photos(ScimPhoto[] photos) {
        this.photos = photos;
        return this;
    }

    public ScimUser schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimUser title(String title) {
        this.title = title;
        return this;
    }

    public ScimUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User) {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    public ScimUser userName(String userName) {
        this.userName = userName;
        return this;
    }
}
