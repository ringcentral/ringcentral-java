package com.ringcentral.definitions;


public class TimelineResponseRecord {
    /**
     * Grouping key
     * Required
     */
    public String key;
    /**
     *
     */
    public KeyInfo info;
    /**
     * List of requested call data time-value points
     */
    public TimelineResponsePoint[] points;

    public TimelineResponseRecord key(String key) {
        this.key = key;
        return this;
    }

    public TimelineResponseRecord info(KeyInfo info) {
        this.info = info;
        return this;
    }

    public TimelineResponseRecord points(TimelineResponsePoint[] points) {
        this.points = points;
        return this;
    }
}
