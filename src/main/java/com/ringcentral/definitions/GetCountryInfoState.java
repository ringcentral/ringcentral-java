package com.ringcentral.definitions;


    // Information on a country the state belongs to
public class GetCountryInfoState
{
    /**
         * Internal identifier of a state
         */
        public String id;
  public GetCountryInfoState id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of a state
         */
        public String uri;
  public GetCountryInfoState uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  
}
