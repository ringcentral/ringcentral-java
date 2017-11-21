package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleScheduleInfo
{
    // Weekly schedule. If specified, ranges cannot be specified
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges;
    public CompanyAnsweringRuleScheduleInfo weeklyRanges(CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
    // Specific data ranges. If specified, weeklyRanges cannot be specified
    public RangesInfo ranges;
    public CompanyAnsweringRuleScheduleInfo ranges(RangesInfo ranges) {
        this.ranges = ranges;
        return this;
    }
    // Reference to Business Hours or After Hours schedule = ['BusinessHours', 'AfterHours']
    public String ref;
    public CompanyAnsweringRuleScheduleInfo ref(String ref) {
        this.ref = ref;
        return this;
    }
}
