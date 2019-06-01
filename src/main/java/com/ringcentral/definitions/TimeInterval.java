package com.ringcentral.definitions;


public class TimeInterval {
    /**
     * Time in format hh:mm
     */
    public String from;
    /**
     * Time in format hh:mm
     */
    public String to;

    public TimeInterval from(String from) {
        this.from = from;
        return this;
    }

    public TimeInterval to(String to) {
        this.to = to;
        return this;
    }

}
