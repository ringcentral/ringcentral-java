package com.ringcentral.paths.restapi.dictionary.language;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.dictionary.Index parent;
public String languageId;
public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String languageId)
      {
this.parent = parent;
this.rc = parent.rc;
this.languageId = languageId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && languageId != null)
            {
                return parent.path() + "/language/" + languageId;
            }
            return parent.path() + "/language";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns information about the supported languages.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/dictionary/language
         * Rate Limit Group: Light
         */
  public LanguageList list() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), LanguageList.class);
    }

        /**
         * Returns a language by ID.
 * 
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/dictionary/language/{languageId}
         * Rate Limit Group: Light
         */
  public LanguageInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (languageId == null)
    {
        throw new IllegalArgumentException("Parameter languageId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), LanguageInfo.class);
    }
}