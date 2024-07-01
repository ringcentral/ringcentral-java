package com.ringcentral.definitions;


public class BaseTokenRequest {
    /**
     * Grant type
     * Required
     * Enum: authorization_code, password, refresh_token, client_credentials, urn:ietf:params:oauth:grant-type:jwt-bearer, urn:ietf:params:oauth:grant-type:device_code, device_certificate, partner_jwt, guest, personal_jwt, otp, ivr_pin
     */
    public String grant_type;
    /**
     * The list of application permissions (OAuth scopes) requested.
     * By default, it includes all permissions configured on
     * the client application registration
     */
    public String scope;
    /**
     * The registered identifier of a client application.
     * Used to identify a client ONLY if the client authentication is not required and
     * corresponding credentials are not provided with this request
     * Example: AZwEVwGEcfGet2PCouA7K6
     */
    public String client_id;
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
     * Maximum: 604800
     * Format: int32
     * Default: 604800
     */
    public Long refresh_token_ttl;

    public BaseTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public BaseTokenRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public BaseTokenRequest client_id(String client_id) {
        this.client_id = client_id;
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
