package com.ringcentral.definitions;


public class CompanyBusinessHours {
    /**
     * Canonical URI of a business-hours resource
     */
    public String uri;
    /**
     * Schedule when an answering rule is applied
     */
    public CompanyBusinessHoursScheduleInfo schedule;

    public CompanyBusinessHours uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CompanyBusinessHours schedule(CompanyBusinessHoursScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

}
