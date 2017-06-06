package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.CallLogRecord;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class CallLog {
    public static class ListParameters implements RequestParameters {
        // Extension number of a user. If specified, returns call log for a particular extension only. Cannot be specified together with the phoneNumber filter
        public String extensionNumber;
        // Phone number of a caller/call recipient. If specified, returns all calls (both incoming and outcoming) with the mentioned phone number. Cannot be specified together with the extensionNumber filter
        public String phoneNumber;
        // The direction for the result records. It is allowed to specify more than one direction. If not specified, both inbound and outbound records are returned. Multiple values are accepted
        public String direction;
        // Call type of a record. It is allowed to specify more than one type. If not specified, all call types are returned. Multiple values are accepted
        public String type;
        // The default value is 'Simple' for both account and extension call log
        public String view;
        // 'True' if only recorded calls have to be returned
        public Boolean withRecording;
        // The start datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
        public String dateFrom;
        // The end datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;
        // Indicates the page number to retrieve. Only positive number values are allowed. The default value is '1'
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default.
        public Long perPage;

        public ListParameters extensionNumber(String extensionNumber) {
            this.extensionNumber = extensionNumber;
            return this;
        }

        public ListParameters phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ListParameters direction(String direction) {
            this.direction = direction;
            return this;
        }

        public ListParameters type(String type) {
            this.type = type;
            return this;
        }

        public ListParameters view(String view) {
            this.view = view;
            return this;
        }

        public ListParameters withRecording(Boolean withRecording) {
            this.withRecording = withRecording;
            return this;
        }

        public ListParameters dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }

        public ListParameters dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }

        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }

        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
    }

    public static class ListResponse implements RequestParameters {
        // Canonical URI
        public String uri;
        // List of call log records
        public CallLogRecord[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ListResponse records(CallLogRecord[] records) {
            this.records = records;
            return this;
        }

        public ListResponse navigation(NavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }

        public ListResponse paging(PagingInfo paging) {
            this.paging = paging;
            return this;
        }
    }

    public static class DeleteParameters implements RequestParameters {
        // The end datetime for records deletion in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;

        public DeleteParameters dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }
    }
}
