package com.ringcentral.definitions;


public class UserAnsweringRuleList
{
    /**
     * Canonical URI of an answering rule list resource
     * Example: https://platform.ringcentral.com/restapi/v1.0/account/240913004/extension/240972004/answering-rule?page=1&amp;perPage=100
     */
    public String uri;
    public UserAnsweringRuleList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of answering rules
     */
    public UserAnsweringRuleListRecord[] records;
    public UserAnsweringRuleList records(UserAnsweringRuleListRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public EnumeratedPaging paging;
    public UserAnsweringRuleList paging(EnumeratedPaging paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public UserAnsweringRuleListNavigation navigation;
    public UserAnsweringRuleList navigation(UserAnsweringRuleListNavigation navigation)
    {
        this.navigation = navigation;
        return this;
    }
}