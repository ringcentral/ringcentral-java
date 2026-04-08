package com.ringcentral.paths.restapi.account.recording;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.Index parent;
public String recordingId;
public Index(com.ringcentral.paths.restapi.account.Index parent, String recordingId)
      {
this.parent = parent;
this.rc = parent.rc;
this.recordingId = recordingId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && recordingId != null)
            {
                return parent.path() + "/recording/" + recordingId;
            }
            return parent.path() + "/recording";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns call recordings by ID(s).
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/recording/{recordingId}
         * Rate Limit Group: Heavy
         * App Permission: ReadCallRecording
         * User Permission: ReadCallRecording
         */
  public GetCallRecordingResponse get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (recordingId == null)
    {
        throw new IllegalArgumentException("Parameter recordingId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), GetCallRecordingResponse.class);
    }

    public com.ringcentral.paths.restapi.account.recording.content.Index content()
  {
    return new com.ringcentral.paths.restapi.account.recording.content.Index(this);
  }

}