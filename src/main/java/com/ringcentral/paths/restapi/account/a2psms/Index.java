package com.ringcentral.paths.restapi.account.a2psms;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.Index parent;
public Index(com.ringcentral.paths.restapi.account.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/a2p-sms";
        }


  public com.ringcentral.paths.restapi.account.a2psms.batch.Index batch()
    {
      return this.batch(null);
    }
  public com.ringcentral.paths.restapi.account.a2psms.batch.Index batch(String batchId)
  {
    return new com.ringcentral.paths.restapi.account.a2psms.batch.Index(this, batchId);
  }


  public com.ringcentral.paths.restapi.account.a2psms.messages.Index messages()
    {
      return this.messages(null);
    }
  public com.ringcentral.paths.restapi.account.a2psms.messages.Index messages(String messageId)
  {
    return new com.ringcentral.paths.restapi.account.a2psms.messages.Index(this, messageId);
  }


    public com.ringcentral.paths.restapi.account.a2psms.optouts.Index optOuts()
  {
    return new com.ringcentral.paths.restapi.account.a2psms.optouts.Index(this);
  }

}