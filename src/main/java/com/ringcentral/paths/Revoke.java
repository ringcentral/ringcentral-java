package com.ringcentral.paths;

public class Revoke {
    static
    public class PostParameters {
        // Active access or refresh token to be revoked
        public String token;

        public PostParameters token(String token) {
            this.token = token;
            return this;
        }
    }
}
