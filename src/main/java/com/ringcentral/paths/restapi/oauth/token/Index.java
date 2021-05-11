package com.ringcentral.paths.restapi.oauth.token;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.oauth.Index parent;
public Index(com.ringcentral.paths.restapi.oauth.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/token";
        }
        /**
         * Returns access tokens for making API requests
         * HTTP Method: post
         * Endpoint: /restapi/oauth/token
         * Rate Limit Group: Auth
         */
  public TokenInfo post(GetTokenRequest getTokenRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), getTokenRequest, null, com.ringcentral.ContentType.FORM);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TokenInfo.class);
    }
}