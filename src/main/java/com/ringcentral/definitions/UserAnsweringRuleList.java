package com.ringcentral.definitions;


public class UserAnsweringRuleList {
    /**
     * Canonical URI of an answering rule list resource
     */
    public String uri;
    /**
     * List of answering rules
     */
    public UserAnsweringRuleListRecord[] records;
    /**
     *
     */
    public UserAnsweringRuleListPaging paging;
    /**
     *
     */
    public UserAnsweringRuleListNavigation navigation;

    public UserAnsweringRuleList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserAnsweringRuleList records(UserAnsweringRuleListRecord[] records) {
        this.records = records;
        return this;
    }

    public UserAnsweringRuleList paging(UserAnsweringRuleListPaging paging) {
        this.paging = paging;
        return this;
    }

    public UserAnsweringRuleList navigation(UserAnsweringRuleListNavigation navigation) {
        this.navigation = navigation;
        return this;
    }

}
