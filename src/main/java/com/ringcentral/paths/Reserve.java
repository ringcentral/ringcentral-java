package com.ringcentral.paths;

import com.ringcentral.definitions.ReservePhoneNumber_Request_ReserveRecord;
import com.ringcentral.definitions.ReservePhoneNumber_Response_ReserveRecord;

public class Reserve {
    static
    public class PostParameters {
        // Phone numbers to be reserved/un-reserved
        public ReservePhoneNumber_Request_ReserveRecord[] records;

        public PostParameters records(ReservePhoneNumber_Request_ReserveRecord[] records) {
            this.records = records;
            return this;
        }
    }

    static
    public class PostResponse {
        // Phone numbers to be reserved/un-reserved
        public ReservePhoneNumber_Response_ReserveRecord[] records;

        public PostResponse records(ReservePhoneNumber_Response_ReserveRecord[] records) {
            this.records = records;
            return this;
        }
    }
}
