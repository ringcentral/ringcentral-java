package com.ringcentral.definitions;


public class ScimProviderConfig
{
    /**
     */
    public ScimAuthenticationScheme[] authenticationSchemes;
    public ScimProviderConfig authenticationSchemes(ScimAuthenticationScheme[] authenticationSchemes)
    {
        this.authenticationSchemes = authenticationSchemes;
        return this;
    }

    /**
     */
    public ScimBulkSupported bulk;
    public ScimProviderConfig bulk(ScimBulkSupported bulk)
    {
        this.bulk = bulk;
        return this;
    }

    /**
     */
    public ScimSupported changePassword;
    public ScimProviderConfig changePassword(ScimSupported changePassword)
    {
        this.changePassword = changePassword;
        return this;
    }

    /**
     */
    public ScimSupported etag;
    public ScimProviderConfig etag(ScimSupported etag)
    {
        this.etag = etag;
        return this;
    }

    /**
     */
    public ScimFilterSupported filter;
    public ScimProviderConfig filter(ScimFilterSupported filter)
    {
        this.filter = filter;
        return this;
    }

    /**
     */
    public ScimSupported patch;
    public ScimProviderConfig patch(ScimSupported patch)
    {
        this.patch = patch;
        return this;
    }

    /**
     * Enum: urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig
     */
    public String[] schemas;
    public ScimProviderConfig schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }

    /**
     */
    public ScimSupported sort;
    public ScimProviderConfig sort(ScimSupported sort)
    {
        this.sort = sort;
        return this;
    }

    /**
     */
    public ScimSupported xmlDataFormat;
    public ScimProviderConfig xmlDataFormat(ScimSupported xmlDataFormat)
    {
        this.xmlDataFormat = xmlDataFormat;
        return this;
    }
}