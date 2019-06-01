package com.ringcentral.definitions;


public class WeeklyScheduleInfo {
    /**
     * Time intervals for a particular day
     */
    public TimeInterval[] monday;
    /**
     * Time intervals for a particular day
     */
    public TimeInterval[] tuesday;
    /**
     * Time intervals for a particular day
     */
    public TimeInterval[] wednesday;
    /**
     * Time intervals for a particular day
     */
    public TimeInterval[] thursday;
    /**
     * Time intervals for a particular day
     */
    public TimeInterval[] friday;
    /**
     * Time intervals for a particular day
     */
    public TimeInterval[] saturday;
    /**
     * Time intervals for a particular day
     */
    public TimeInterval[] sunday;

    public WeeklyScheduleInfo monday(TimeInterval[] monday) {
        this.monday = monday;
        return this;
    }

    public WeeklyScheduleInfo tuesday(TimeInterval[] tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public WeeklyScheduleInfo wednesday(TimeInterval[] wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    public WeeklyScheduleInfo thursday(TimeInterval[] thursday) {
        this.thursday = thursday;
        return this;
    }

    public WeeklyScheduleInfo friday(TimeInterval[] friday) {
        this.friday = friday;
        return this;
    }

    public WeeklyScheduleInfo saturday(TimeInterval[] saturday) {
        this.saturday = saturday;
        return this;
    }

    public WeeklyScheduleInfo sunday(TimeInterval[] sunday) {
        this.sunday = sunday;
        return this;
    }

}
