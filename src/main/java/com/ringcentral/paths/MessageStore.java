package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class MessageStore extends Path {
    public MessageStore (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "message-store", id);
    }
    public Content content(String id)
    {
        return new Content(restClient, pathSegment, id);
    }
    public Content content()
    {
        return new Content(restClient, pathSegment, null);
    }
    public static class ListParameters
    {
        // Specifies the availability status for the resulting messages. Default value is 'Alive'. Multiple values are accepted
        public String[] availability;
        public ListParameters availability(String[] availability) {
            this.availability = availability;
            return this;
        }
        // Specifies the conversation identifier for the resulting messages
        public Long conversationId;
        public ListParameters conversationId(Long conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        // The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
        public String dateFrom;
        public ListParameters dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }
        // The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;
        public ListParameters dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }
        // The direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
        public String[] direction;
        public ListParameters direction(String[] direction) {
            this.direction = direction;
            return this;
        }
        // If 'True', then the latest messages per every conversation ID are returned
        public Boolean distinctConversations;
        public ListParameters distinctConversations(Boolean distinctConversations) {
            this.distinctConversations = distinctConversations;
            return this;
        }
        // The type of the resulting messages. If not specified, all messages without message type filtering are returned. Multiple values are accepted
        public String[] messageType;
        public ListParameters messageType(String[] messageType) {
            this.messageType = messageType;
            return this;
        }
        // The read status for the resulting messages. Multiple values are accepted
        public String[] readStatus;
        public ListParameters readStatus(String[] readStatus) {
            this.readStatus = readStatus;
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
        // The phone number. If specified, messages are returned for this particular phone number only
        public String phoneNumber;
        public ListParameters phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
    public static class DeleteParameters
    {
        //
        public String[] conversationId;
        public DeleteParameters conversationId(String[] conversationId) {
            this.conversationId = conversationId;
            return this;
        }
    }
}
