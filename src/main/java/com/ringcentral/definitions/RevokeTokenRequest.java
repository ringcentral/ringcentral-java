package com.ringcentral.definitions;


/**
 * Request body for operation revokeToken
 */
public class RevokeTokenRequest {
    /**
     *
     */
    public String client_assertion_type;
    /**
     *
     */
    public String client_assertion;
    /**
     * Active access or refresh token to be revoked
     * Required
     */
    public String token;

    public RevokeTokenRequest client_assertion_type(String client_assertion_type) {
        this.client_assertion_type = client_assertion_type;
        return this;
    }

    public RevokeTokenRequest client_assertion(String client_assertion) {
        this.client_assertion = client_assertion;
        return this;
    }

    public RevokeTokenRequest token(String token) {
        this.token = token;
        return this;
    }
}
