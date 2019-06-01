package com.ringcentral.definitions;


public class CompanyAnsweringRuleWeeklyScheduleInfoRequest {
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] monday;
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] tuesday;
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] wednesday;
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] thursday;
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] friday;
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] saturday;
    /**
     * Time interval for a particular day
     */
    public CompanyAnsweringRuleTimeIntervalRequest[] sunday;

    public CompanyAnsweringRuleWeeklyScheduleInfoRequest monday(CompanyAnsweringRuleTimeIntervalRequest[] monday) {
        this.monday = monday;
        return this;
    }

    public CompanyAnsweringRuleWeeklyScheduleInfoRequest tuesday(CompanyAnsweringRuleTimeIntervalRequest[] tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public CompanyAnsweringRuleWeeklyScheduleInfoRequest wednesday(CompanyAnsweringRuleTimeIntervalRequest[] wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    public CompanyAnsweringRuleWeeklyScheduleInfoRequest thursday(CompanyAnsweringRuleTimeIntervalRequest[] thursday) {
        this.thursday = thursday;
        return this;
    }

    public CompanyAnsweringRuleWeeklyScheduleInfoRequest friday(CompanyAnsweringRuleTimeIntervalRequest[] friday) {
        this.friday = friday;
        return this;
    }

    public CompanyAnsweringRuleWeeklyScheduleInfoRequest saturday(CompanyAnsweringRuleTimeIntervalRequest[] saturday) {
        this.saturday = saturday;
        return this;
    }

    public CompanyAnsweringRuleWeeklyScheduleInfoRequest sunday(CompanyAnsweringRuleTimeIntervalRequest[] sunday) {
        this.sunday = sunday;
        return this;
    }

}
