package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Refresh Token" flow
 * with the `refresh_token` grant type
 */
public class PublicGetTokenRequest {
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
    /**
     * The list of application permissions (OAuth scopes) requested.
     * By default, it includes all permissions configured on
     * the client application registration
     */
    public String scope;
    /**
     * The unique identifier of a client application instance. If not
     * specified, the derived or auto-generated value will be used
     */
    public String endpoint_id;
    /**
     * Access token lifetime in seconds
     * Maximum: 3600
     * Minimum: 600
     * Format: int32
     * Default: 3600
     */
    public Long access_token_ttl;
    /**
     * Refresh token lifetime in seconds
     * Maximum: 2592000
     * Format: int32
     * Default: 604800
     */
    public Long refresh_token_ttl;
    /**
     * Grant type
     * Required
     * Enum: authorization_code, urn:ietf:params:oauth:grant-type:jwt-bearer, partner_jwt, refresh_token
     */
    public String grant_type;
    /**
     * For `authorization_code` grant type only. User&#039;s authorization code
     * Required
     */
    public String code;
    /**
     * For `authorization_code` grant type only. This is a callback URI which determines where the response
     * is sent. The value of this parameter must exactly match one of
     * the URIs you have provided for your app upon registration
     * Format: uri
     */
    public String redirect_uri;
    /**
     * For `authorization_code` grant type only.
     * The code verifier as defined by  the PKCE specification -
     * [RFC-7636 &quot;Proof Key for Code Exchange by OAuth Public Clients&quot;](https://datatracker.ietf.org/doc/html/rfc7636)
     */
    public String code_verifier;
    /**
     * For `urn:ietf:params:oauth:grant-type:jwt-bearer` or `partner_jwt` grant types only.
     * Authorization grant assertion (JWT)
     * as defined by [RFC-7523](https://datatracker.ietf.org/doc/html/rfc7523#section-2.1).
     * Required
     */
    public String assertion;
    /**
     * For `refresh_token` grant type only. Previously issued refresh token.
     * Required
     */
    public String refresh_token;

    public PublicGetTokenRequest client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public PublicGetTokenRequest client_assertion_type(String client_assertion_type) {
        this.client_assertion_type = client_assertion_type;
        return this;
    }

    public PublicGetTokenRequest client_assertion(String client_assertion) {
        this.client_assertion = client_assertion;
        return this;
    }

    public PublicGetTokenRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public PublicGetTokenRequest endpoint_id(String endpoint_id) {
        this.endpoint_id = endpoint_id;
        return this;
    }

    public PublicGetTokenRequest access_token_ttl(Long access_token_ttl) {
        this.access_token_ttl = access_token_ttl;
        return this;
    }

    public PublicGetTokenRequest refresh_token_ttl(Long refresh_token_ttl) {
        this.refresh_token_ttl = refresh_token_ttl;
        return this;
    }

    public PublicGetTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public PublicGetTokenRequest code(String code) {
        this.code = code;
        return this;
    }

    public PublicGetTokenRequest redirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
        return this;
    }

    public PublicGetTokenRequest code_verifier(String code_verifier) {
        this.code_verifier = code_verifier;
        return this;
    }

    public PublicGetTokenRequest assertion(String assertion) {
        this.assertion = assertion;
        return this;
    }

    public PublicGetTokenRequest refresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
        return this;
    }
}
