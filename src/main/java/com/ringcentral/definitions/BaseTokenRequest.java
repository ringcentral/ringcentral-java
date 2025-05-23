package com.ringcentral.definitions;


public class BaseTokenRequest {
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

    public BaseTokenRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public BaseTokenRequest endpoint_id(String endpoint_id) {
        this.endpoint_id = endpoint_id;
        return this;
    }

    public BaseTokenRequest access_token_ttl(Long access_token_ttl) {
        this.access_token_ttl = access_token_ttl;
        return this;
    }

    public BaseTokenRequest refresh_token_ttl(Long refresh_token_ttl) {
        this.refresh_token_ttl = refresh_token_ttl;
        return this;
    }
}
