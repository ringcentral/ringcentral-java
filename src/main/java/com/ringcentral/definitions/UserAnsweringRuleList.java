package com.ringcentral.definitions;


public class UserAnsweringRuleList
{
    /**
     * Canonical URI of an answering rule list resource
     * Format: uri
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
    public CallHandlingRuleInfo[] records;
    public UserAnsweringRuleList records(CallHandlingRuleInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public UserAnsweringRuleList paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public UserAnsweringRuleList navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }
}