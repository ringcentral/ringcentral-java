package com.ringcentral.definitions;


public class UserBusinessHoursUpdateRequest {
    /**
     * Required
     */
    public UserBusinessHoursScheduleInfo schedule;

    public UserBusinessHoursUpdateRequest schedule(UserBusinessHoursScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
}
