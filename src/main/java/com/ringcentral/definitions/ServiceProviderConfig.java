package com.ringcentral.definitions;


public class ServiceProviderConfig {
    /**
     *
     */
    public AuthenticationScheme[] authenticationSchemes;
    /**
     *
     */
    public BulkSupported bulk;
    /**
     *
     */
    public Supported changePassword;
    /**
     *
     */
    public Supported etag;
    /**
     *
     */
    public FilterSupported filter;
    /**
     *
     */
    public Supported patch;
    /**
     *
     */
    public String[] schemas;
    /**
     *
     */
    public Supported sort;
    /**
     *
     */
    public Supported xmlDataFormat;

    public ServiceProviderConfig authenticationSchemes(AuthenticationScheme[] authenticationSchemes) {
        this.authenticationSchemes = authenticationSchemes;
        return this;
    }

    public ServiceProviderConfig bulk(BulkSupported bulk) {
        this.bulk = bulk;
        return this;
    }

    public ServiceProviderConfig changePassword(Supported changePassword) {
        this.changePassword = changePassword;
        return this;
    }

    public ServiceProviderConfig etag(Supported etag) {
        this.etag = etag;
        return this;
    }

    public ServiceProviderConfig filter(FilterSupported filter) {
        this.filter = filter;
        return this;
    }

    public ServiceProviderConfig patch(Supported patch) {
        this.patch = patch;
        return this;
    }

    public ServiceProviderConfig schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ServiceProviderConfig sort(Supported sort) {
        this.sort = sort;
        return this;
    }

    public ServiceProviderConfig xmlDataFormat(Supported xmlDataFormat) {
        this.xmlDataFormat = xmlDataFormat;
        return this;
    }

}
