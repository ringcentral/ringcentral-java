package com.ringcentral.paths;

import com.ringcentral.HttpModel;

public class Revoke {
    public static class PostParameters implements HttpModel {
        // Active access or refresh token to be revoked
        public String token;

        public PostParameters token(String token) {
            this.token = token;
            return this;
        }
    }
}
