package com.ringcentral.definitions;


public class CompanyAnsweringRuleScheduleInfo {
    /**
     * Weekly schedule. If specified, ranges cannot be specified
     */
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges;
    /**
     * Specific data ranges. If specified, weeklyRanges cannot be specified
     */
    public RangesInfo[] ranges;
    /**
     * Reference to Business Hours or After Hours schedule = ['BusinessHours', 'AfterHours']
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
