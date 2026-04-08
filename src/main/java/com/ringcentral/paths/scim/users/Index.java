package com.ringcentral.paths.scim.users;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.scim.Index parent;
public String scimUserId;
public Index(com.ringcentral.paths.scim.Index parent, String scimUserId)
      {
this.parent = parent;
this.rc = parent.rc;
this.scimUserId = scimUserId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && scimUserId != null)
            {
                return parent.path() + "/Users/" + scimUserId;
            }
            return parent.path() + "/Users";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns the list of users satisfying search criteria
         * HTTP Method: get
         * Endpoint: /scim/{version}/Users
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         */
  public ScimUserSearchResponse list(ScimSearchViaGet2Parameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimUserSearchResponse.class);
    }
    public ScimUserSearchResponse list() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.list(null);
    }

        /**
         * Creates a new user
         * HTTP Method: post
         * Endpoint: /scim/{version}/Users
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public ScimUserResponse post(ScimUser scimUser) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(false), scimUser, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimUserResponse.class);
    }

        /**
         * Returns a user by ID
         * HTTP Method: get
         * Endpoint: /scim/{version}/Users/{scimUserId}
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         */
  public ScimUserResponse get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (scimUserId == null)
    {
        throw new IllegalArgumentException("Parameter scimUserId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimUserResponse.class);
    }

        /**
         * Updates a user
         * HTTP Method: put
         * Endpoint: /scim/{version}/Users/{scimUserId}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public ScimUserResponse put(ScimUser scimUser) throws com.ringcentral.RestException, java.io.IOException
  {
    if (scimUserId == null)
    {
        throw new IllegalArgumentException("Parameter scimUserId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.put(this.path(), scimUser, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimUserResponse.class);
    }

        /**
         * Deletes a user
         * HTTP Method: delete
         * Endpoint: /scim/{version}/Users/{scimUserId}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (scimUserId == null)
    {
        throw new IllegalArgumentException("Parameter scimUserId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

        /**
         * Updates a user (partial update)
         * HTTP Method: patch
         * Endpoint: /scim/{version}/Users/{scimUserId}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public ScimUserResponse patch(ScimUserPatch scimUserPatch) throws com.ringcentral.RestException, java.io.IOException
  {
    if (scimUserId == null)
    {
        throw new IllegalArgumentException("Parameter scimUserId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.patch(this.path(), scimUserPatch, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), ScimUserResponse.class);
    }

    public com.ringcentral.paths.scim.users.dotsearch.Index dotSearch()
  {
    return new com.ringcentral.paths.scim.users.dotsearch.Index(this);
  }

}