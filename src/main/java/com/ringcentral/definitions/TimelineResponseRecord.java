package com.ringcentral.definitions;


public class TimelineResponseRecord
{
    /**
     * Grouping key
     * Required
     */
    public String key;
    public TimelineResponseRecord key(String key)
    {
        this.key = key;
        return this;
    }

    /**
     */
    public KeyInfo info;
    public TimelineResponseRecord info(KeyInfo info)
    {
        this.info = info;
        return this;
    }

    /**
     * List of requested call data time-value points
     */
    public TimelineResponsePoint[] points;
    public TimelineResponseRecord points(TimelineResponsePoint[] points)
    {
        this.points = points;
        return this;
    }
}