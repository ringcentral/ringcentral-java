package com.ringcentral.definitions;


public class CommInteractionRulesResource {
    /**
     * Required
     */
    public CommInteractionRuleResource[] records;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CommInteractionRulesResource records(CommInteractionRuleResource[] records) {
        this.records = records;
        return this;
    }

    public CommInteractionRulesResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
