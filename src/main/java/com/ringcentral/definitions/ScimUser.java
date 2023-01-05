package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ScimUser
{
    /**
     * User status
     */
    public Boolean active;
    public ScimUser active(Boolean active)
    {
        this.active = active;
        return this;
    }

    /**
     */
    public ScimUserAddress[] addresses;
    public ScimUser addresses(ScimUserAddress[] addresses)
    {
        this.addresses = addresses;
        return this;
    }

    /**
     * Required
     */
    public ScimEmail[] emails;
    public ScimUser emails(ScimEmail[] emails)
    {
        this.emails = emails;
        return this;
    }

    /**
     * External unique resource id defined by provisioning client
     */
    public String externalId;
    public ScimUser externalId(String externalId)
    {
        this.externalId = externalId;
        return this;
    }

    /**
     * Unique resource id defined by RingCentral
     */
    public String id;
    public ScimUser id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Required
     */
    public ScimName name;
    public ScimUser name(ScimName name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public ScimPhoneNumber[] phoneNumbers;
    public ScimUser phoneNumbers(ScimPhoneNumber[] phoneNumbers)
    {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     */
    public ScimPhoto[] photos;
    public ScimUser photos(ScimPhoto[] photos)
    {
        this.photos = photos;
        return this;
    }

    /**
     * Required
     * Enum: urn:ietf:params:scim:schemas:core:2.0:User
     */
    public String[] schemas;
    public ScimUser schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }

    /**
     * User title
     */
    public String title;
    public ScimUser title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     */
    @SerializedName("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    public ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
    public ScimUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(ScimEnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User)
    {
        this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
        return this;
    }

    /**
     * MUST be same as work type email address
     * Required
     */
    public String userName;
    public ScimUser userName(String userName)
    {
        this.userName = userName;
        return this;
    }
}