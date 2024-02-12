package com.ringcentral.definitions;


/**
 * Query parameters for operation revokeToken
 */
public class RevokeTokenParameters {
    /**
     * Access or refresh token to be revoked (along with the entire OAuth session)
     */
    public String token;

    public RevokeTokenParameters token(String token) {
        this.token = token;
        return this;
    }
}
