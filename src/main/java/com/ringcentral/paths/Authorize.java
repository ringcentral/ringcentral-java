package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Authorize {
    private PathSegment pathSegment;

    public Authorize(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "authorize", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class PostParameters {
        // Must be set to code
        public String response_type;
        // Required. Enter your application key (Production or Sandbox) here
        public String client_id;
        // Required. This is a callback URI which determines where the response will be sent to. The value of this parameter must exactly match one of the URIs you have provided for your app upon registration. This URI can be HTTP/HTTPS address for web applications or custom scheme URI for mobile or desktop applications.
        public String redirect_uri;
        // Optional, recommended. An opaque value used by the client to maintain state between the request and callback. The authorization server includes this value when redirecting the user-agent back to the client. The parameter should be used for preventing cross-site request forgery
        public String state;

        public PostParameters response_type(String response_type) {
            this.response_type = response_type;
            return this;
        }

        public PostParameters client_id(String client_id) {
            this.client_id = client_id;
            return this;
        }

        public PostParameters redirect_uri(String redirect_uri) {
            this.redirect_uri = redirect_uri;
            return this;
        }

        public PostParameters state(String state) {
            this.state = state;
            return this;
        }
    }

    public static class PostResponse {
        // The authorization code returned for your application
        public String code;
        // The remaining lifetime of the authorization code
        public Long expires_in;
        // This parameter will be included in response if it was specified in the client authorization request. The value will be copied from the one received from the client
        public String state;

        public PostResponse code(String code) {
            this.code = code;
            return this;
        }

        public PostResponse expires_in(Long expires_in) {
            this.expires_in = expires_in;
            return this;
        }

        public PostResponse state(String state) {
            this.state = state;
            return this;
        }
    }
}
