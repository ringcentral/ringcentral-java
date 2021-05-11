package com.ringcentral.paths.restapi.account.directory.entries;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.directory.Index parent;
public String entryId;
public Index(com.ringcentral.paths.restapi.account.directory.Index parent, String entryId)
      {
this.parent = parent;
this.rc = parent.rc;
this.entryId = entryId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && entryId != null)
            {
                return parent.path() + "/entries/" + entryId;
            }
            return parent.path() + "/entries";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns contact information on corporate users of federated accounts. Please note: 1. `User`, `DigitalUser`, `VirtualUser` and `FaxUser` types are returned as `User` type. 2. `ApplicationExtension` type is not returned. 3. Only extensions in `Enabled`, `Disabled` and `NotActivated` state are returned.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/directory/entries
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         */
  public DirectoryResource list(ListDirectoryEntriesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), DirectoryResource.class);
    }
    public DirectoryResource list() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.list(null);
    }

        /**
         * Returns contact information on a particular corporate user of a federated account.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/directory/entries/{entryId}
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         */
  public ContactResource get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (entryId == null)
    {
        throw new IllegalArgumentException("Parameter entryId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ContactResource.class);
    }

    public com.ringcentral.paths.restapi.account.directory.entries.search.Index search()
  {
    return new com.ringcentral.paths.restapi.account.directory.entries.search.Index(this);
  }

}