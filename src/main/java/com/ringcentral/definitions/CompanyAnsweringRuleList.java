package com.ringcentral.definitions;


public class CompanyAnsweringRuleList {
    /**
     * Link to an answering rule resource
     */
    public String uri;
    /**
     * List of company answering rules
     */
    public ListCompanyAnsweringRuleInfo[] records;
    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;
    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;

    public CompanyAnsweringRuleList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CompanyAnsweringRuleList records(ListCompanyAnsweringRuleInfo[] records) {
        this.records = records;
        return this;
    }

    public CompanyAnsweringRuleList paging(CallHandlingPagingInfo paging) {
        this.paging = paging;
        return this;
    }

    public CompanyAnsweringRuleList navigation(CallHandlingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
