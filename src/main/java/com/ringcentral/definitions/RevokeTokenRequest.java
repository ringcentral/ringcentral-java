package com.ringcentral.definitions;


public class RevokeTokenRequest {
    /**
     * Access or refresh token to be revoked (along with the entire OAuth session)
     * Required
     */
    public String token;
    /**
     * Client assertion type
     */
    public String client_assertion_type;
    /**
     * Client assertion
     */
    public String client_assertion;

    public RevokeTokenRequest token(String token) {
        this.token = token;
        return this;
    }

    public RevokeTokenRequest client_assertion_type(String client_assertion_type) {
        this.client_assertion_type = client_assertion_type;
        return this;
    }

    public RevokeTokenRequest client_assertion(String client_assertion) {
        this.client_assertion = client_assertion;
        return this;
    }
}
