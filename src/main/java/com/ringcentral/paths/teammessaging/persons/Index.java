package com.ringcentral.paths.teammessaging.persons;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.Index parent;
public String personId;
public Index(com.ringcentral.paths.teammessaging.Index parent, String personId)
      {
this.parent = parent;
this.rc = parent.rc;
this.personId = personId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && personId != null)
            {
                return parent.path() + "/persons/" + personId;
            }
            return parent.path() + "/persons";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns a user or multiple users by their ID(s). Batch request is supported.
         * HTTP Method: get
         * Endpoint: /team-messaging/{version}/persons/{personId}
         * Rate Limit Group: Light
         * App Permission: TeamMessaging
         */
  public TMPersonInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (personId == null)
    {
        throw new IllegalArgumentException("Parameter personId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMPersonInfo.class);
    }
}