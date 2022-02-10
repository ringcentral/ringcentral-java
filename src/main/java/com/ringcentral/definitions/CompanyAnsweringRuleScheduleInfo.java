package com.ringcentral.definitions;


/**
 * Schedule when an answering rule should be applied
 */
public class CompanyAnsweringRuleScheduleInfo {
    /**
     *
     */
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges;
    /**
     * Specific data ranges. If specified, weeklyRanges cannot be specified
     */
    public RangesInfo[] ranges;
    /**
     * Reference to Business Hours or After Hours schedule = [&#039;BusinessHours&#039;, &#039;AfterHours&#039;]
     * Enum: BusinessHours, AfterHours
     */
    public String ref;

    public CompanyAnsweringRuleScheduleInfo weeklyRanges(CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }

    public CompanyAnsweringRuleScheduleInfo ranges(RangesInfo[] ranges) {
        this.ranges = ranges;
        return this;
    }

    public CompanyAnsweringRuleScheduleInfo ref(String ref) {
        this.ref = ref;
        return this;
    }
}
