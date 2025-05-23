package com.ringcentral.definitions;


public class CommWeeklyItemsResource {
    /**
     *
     */
    public CommWeeklyRangeResource[] monday;
    /**
     *
     */
    public CommWeeklyRangeResource[] tuesday;
    /**
     *
     */
    public CommWeeklyRangeResource[] wednesday;
    /**
     *
     */
    public CommWeeklyRangeResource[] thursday;
    /**
     *
     */
    public CommWeeklyRangeResource[] friday;
    /**
     *
     */
    public CommWeeklyRangeResource[] saturday;
    /**
     *
     */
    public CommWeeklyRangeResource[] sunday;

    public CommWeeklyItemsResource monday(CommWeeklyRangeResource[] monday) {
        this.monday = monday;
        return this;
    }

    public CommWeeklyItemsResource tuesday(CommWeeklyRangeResource[] tuesday) {
        this.tuesday = tuesday;
        return this;
    }

    public CommWeeklyItemsResource wednesday(CommWeeklyRangeResource[] wednesday) {
        this.wednesday = wednesday;
        return this;
    }

    public CommWeeklyItemsResource thursday(CommWeeklyRangeResource[] thursday) {
        this.thursday = thursday;
        return this;
    }

    public CommWeeklyItemsResource friday(CommWeeklyRangeResource[] friday) {
        this.friday = friday;
        return this;
    }

    public CommWeeklyItemsResource saturday(CommWeeklyRangeResource[] saturday) {
        this.saturday = saturday;
        return this;
    }

    public CommWeeklyItemsResource sunday(CommWeeklyRangeResource[] sunday) {
        this.sunday = sunday;
        return this;
    }
}
