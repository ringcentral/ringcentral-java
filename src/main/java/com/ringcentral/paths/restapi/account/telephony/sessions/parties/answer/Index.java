package com.ringcentral.paths.restapi.account.telephony.sessions.parties.answer;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent;
public Index(com.ringcentral.paths.restapi.account.telephony.sessions.parties.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/answer";
        }
        /**
         * Answers a call on a certain device by passing the corresponding device ID in request body. Supported for call forwarding, call transfer, call flip and call queues.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}/answer
         * Rate Limit Group: Light
         * App Permission: CallControl
         */
  public CallParty post(AnswerTarget answerTarget) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(), answerTarget, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }
}