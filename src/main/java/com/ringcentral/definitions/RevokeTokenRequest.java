package com.ringcentral.definitions;


public class RevokeTokenRequest {
    /**
     * Access or refresh token to be revoked (along with the entire OAuth session).
     * Required, unless it is passed via the `token` query parameter
     */
    public String token;
    /**
     * The registered identifier of a client application.
     * Used to identify a client ONLY if the client authentication is not required and
     * corresponding credentials are not provided with this request
     * Example: AZwEVwGEcfGet2PCouA7K6
     */
    public String client_id;
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

    public RevokeTokenRequest client_id(String client_id) {
        this.client_id = client_id;
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
