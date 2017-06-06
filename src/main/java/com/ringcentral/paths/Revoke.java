package com.ringcentral.paths;

import com.ringcentral.RequestParameters;

public class Revoke {
    public static class PostParameters implements RequestParameters {
        // Active access or refresh token to be revoked
        public String token;

        public PostParameters token(String token) {
            this.token = token;
            return this;
        }
    }
}
