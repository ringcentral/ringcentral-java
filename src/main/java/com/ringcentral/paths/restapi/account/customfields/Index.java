package com.ringcentral.paths.restapi.account.customfields;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.Index parent;
public String fieldId;
public Index(com.ringcentral.paths.restapi.account.Index parent, String fieldId)
      {
this.parent = parent;
this.rc = parent.rc;
this.fieldId = fieldId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && fieldId != null)
            {
                return parent.path() + "/custom-fields/" + fieldId;
            }
            return parent.path() + "/custom-fields";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns the list of created custom fields.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/custom-fields
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         * User Permission: ReadUserInfo
         */
  public CustomFieldsResource get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomFieldsResource.class);
    }

        /**
         * Creates custom field attached to the object.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/custom-fields
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: Users
         */
  public CustomFieldResource post(CustomFieldCreateRequest customFieldCreateRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(false), customFieldCreateRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomFieldResource.class);
    }

        /**
         * Updates custom field by ID specified in path.
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/custom-fields/{fieldId}
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: Users
         */
  public CustomFieldResource put(CustomFieldUpdateRequest customFieldUpdateRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    if (fieldId == null)
    {
        throw new IllegalArgumentException("Parameter fieldId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.put(this.path(), customFieldUpdateRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CustomFieldResource.class);
    }

        /**
         * Deletes custom field(s) by ID(s) with the corresponding values.
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/custom-fields/{fieldId}
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: Users
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (fieldId == null)
    {
        throw new IllegalArgumentException("Parameter fieldId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }
}