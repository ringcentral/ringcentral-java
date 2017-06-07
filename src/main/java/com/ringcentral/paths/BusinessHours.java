package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.BusinessHour_ScheduleInfo;

public class BusinessHours extends Path {
    public BusinessHours(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "business-hours", id);
    }

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
