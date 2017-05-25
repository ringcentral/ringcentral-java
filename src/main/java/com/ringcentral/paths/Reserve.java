package com.ringcentral.paths;

import com.ringcentral.HttpModel;
import com.ringcentral.definitions.ReservePhoneNumber_Request_ReserveRecord;
import com.ringcentral.definitions.ReservePhoneNumber_Response_ReserveRecord;

public class Reserve {
    public static class PostParameters implements HttpModel {
        // Phone numbers to be reserved/un-reserved
        public ReservePhoneNumber_Request_ReserveRecord[] records;

        public PostParameters records(ReservePhoneNumber_Request_ReserveRecord[] records) {
            this.records = records;
            return this;
        }
    }

    public static class PostResponse implements HttpModel {
        // Phone numbers to be reserved/un-reserved
        public ReservePhoneNumber_Response_ReserveRecord[] records;

        public PostResponse records(ReservePhoneNumber_Response_ReserveRecord[] records) {
            this.records = records;
            return this;
        }
    }
}
