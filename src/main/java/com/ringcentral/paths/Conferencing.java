package com.ringcentral.paths;

import com.ringcentral.definitions.Conferencing_Request_PhoneNumber;

public class Conferencing {
    public static class GetParameters {
        // Internal identifier of a country. If not specified, the response is returned for the brand country
        public String countryId;

        public GetParameters countryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
    }

    public static class PutParameters {
        // Multiple dial-in phone numbers to connect to audio conference service, relevant for user's brand. Each number is given with the country and location information, in order to let the user choose the less expensive way to connect to a conference. The first number in the list is the primary conference number, that is default and domestic
        public Conferencing_Request_PhoneNumber[] phoneNumbers;
        // Determines if host user allows conference participants to join before the host
        public Boolean allowJoinBeforeHost;

        public PutParameters phoneNumbers(Conferencing_Request_PhoneNumber[] phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public PutParameters allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
            this.allowJoinBeforeHost = allowJoinBeforeHost;
            return this;
        }
    }
}
