package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.ReservePhoneNumber_Request_ReserveRecord;
import com.ringcentral.definitions.ReservePhoneNumber_Response_ReserveRecord;

public class Reserve extends Path {
    public Reserve(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "reserve", id);
    }

    public static class PostParameters {
        // Phone numbers to be reserved/un-reserved
        public ReservePhoneNumber_Request_ReserveRecord[] records;

        public PostParameters records(ReservePhoneNumber_Request_ReserveRecord[] records) {
            this.records = records;
            return this;
        }
    }

    public static class PostResponse {
        // Phone numbers to be reserved/un-reserved
        public ReservePhoneNumber_Response_ReserveRecord[] records;

        public PostResponse records(ReservePhoneNumber_Response_ReserveRecord[] records) {
            this.records = records;
            return this;
        }
    }
}
