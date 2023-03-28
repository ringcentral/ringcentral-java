package com.ringcentral.paths.teammessaging.files;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.Index parent;
public Index(com.ringcentral.paths.teammessaging.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/files";
        }
        /**
         * Posts a file.
         * HTTP Method: post
         * Endpoint: /team-messaging/{version}/files
         * Rate Limit Group: Heavy
         * App Permission: TeamMessaging
         */
  public TMAddFileRequest post(CreateGlipFileNewRequest createGlipFileNewRequest, CreateGlipFileNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), createGlipFileNewRequest, queryParams, com.ringcentral.ContentType.MULTIPART);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMAddFileRequest.class);
    }
    public TMAddFileRequest post(CreateGlipFileNewRequest createGlipFileNewRequest) throws com.ringcentral.RestException, java.io.IOException
    {
      return this.post(createGlipFileNewRequest, null);
    }
}