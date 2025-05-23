package com.ringcentral.definitions;


/**
 * Query parameters for operation revokeToken
 */
public class RevokeTokenParameters {
    /**
     * Access or refresh token to be revoked (along with the entire OAuth session).
     * <p>
     * Note: it is recommended to pass token via request body attribute
     */
    public String token;

    public RevokeTokenParameters token(String token) {
        this.token = token;
        return this;
    }
}
