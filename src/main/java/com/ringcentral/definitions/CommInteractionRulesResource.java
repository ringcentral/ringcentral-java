package com.ringcentral.definitions;

public class CommInteractionRulesResource {
    /** Required */
    public CommInteractionRuleResource[] records;

    public CommInteractionRulesResource records(CommInteractionRuleResource[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public CommInteractionRulesResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
