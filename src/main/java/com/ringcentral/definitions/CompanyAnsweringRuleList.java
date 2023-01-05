package com.ringcentral.definitions;


public class CompanyAnsweringRuleList
{
    /**
     * Link to an answering rule resource
     */
    public String uri;
    public CompanyAnsweringRuleList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of company answering rules
     */
    public ListCompanyAnsweringRuleInfo[] records;
    public CompanyAnsweringRuleList records(ListCompanyAnsweringRuleInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public EnumeratedPaging paging;
    public CompanyAnsweringRuleList paging(EnumeratedPaging paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public NavigationInfo navigation;
    public CompanyAnsweringRuleList navigation(NavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }
}