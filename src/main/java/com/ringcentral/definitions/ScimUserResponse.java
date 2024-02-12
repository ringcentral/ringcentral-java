package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ScimUserResponse {
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
     * External unique resource ID defined by provisioning client
     */
    public String externalId;
    /**
     * Unique resource ID defined by RingCentral
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
    /**
     *
     */
    public ScimMeta meta;

    public ScimUserResponse active(Boolean active) {
        this.active = active;
        return this;
    }

    public ScimUserResponse addresses(ScimUserAddress[] addresses) {
        this.addresses = addresses;
        return this;
    }

    public ScimUserResponse emails(ScimEmail[] emails) {
        this.emails = emails;
        return this;
    }

    public ScimUserResponse externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public ScimUserResponse id(String id) {
        this.id = id;
        return this;
    }

    public ScimUserResponse name(ScimName name) {
        this.name = name;
        return this;
    }

    public ScimUserResponse phoneNumbers(ScimPhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public ScimUserResponse photos(ScimPhoto[] photos) {
        this.photos = photos;
        return this;
    }

    public ScimUserResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimUserResponse title(String title) {
        this.title = title;
        return this;
    }

    public ScimUserResponse urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User) {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    public ScimUserResponse userName(String userName) {
        this.userName = userName;
        return this;
    }

    public ScimUserResponse meta(ScimMeta meta) {
        this.meta = meta;
        return this;
    }
}
