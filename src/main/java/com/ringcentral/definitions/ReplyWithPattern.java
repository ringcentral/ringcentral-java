package com.ringcentral.definitions;


public class ReplyWithPattern {
    /**
     * Predefined reply pattern name.
     * Example: OnMyWay
     * Enum: WillCallYouBack, CallMeBack, OnMyWay, OnTheOtherLine, WillCallYouBackLater, CallMeBackLater, InAMeeting, OnTheOtherLineNoCall
     */
    public String pattern;
    /**
     * Number of time units. Applicable only to WillCallYouBack, CallMeBack patterns.
     * Example: 5
     */
    public Long time;
    /**
     * Time unit name.
     * Example: Minute
     * Enum: Minute, Hour, Day
     */
    public String timeUnit;

    public ReplyWithPattern pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    public ReplyWithPattern time(Long time) {
        this.time = time;
        return this;
    }

    public ReplyWithPattern timeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
}
