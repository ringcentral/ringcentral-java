package com.ringcentral.definitions;


// Meeting recurrence information
public class RecurrenceInfo {
    /**
     * Recurrence time frame
     * Enum: Daily, Weekly, Monthly
     */
    public String frequency;
    /**
     * Reccurence interval. The supported ranges are: 1-90 for `Daily`; 1-12 for `Weekly`; 1-3 for `Monthly`
     */
    public Long interval;
    /**
     * Supported together with `weeklyByDay`
     * Enum: Last, First, Second, Third, Fourth
     */
    public String monthlyByWeek;
    /**
     * This field is used only if you're scheduling a recurring meeting of type `3` to state which day in a month the meeting should recur. The value range is 1 - 31. For instance, if the meeting should recur each month on 23rd, provide `23` as the value of this field and `1` as the value of the recurrence `interval` field. And if the meeting should recur every three months, on 23rd of the month, change the value of the recurrence `interval` field to `3`.
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String weeklyByDay;
    /**
     * This field is used only if you're scheduling a recurring meeting of type `2` to state which day(s) of the week the meeting should recur. The values are: 1 - Sunday; 2 - Monday; 3- Tuesday; 4 - Wednesday; 5 - Thursday; 6 - Friday; 7 - Saturday. Multiple values are supported, should be specified separated by comma
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String weeklyByDays;
    /**
     * The supported range is 1-31
     */
    public Long monthlyByDay;
    /**
     * This field is used only if you're scheduling a recurring meeting of type `3` to state a specific day in a week when the monthly meeting should recur; it works together with `MonthlyByWeek` field. The values are: 1 - Sunday; 2 - Monday; 3 - Tuesday; 4 - Wednesday; 5 - Thursday; 6 - Friday; 7- Saturday
     */
    public Long monthlyByWeekDay;
    /**
     * Number of meeting occurrences
     */
    public Long count;
    /**
     * Meeting expiration datetime
     */
    public String until;

    public RecurrenceInfo frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    public RecurrenceInfo interval(Long interval) {
        this.interval = interval;
        return this;
    }

    public RecurrenceInfo monthlyByWeek(String monthlyByWeek) {
        this.monthlyByWeek = monthlyByWeek;
        return this;
    }

    public RecurrenceInfo weeklyByDay(String weeklyByDay) {
        this.weeklyByDay = weeklyByDay;
        return this;
    }

    public RecurrenceInfo weeklyByDays(String weeklyByDays) {
        this.weeklyByDays = weeklyByDays;
        return this;
    }

    public RecurrenceInfo monthlyByDay(Long monthlyByDay) {
        this.monthlyByDay = monthlyByDay;
        return this;
    }

    public RecurrenceInfo monthlyByWeekDay(Long monthlyByWeekDay) {
        this.monthlyByWeekDay = monthlyByWeekDay;
        return this;
    }

    public RecurrenceInfo count(Long count) {
        this.count = count;
        return this;
    }

    public RecurrenceInfo until(String until) {
        this.until = until;
        return this;
    }
}
