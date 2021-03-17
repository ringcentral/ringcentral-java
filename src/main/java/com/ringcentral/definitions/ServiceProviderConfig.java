package com.ringcentral.definitions;


public class ServiceProviderConfig
{
    /**
         */
        public AuthenticationScheme[] authenticationSchemes;
  public ServiceProviderConfig authenticationSchemes(AuthenticationScheme[] authenticationSchemes)
  {
    this.authenticationSchemes = authenticationSchemes;
    return this;
  }
  

        /**
         */
        public BulkSupported bulk;
  public ServiceProviderConfig bulk(BulkSupported bulk)
  {
    this.bulk = bulk;
    return this;
  }
  

        /**
         */
        public Supported changePassword;
  public ServiceProviderConfig changePassword(Supported changePassword)
  {
    this.changePassword = changePassword;
    return this;
  }
  

        /**
         */
        public Supported etag;
  public ServiceProviderConfig etag(Supported etag)
  {
    this.etag = etag;
    return this;
  }
  

        /**
         */
        public FilterSupported filter;
  public ServiceProviderConfig filter(FilterSupported filter)
  {
    this.filter = filter;
    return this;
  }
  

        /**
         */
        public Supported patch;
  public ServiceProviderConfig patch(Supported patch)
  {
    this.patch = patch;
    return this;
  }
  

        /**
         */
        public String[] schemas;
  public ServiceProviderConfig schemas(String[] schemas)
  {
    this.schemas = schemas;
    return this;
  }
  

        /**
         */
        public Supported sort;
  public ServiceProviderConfig sort(Supported sort)
  {
    this.sort = sort;
    return this;
  }
  

        /**
         */
        public Supported xmlDataFormat;
  public ServiceProviderConfig xmlDataFormat(Supported xmlDataFormat)
  {
    this.xmlDataFormat = xmlDataFormat;
    return this;
  }
  
}
