package com.ringcentral.paths.restapi.dictionary.country;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.dictionary.Index parent;
public String countryId;
public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String countryId)
      {
this.parent = parent;
this.rc = parent.rc;
this.countryId = countryId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && countryId != null)
            {
                return parent.path() + "/country/" + countryId;
            }
            return parent.path() + "/country";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns all the countries available for calling.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/dictionary/country
         * Rate Limit Group: Light
         */
  public GetCountryListResponse list(ListCountriesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GetCountryListResponse.class);
    }
    public GetCountryListResponse list() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.list(null);
    }

        /**
         * Returns the information on a specific country.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/dictionary/country/{countryId}
         * Rate Limit Group: Light
         */
  public GetCountryInfoDictionaryResponse get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (countryId == null)
    {
        throw new IllegalArgumentException("Parameter countryId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GetCountryInfoDictionaryResponse.class);
    }
}