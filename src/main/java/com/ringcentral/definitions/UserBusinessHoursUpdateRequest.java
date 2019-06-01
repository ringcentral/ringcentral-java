package com.ringcentral.definitions;


public class UserBusinessHoursUpdateRequest {
    /**
     * Schedule when an answering rule is applied
     * Required
     */
    public UserBusinessHoursScheduleInfo schedule;

    public UserBusinessHoursUpdateRequest schedule(UserBusinessHoursScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

}
