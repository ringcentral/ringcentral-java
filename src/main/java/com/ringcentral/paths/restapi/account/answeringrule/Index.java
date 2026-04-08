package com.ringcentral.paths.restapi.account.answeringrule;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.Index parent;
public String ruleId;
public Index(com.ringcentral.paths.restapi.account.Index parent, String ruleId)
      {
this.parent = parent;
this.rc = parent.rc;
this.ruleId = ruleId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && ruleId != null)
            {
                return parent.path() + "/answering-rule/" + ruleId;
            }
            return parent.path() + "/answering-rule";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns a list of company call handling rules.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/answering-rule
         * Rate Limit Group: Medium
         * App Permission: ReadAccounts
         * User Permission: ReadCompanyAnsweringRules
         */
  public CompanyAnsweringRuleList list(ListCompanyAnsweringRulesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyAnsweringRuleList.class);
    }
    public CompanyAnsweringRuleList list() throws com.ringcentral.RestException, java.io.IOException
    {
      return this.list(null);
    }

        /**
         * Creates call handling rule on account level.
         * HTTP Method: post
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/answering-rule
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: EditCompanyAnsweringRules
         */
  public CompanyAnsweringRuleInfo post(CompanyAnsweringRuleRequest companyAnsweringRuleRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.post(this.path(false), companyAnsweringRuleRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyAnsweringRuleInfo.class);
    }

        /**
         * Returns a company call handling rule by ID.
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/answering-rule/{ruleId}
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         * User Permission: ReadCompanyAnsweringRules
         */
  public CompanyAnsweringRuleInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (ruleId == null)
    {
        throw new IllegalArgumentException("Parameter ruleId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyAnsweringRuleInfo.class);
    }

        /**
         * Updates a company call handling rule.
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/answering-rule/{ruleId}
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: EditCompanyAnsweringRules
         */
  public CompanyAnsweringRuleInfo put(CompanyAnsweringRuleUpdate companyAnsweringRuleUpdate) throws com.ringcentral.RestException, java.io.IOException
  {
    if (ruleId == null)
    {
        throw new IllegalArgumentException("Parameter ruleId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.put(this.path(), companyAnsweringRuleUpdate, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), CompanyAnsweringRuleInfo.class);
    }

        /**
         * Deletes a company custom call handling rule by a particular ID.
         * HTTP Method: delete
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/answering-rule/{ruleId}
         * Rate Limit Group: Medium
         * App Permission: EditAccounts
         * User Permission: EditCompanyAnsweringRules
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (ruleId == null)
    {
        throw new IllegalArgumentException("Parameter ruleId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }
}