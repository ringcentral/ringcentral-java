package com.ringcentral.paths;

import com.ringcentral.definitions.BusinessHour_ScheduleInfo;

public class BusinessHours {
    public static class GetResponse {
        // Canonical URI of a business-hours resource
        public String uri;
        // Schedule when an answering rule is applied
        public BusinessHour_ScheduleInfo schedule;

        public GetResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GetResponse schedule(BusinessHour_ScheduleInfo schedule) {
            this.schedule = schedule;
            return this;
        }
    }
}
