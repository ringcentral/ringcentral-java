package com.ringcentral.definitions;


public class CommWeeklyItemsResource
{
    /**
     */
    public CommWeeklyRangeResource[] monday;
    public CommWeeklyItemsResource monday(CommWeeklyRangeResource[] monday)
    {
        this.monday = monday;
        return this;
    }

    /**
     */
    public CommWeeklyRangeResource[] tuesday;
    public CommWeeklyItemsResource tuesday(CommWeeklyRangeResource[] tuesday)
    {
        this.tuesday = tuesday;
        return this;
    }

    /**
     */
    public CommWeeklyRangeResource[] wednesday;
    public CommWeeklyItemsResource wednesday(CommWeeklyRangeResource[] wednesday)
    {
        this.wednesday = wednesday;
        return this;
    }

    /**
     */
    public CommWeeklyRangeResource[] thursday;
    public CommWeeklyItemsResource thursday(CommWeeklyRangeResource[] thursday)
    {
        this.thursday = thursday;
        return this;
    }

    /**
     */
    public CommWeeklyRangeResource[] friday;
    public CommWeeklyItemsResource friday(CommWeeklyRangeResource[] friday)
    {
        this.friday = friday;
        return this;
    }

    /**
     */
    public CommWeeklyRangeResource[] saturday;
    public CommWeeklyItemsResource saturday(CommWeeklyRangeResource[] saturday)
    {
        this.saturday = saturday;
        return this;
    }

    /**
     */
    public CommWeeklyRangeResource[] sunday;
    public CommWeeklyItemsResource sunday(CommWeeklyRangeResource[] sunday)
    {
        this.sunday = sunday;
        return this;
    }
}