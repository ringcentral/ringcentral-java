package com.ringcentral.paths;

import com.ringcentral.definitions.MessageInfo;
import com.ringcentral.definitions.SyncInfo;

public class MessageSync {
    static
    public class ListParameters {
        // Conversation identifier for the resulting messages. Meaningful for SMS and Pager messages only.
        public Long conversationId;
        // The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
        public String dateFrom;
        // The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;
        // Direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
        public String direction;
        // If 'True', then the latest messages per every conversation ID are returned
        public Boolean distinctConversations;
        // Type for the resulting messages. If not specified, all types of messages are returned. Multiple values are accepted
        public String messageType;
        // Limits the number of records to be returned (works in combination with dateFrom and dateTo if specified)
        public Long recordCount;
        // Value of syncToken property of last sync request response
        public String syncToken;
        // Type of message synchronization
        public String syncType;

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

        public ListParameters recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        public ListParameters syncToken(String syncToken) {
            this.syncToken = syncToken;
            return this;
        }

        public ListParameters syncType(String syncType) {
            this.syncType = syncType;
            return this;
        }
    }

    static
    public class ListResponse {
        // List of message records with synchronization information
        public MessageInfo[] records;
        // Sync type, token and time
        public SyncInfo syncInfo;

        public ListResponse records(MessageInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse syncInfo(SyncInfo syncInfo) {
            this.syncInfo = syncInfo;
            return this;
        }
    }
}
