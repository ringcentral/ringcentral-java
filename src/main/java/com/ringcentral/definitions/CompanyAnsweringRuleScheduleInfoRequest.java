package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleScheduleInfoRequest
{
    // Weekly schedule. If specified, ranges cannot be specified
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges;
    public CompanyAnsweringRuleScheduleInfoRequest weeklyRanges(CompanyAnsweringRuleWeeklyScheduleInfoRequest weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
    // Specific data ranges. If specified, weeklyRanges cannot be specified
    public RangesInfo ranges;
    public CompanyAnsweringRuleScheduleInfoRequest ranges(RangesInfo ranges) {
        this.ranges = ranges;
        return this;
    }
    // Reference to Business Hours or After Hours schedule = ['BusinessHours', 'AfterHours']
    public String ref;
    public CompanyAnsweringRuleScheduleInfoRequest ref(String ref) {
        this.ref = ref;
        return this;
    }
}
