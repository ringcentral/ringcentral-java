package com.ringcentral.definitions;


public class CompanyAnsweringRuleScheduleInfoRequest {
    /**
     * Weekly schedule. If specified, ranges cannot be specified
     */
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges;
    /**
     * Specific data ranges. If specified, weeklyRanges cannot be specified
     */
    public RangesInfo[] ranges;
    /**
     * Reference to Business Hours or After Hours schedule
     * Enum: BusinessHours, AfterHours
     */
    public String ref;

    public CompanyAnsweringRuleScheduleInfoRequest weeklyRanges(CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }

    public CompanyAnsweringRuleScheduleInfoRequest ranges(RangesInfo[] ranges) {
        this.ranges = ranges;
        return this;
    }

    public CompanyAnsweringRuleScheduleInfoRequest ref(String ref) {
        this.ref = ref;
        return this;
    }

}
