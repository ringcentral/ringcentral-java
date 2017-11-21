package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleList
{
    // Link to an answering rule resource
    public String uri;
    public CompanyAnsweringRuleList uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of company answering rules
    public ListCompanyAnsweringRuleInfo[] records;
    public CompanyAnsweringRuleList records(ListCompanyAnsweringRuleInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public CompanyAnsweringRuleList paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public CompanyAnsweringRuleList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
