package com.ringcentral.definitions;


public class RevokeTokenRequest {
    /**
     * Access or refresh token to be revoked (along with the entire OAuth session)
     * Required
     */
    public String token;
    /**
     * Client assertion type for the `client_secret_jwt` or `private_key_jwt` client authentication types,
     * as defined by [RFC-7523](https://datatracker.ietf.org/doc/html/rfc7523#section-2.2).
     * This parameter is mandatory if the client authentication is required and a client decided to use one of these authentication types
     * Enum: urn:ietf:params:oauth:client-assertion-type:jwt-bearer
     */
    public String client_assertion_type;
    /**
     * Client assertion (JWT) for the `client_secret_jwt` or `private_key_jwt` client authentication types,
     * as defined by [RFC-7523](https://datatracker.ietf.org/doc/html/rfc7523#section-2.2).
     * This parameter is mandatory if the client authentication is required and a client decided to use one of these authentication types
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
