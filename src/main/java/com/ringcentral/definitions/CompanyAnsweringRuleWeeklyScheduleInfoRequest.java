package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyAnsweringRuleWeeklyScheduleInfoRequest
{
    // Time interval for a particular day
    public CompanyAnsweringRuleTimeIntervalRequest[] monday;
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest monday(CompanyAnsweringRuleTimeIntervalRequest[] monday) {
        this.monday = monday;
        return this;
    }
    // Time interval for a particular day
    public CompanyAnsweringRuleTimeIntervalRequest[] tuesday;
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest tuesday(CompanyAnsweringRuleTimeIntervalRequest[] tuesday) {
        this.tuesday = tuesday;
        return this;
    }
    // Time interval for a particular day
    public CompanyAnsweringRuleTimeIntervalRequest[] wednesday;
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest wednesday(CompanyAnsweringRuleTimeIntervalRequest[] wednesday) {
        this.wednesday = wednesday;
        return this;
    }
    // Time interval for a particular day
    public CompanyAnsweringRuleTimeIntervalRequest[] thursday;
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest thursday(CompanyAnsweringRuleTimeIntervalRequest[] thursday) {
        this.thursday = thursday;
        return this;
    }
    // Time interval for a particular day
    public CompanyAnsweringRuleTimeIntervalRequest[] friday;
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest friday(CompanyAnsweringRuleTimeIntervalRequest[] friday) {
        this.friday = friday;
        return this;
    }
    // Time interval for a particular day
    public CompanyAnsweringRuleTimeIntervalRequest[] saturday;
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest saturday(CompanyAnsweringRuleTimeIntervalRequest[] saturday) {
        this.saturday = saturday;
        return this;
    }
    // Time interval for a particular day
    public CompanyAnsweringRuleTimeIntervalRequest[] sunday;
    public CompanyAnsweringRuleWeeklyScheduleInfoRequest sunday(CompanyAnsweringRuleTimeIntervalRequest[] sunday) {
        this.sunday = sunday;
        return this;
    }
}
