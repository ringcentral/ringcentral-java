package com.ringcentral.definitions;


public class TimelineData {
    /**
     * Required
     */
    public String key;
    /**
     *
     */
    public TimelineDataPoint[] points;

    public TimelineData key(String key) {
        this.key = key;
        return this;
    }

    public TimelineData points(TimelineDataPoint[] points) {
        this.points = points;
        return this;
    }
}
