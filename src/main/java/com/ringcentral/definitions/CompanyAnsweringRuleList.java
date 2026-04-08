package com.ringcentral.definitions;

public class CompanyAnsweringRuleList {
    /** Link to an answering rule resource Format: uri */
    public String uri;

    public CompanyAnsweringRuleList uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of company answering rules */
    public ListCompanyAnsweringRuleInfo[] records;

    public CompanyAnsweringRuleList records(ListCompanyAnsweringRuleInfo[] records) {
        this.records = records;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public CompanyAnsweringRuleList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public CompanyAnsweringRuleList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
