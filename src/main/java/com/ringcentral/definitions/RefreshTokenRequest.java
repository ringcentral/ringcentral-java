package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Refresh Token" flow
 * with the `refresh_token` grant type
 */
public class RefreshTokenRequest {
    /**
     * Grant type
     * Required
     * Enum: refresh_token
     */
    public String grant_type;
    /**
     * For `refresh_token` grant type only. Previously issued refresh token.
     * Required
     */
    public String refresh_token;

    public RefreshTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public RefreshTokenRequest refresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
        return this;
    }
}
