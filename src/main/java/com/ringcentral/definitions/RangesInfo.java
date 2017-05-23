package com.ringcentral.definitions;

public class RangesInfo {
    // Date and time in format YYYY-MM-DD hh:mm
    public String from;
    // Date and time in format YYYY-MM-DD hh:mm
    public String to;

    public RangesInfo from(String from) {
        this.from = from;
        return this;
    }

    public RangesInfo to(String to) {
        this.to = to;
        return this;
    }
}
