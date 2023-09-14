package com.ringcentral.definitions;


public class UserAnsweringRuleList {
    /**
     * Canonical URI of an answering rule list resource
     * Format: uri
     * Example: https://platform.ringcentral.com/restapi/v1.0/account/240913004/extension/240972004/answering-rule?page=1&amp;perPage=100
     */
    public String uri;
    /**
     * List of answering rules
     */
    public AnsweringRuleInfo[] records;
    /**
     *
     */
    public EnumeratedPagingModel paging;
    /**
     *
     */
    public PageNavigationModel navigation;

    public UserAnsweringRuleList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserAnsweringRuleList records(AnsweringRuleInfo[] records) {
        this.records = records;
        return this;
    }

    public UserAnsweringRuleList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    public UserAnsweringRuleList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
