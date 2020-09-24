package com.ringcentral.definitions;


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
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String weeklyByDay;
    /**
     * Multiple values are supported, should be specified separated by comma
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String weeklyByDays;
    /**
     * The supported range is 1-31
     */
    public Long monthlyByDay;
    /**
     * Number of occurences
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

    public RecurrenceInfo count(Long count) {
        this.count = count;
        return this;
    }

    public RecurrenceInfo until(String until) {
        this.until = until;
        return this;
    }

}
