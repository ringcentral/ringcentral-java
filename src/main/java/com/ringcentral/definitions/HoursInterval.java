package com.ringcentral.definitions;


public class HoursInterval {
    /**
     * Time in format hh:mm
     * Required
     */
    public String from;
    /**
     * Time in format hh:mm
     * Required
     */
    public String to;

    public HoursInterval from(String from) {
        this.from = from;
        return this;
    }

    public HoursInterval to(String to) {
        this.to = to;
        return this;
    }
}
