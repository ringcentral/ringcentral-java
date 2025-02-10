package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ScimUserShortInfo {
    /**
     * User status
     */
    public Boolean active;
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

    public ScimUserShortInfo active(Boolean active) {
        this.active = active;
        return this;
    }

    public ScimUserShortInfo emails(ScimEmail[] emails) {
        this.emails = emails;
        return this;
    }

    public ScimUserShortInfo externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public ScimUserShortInfo id(String id) {
        this.id = id;
        return this;
    }

    public ScimUserShortInfo name(ScimName name) {
        this.name = name;
        return this;
    }

    public ScimUserShortInfo photos(ScimPhoto[] photos) {
        this.photos = photos;
        return this;
    }

    public ScimUserShortInfo schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimUserShortInfo title(String title) {
        this.title = title;
        return this;
    }

    public ScimUserShortInfo urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User) {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    public ScimUserShortInfo userName(String userName) {
        this.userName = userName;
        return this;
    }

    public ScimUserShortInfo meta(ScimMeta meta) {
        this.meta = meta;
        return this;
    }
}
