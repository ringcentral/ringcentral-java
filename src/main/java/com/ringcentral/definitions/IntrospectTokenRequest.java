package com.ringcentral.definitions;


/**
 * Request body for operation introspectToken
 */
public class IntrospectTokenRequest {
    /**
     * OAuth token
     */
    public String token;
    /**
     *
     */
    public String scope;

    public IntrospectTokenRequest token(String token) {
        this.token = token;
        return this;
    }

    public IntrospectTokenRequest scope(String scope) {
        this.scope = scope;
        return this;
    }
}
