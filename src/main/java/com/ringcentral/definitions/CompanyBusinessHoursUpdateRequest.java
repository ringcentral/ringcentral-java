package com.ringcentral.definitions;


public class CompanyBusinessHoursUpdateRequest {
    /**
     * Schedule when an answering rule is applied
     */
    public CompanyBusinessHoursScheduleInfo schedule;

    public CompanyBusinessHoursUpdateRequest schedule(CompanyBusinessHoursScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

}
