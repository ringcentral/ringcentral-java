package com.ringcentral.paths.restapi.dictionary.faxcoverpage;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.dictionary.Index parent;
public Index(com.ringcentral.paths.restapi.dictionary.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/fax-cover-page";
        }
        /**
         * Returns fax cover pages available for the current extension.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/dictionary/fax-cover-page
         * Rate Limit Group: Light
         */
  public ListFaxCoverPagesResponse get(ListFaxCoverPagesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ListFaxCoverPagesResponse.class);
    }
    public ListFaxCoverPagesResponse get() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.get(null);
    }
}