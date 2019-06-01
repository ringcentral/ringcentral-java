package com.ringcentral.definitions;


public class GetUserBusinessHoursResponse {
    /**
     * Canonical URI of a business-hours resource
     */
    public String uri;
    /**
     * Schedule when an answering rule is applied
     */
    public ScheduleInfoUserBusinessHours schedule;

    public GetUserBusinessHoursResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetUserBusinessHoursResponse schedule(ScheduleInfoUserBusinessHours schedule) {
        this.schedule = schedule;
        return this;
    }

}
