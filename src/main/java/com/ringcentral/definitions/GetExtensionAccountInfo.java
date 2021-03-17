package com.ringcentral.definitions;


    // Account information
public class GetExtensionAccountInfo
{
    /**
         * Internal identifier of an account
         */
        public String id;
  public GetExtensionAccountInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of an account
         */
        public String uri;
  public GetExtensionAccountInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  
}
