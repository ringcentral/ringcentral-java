package com.ringcentral.definitions;


public class RecurrenceInfo {
    /**
     * Recurrence time frame
     * Enum: Daily, Weekly, Monthly
     */
    public String frequency;
    /**
     * Recurrence interval. The supported ranges are: 1-90 for `Daily`;
     * 1-12 for `Weekly`; 1-3 for `Monthly`
     * Format: int32
     */
    public Long interval;
    /**
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String[] weeklyByDays;
    /**
     * The supported range is 1-31
     * Format: int32
     */
    public Long monthlyByDay;
    /**
     * Supported together with `weeklyByDay`
     * Enum: Last, First, Second, Third, Fourth
     */
    public String monthlyByWeek;
    /**
     * This field is used only if you&#039;re scheduling a recurring meeting of type `3` to state a specific day in a week when the monthly meeting should recur; it works together with `MonthlyByWeek` field. The values are: 1 - Sunday; 2 - Monday; 3 - Tuesday; 4 - Wednesday; 5 - Thursday; 6 - Friday; 7- Saturday
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String monthlyByWeekDay;
    /**
     * Number of meeting occurrences
     * Format: int32
     */
    public Long count;
    /**
     * Meeting expiration date-time
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

    public RecurrenceInfo weeklyByDays(String[] weeklyByDays) {
        this.weeklyByDays = weeklyByDays;
        return this;
    }

    public RecurrenceInfo monthlyByDay(Long monthlyByDay) {
        this.monthlyByDay = monthlyByDay;
        return this;
    }

    public RecurrenceInfo monthlyByWeek(String monthlyByWeek) {
        this.monthlyByWeek = monthlyByWeek;
        return this;
    }

    public RecurrenceInfo monthlyByWeekDay(String monthlyByWeekDay) {
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
