package com.ringcentral.definitions;


/**
 * State-based rule information
 */
public class CommStateBasedRulesResource {
    /**
     * Required
     */
    public CommStateBasedRuleResource[] records;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CommStateBasedRulesResource records(CommStateBasedRuleResource[] records) {
        this.records = records;
        return this;
    }

    public CommStateBasedRulesResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
