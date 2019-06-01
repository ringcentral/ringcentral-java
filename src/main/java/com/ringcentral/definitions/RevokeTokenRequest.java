package com.ringcentral.definitions;


public class RevokeTokenRequest {
    /**
     * Active access or refresh token to be revoked
     */
    public String token;

    public RevokeTokenRequest token(String token) {
        this.token = token;
        return this;
    }

}
