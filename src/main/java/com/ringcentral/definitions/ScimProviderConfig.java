package com.ringcentral.definitions;


public class ScimProviderConfig {
    /**
     *
     */
    public ScimAuthenticationScheme[] authenticationSchemes;
    /**
     *
     */
    public ScimBulkSupported bulk;
    /**
     *
     */
    public ScimSupported changePassword;
    /**
     *
     */
    public ScimSupported etag;
    /**
     *
     */
    public ScimFilterSupported filter;
    /**
     *
     */
    public ScimSupported patch;
    /**
     * Enum: urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig
     */
    public String[] schemas;
    /**
     *
     */
    public ScimSupported sort;
    /**
     *
     */
    public ScimSupported xmlDataFormat;

    public ScimProviderConfig authenticationSchemes(ScimAuthenticationScheme[] authenticationSchemes) {
        this.authenticationSchemes = authenticationSchemes;
        return this;
    }

    public ScimProviderConfig bulk(ScimBulkSupported bulk) {
        this.bulk = bulk;
        return this;
    }

    public ScimProviderConfig changePassword(ScimSupported changePassword) {
        this.changePassword = changePassword;
        return this;
    }

    public ScimProviderConfig etag(ScimSupported etag) {
        this.etag = etag;
        return this;
    }

    public ScimProviderConfig filter(ScimFilterSupported filter) {
        this.filter = filter;
        return this;
    }

    public ScimProviderConfig patch(ScimSupported patch) {
        this.patch = patch;
        return this;
    }

    public ScimProviderConfig schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimProviderConfig sort(ScimSupported sort) {
        this.sort = sort;
        return this;
    }

    public ScimProviderConfig xmlDataFormat(ScimSupported xmlDataFormat) {
        this.xmlDataFormat = xmlDataFormat;
        return this;
    }
}
