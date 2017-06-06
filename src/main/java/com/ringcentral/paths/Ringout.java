package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.RingOut_Request_CountryInfo;
import com.ringcentral.definitions.RingOut_Request_From;
import com.ringcentral.definitions.RingOut_Request_To;

public class Ringout {
    public static class PostParameters implements RequestParameters {
        // Phone number of the caller. This number corresponds to the 1st leg of the RingOut call. This number can be one of user's configured forwarding numbers or arbitrary number
        public RingOut_Request_From from;
        // Phone number of the called party. This number corresponds to the 2nd leg of the RingOut call
        public RingOut_Request_To to;
        // The number which will be displayed to the called party
        public RingOut_Request_To callerId;
        // The audio prompt that the calling party hears when the call is connected
        public Boolean playPrompt;
        // Optional. Dialing plan country data. If not specified, then extension home country is applied by default
        public RingOut_Request_CountryInfo country;

        public PostParameters from(RingOut_Request_From from) {
            this.from = from;
            return this;
        }

        public PostParameters to(RingOut_Request_To to) {
            this.to = to;
            return this;
        }

        public PostParameters callerId(RingOut_Request_To callerId) {
            this.callerId = callerId;
            return this;
        }

        public PostParameters playPrompt(Boolean playPrompt) {
            this.playPrompt = playPrompt;
            return this;
        }

        public PostParameters country(RingOut_Request_CountryInfo country) {
            this.country = country;
            return this;
        }
    }
}
