package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.SubscriptionInfo;
import com.ringcentral.definitions.Subscription_Request_DeliveryMode;

public class Subscription {
    public static class PostParameters implements RequestParameters {
        // Mandatory. Collection of URIs to API resources (see Event Types for details). For APNS transport type only message event filter is available
        public String[] eventFilters;
        // Notification delivery settings
        public Subscription_Request_DeliveryMode deliveryMode;

        public PostParameters eventFilters(String[] eventFilters) {
            this.eventFilters = eventFilters;
            return this;
        }

        public PostParameters deliveryMode(Subscription_Request_DeliveryMode deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }
    }

    public static class ListResponse implements RequestParameters {
        // Canonical URI of a subscription resource
        public String uri;
        // List of subscriptions for the current user and application
        public SubscriptionInfo[] records;

        public ListResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ListResponse records(SubscriptionInfo[] records) {
            this.records = records;
            return this;
        }
    }

    public static class PutParameters implements RequestParameters {
        // Collection of URIs to API resources (see Event Types). Mandatory field
        public String[] eventFilters;

        public PutParameters eventFilters(String[] eventFilters) {
            this.eventFilters = eventFilters;
            return this;
        }
    }
}
