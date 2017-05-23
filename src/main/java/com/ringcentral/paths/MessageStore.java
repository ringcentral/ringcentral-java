package com.ringcentral.paths;

import com.ringcentral.definitions.MessageInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class MessageStore {
    static
    public class ListParameters {
        // Specifies the availability status for the resulting messages. Default value is 'Alive'. Multiple values are accepted
        public String availability;
        // Specifies the conversation identifier for the resulting messages
        public Long conversationId;
        // The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
        public String dateFrom;
        // The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;
        // The direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
        public String direction;
        // If 'True', then the latest messages per every conversation ID are returned
        public Boolean distinctConversations;
        // The type of the resulting messages. If not specified, all messages without message type filtering are returned. Multiple values are accepted
        public String messageType;
        // The read status for the resulting messages. Multiple values are accepted
        public String readStatus;
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default
        public Long perPage;
        // The phone number. If specified, messages are returned for this particular phone number only
        public String phoneNumber;

        public ListParameters availability(String availability) {
            this.availability = availability;
            return this;
        }

        public ListParameters conversationId(Long conversationId) {
            this.conversationId = conversationId;
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

        public ListParameters direction(String direction) {
            this.direction = direction;
            return this;
        }

        public ListParameters distinctConversations(Boolean distinctConversations) {
            this.distinctConversations = distinctConversations;
            return this;
        }

        public ListParameters messageType(String messageType) {
            this.messageType = messageType;
            return this;
        }

        public ListParameters readStatus(String readStatus) {
            this.readStatus = readStatus;
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

        public ListParameters phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }

    static
    public class ListResponse {
        // List of records with message information
        public MessageInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(MessageInfo[] records) {
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

    static
    public class DeleteParameters {
        // If the value is 'True', then the message is purged immediately with all the attachments. The default value is 'False'
        public Boolean purge;
        // Internal identifier of a message thread
        public Long conversationId;

        public DeleteParameters purge(Boolean purge) {
            this.purge = purge;
            return this;
        }

        public DeleteParameters conversationId(Long conversationId) {
            this.conversationId = conversationId;
            return this;
        }
    }

    static
    public class PutParameters {
        // Read status of a message to be changed. Multiple values are accepted
        public String readStatus;

        public PutParameters readStatus(String readStatus) {
            this.readStatus = readStatus;
            return this;
        }
    }
}
