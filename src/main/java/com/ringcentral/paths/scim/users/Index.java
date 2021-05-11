package com.ringcentral.paths.scim.users;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.scim.Index parent;
public String id;
public Index(com.ringcentral.paths.scim.Index parent, String id)
      {
this.parent = parent;
this.rc = parent.rc;
this.id = id;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && id != null)
            {
                return parent.path() + "/Users/" + id;
            }
            return parent.path() + "/Users";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Search/List Users
         * HTTP Method: get
         * Endpoint: /scim/{version}/Users
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         */
  public UserSearchResponse list(SearchViaGet2Parameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UserSearchResponse.class);
    }
    public UserSearchResponse list() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.list(null);
    }

        /**
         * Create User
         * HTTP Method: post
         * Endpoint: /scim/{version}/Users
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public UserResponse post(CreateUser createUser) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(false), createUser, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UserResponse.class);
    }

        /**
         * Get User
         * HTTP Method: get
         * Endpoint: /scim/{version}/Users/{id}
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         */
  public UserResponse get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (id == null)
    {
        throw new IllegalArgumentException("Parameter id cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UserResponse.class);
    }

        /**
         * Update/Replace User
         * HTTP Method: put
         * Endpoint: /scim/{version}/Users/{id}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public UserResponse put(User user) throws com.ringcentral.RestException, java.io.IOException
  {
    if (id == null)
    {
        throw new IllegalArgumentException("Parameter id cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.put(this.path(), user, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UserResponse.class);
    }

        /**
         * Delete User
         * HTTP Method: delete
         * Endpoint: /scim/{version}/Users/{id}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (id == null)
    {
        throw new IllegalArgumentException("Parameter id cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

        /**
         * Update/Patch User
         * HTTP Method: patch
         * Endpoint: /scim/{version}/Users/{id}
         * Rate Limit Group: Heavy
         * App Permission: EditAccounts
         */
  public UserResponse patch(UserPatch userPatch) throws com.ringcentral.RestException, java.io.IOException
  {
    if (id == null)
    {
        throw new IllegalArgumentException("Parameter id cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.patch(this.path(), userPatch, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), UserResponse.class);
    }

    public com.ringcentral.paths.scim.users.dotsearch.Index dotSearch()
  {
    return new com.ringcentral.paths.scim.users.dotsearch.Index(this);
  }

}