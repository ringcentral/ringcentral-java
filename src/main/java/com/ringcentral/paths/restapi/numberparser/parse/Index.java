package com.ringcentral.paths.restapi.numberparser.parse;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.numberparser.Index parent;
public Index(com.ringcentral.paths.restapi.numberparser.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/parse";
        }
        /**
         * Returns one or more parsed and/or formatted phone numbers that are passed as a string.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/number-parser/parse
         * Rate Limit Group: Light
         */
  public ParsePhoneNumberResponse post(ParsePhoneNumberRequest parsePhoneNumberRequest, ParsePhoneNumberParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), parsePhoneNumberRequest, queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ParsePhoneNumberResponse.class);
    }
    public ParsePhoneNumberResponse post(ParsePhoneNumberRequest parsePhoneNumberRequest) throws com.ringcentral.RestException, java.io.IOException
    {
      return this.post(parsePhoneNumberRequest, null);
    }
}