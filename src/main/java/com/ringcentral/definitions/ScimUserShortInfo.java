package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ScimUserShortInfo
{
    /**
     * User status
     */
    public Boolean active;
    public ScimUserShortInfo active(Boolean active)
    {
        this.active = active;
        return this;
    }

    /**
     * Required
     */
    public ScimEmail[] emails;
    public ScimUserShortInfo emails(ScimEmail[] emails)
    {
        this.emails = emails;
        return this;
    }

    /**
     * External unique resource ID defined by provisioning client
     */
    public String externalId;
    public ScimUserShortInfo externalId(String externalId)
    {
        this.externalId = externalId;
        return this;
    }

    /**
     * Unique resource ID defined by RingCentral
     */
    public String id;
    public ScimUserShortInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Required
     */
    public ScimName name;
    public ScimUserShortInfo name(ScimName name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public ScimPhoto[] photos;
    public ScimUserShortInfo photos(ScimPhoto[] photos)
    {
        this.photos = photos;
        return this;
    }

    /**
     * Required
     * Enum: urn:ietf:params:scim:schemas:core:2.0:User
     */
    public String[] schemas;
    public ScimUserShortInfo schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }

    /**
     * User title
     */
    public String title;
    public ScimUserShortInfo title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     */
    @SerializedName("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    public ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
    public ScimUserShortInfo urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User)
    {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    /**
     * MUST be same as work type email address
     * Required
     */
    public String userName;
    public ScimUserShortInfo userName(String userName)
    {
        this.userName = userName;
        return this;
    }

    /**
     */
    public ScimMeta meta;
    public ScimUserShortInfo meta(ScimMeta meta)
    {
        this.meta = meta;
        return this;
    }
}