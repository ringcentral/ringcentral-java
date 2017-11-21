package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class CallLog extends Path {
    public CallLog (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "call-log", id);
    }
    public static class ListParameters
    {
        // Extension number of a user. If specified, returns call log for a particular extension only. Cannot be specified together with the phoneNumber filter
        public String extensionNumber;
        public ListParameters extensionNumber(String extensionNumber) {
            this.extensionNumber = extensionNumber;
            return this;
        }
        // If 'True' then calls from/to blocked numbers are returned. The default value is 'True'
        public Boolean showBlocked;
        public ListParameters showBlocked(Boolean showBlocked) {
            this.showBlocked = showBlocked;
            return this;
        }
        // Phone number of a caller/call recipient. If specified, returns all calls (both incoming and outcoming) with the mentioned phone number. Cannot be specified together with the extensionNumber filter
        public String phoneNumber;
        public ListParameters phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        // The direction for the result records. It is allowed to specify more than one direction. If not specified, both inbound and outbound records are returned. Multiple values are accepted
        public String[] direction;
        public ListParameters direction(String[] direction) {
            this.direction = direction;
            return this;
        }
        //
        public String sessionId;
        public ListParameters sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        // Call type of a record. It is allowed to specify more than one type. If not specified, all call types are returned. Multiple values are accepted
        public String[] type;
        public ListParameters type(String[] type) {
            this.type = type;
            return this;
        }
        // Call transport type. 'PSTN' specifies that a call leg is initiated from the PSTN network provider; 'VoIP' - from an RC phone. By default this filter is disabled
        public String[] transport;
        public ListParameters transport(String[] transport) {
            this.transport = transport;
            return this;
        }
        // The default value is 'Simple' for both account and extension call log
        public String[] view;
        public ListParameters view(String[] view) {
            this.view = view;
            return this;
        }
        // 'True' if only recorded calls have to be returned
        public Boolean withRecording;
        public ListParameters withRecording(Boolean withRecording) {
            this.withRecording = withRecording;
            return this;
        }
        // The end datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;
        public ListParameters dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }
        // The start datetime for resulting records in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
        public String dateFrom;
        public ListParameters dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;
        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
    }
    public static class DeleteParameters
    {
        // The end datetime for records deletion in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;
        public DeleteParameters dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }
        //
        public String phoneNumber;
        public DeleteParameters phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        //
        public String extensionNumber;
        public DeleteParameters extensionNumber(String extensionNumber) {
            this.extensionNumber = extensionNumber;
            return this;
        }
        //
        public String[] type;
        public DeleteParameters type(String[] type) {
            this.type = type;
            return this;
        }
        //
        public String[] direction;
        public DeleteParameters direction(String[] direction) {
            this.direction = direction;
            return this;
        }
        //
        public String dateFrom;
        public DeleteParameters dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }
    }
    public static class GetParameters
    {
        //
        public String view;
        public GetParameters view(String view) {
            this.view = view;
            return this;
        }
    }
}
