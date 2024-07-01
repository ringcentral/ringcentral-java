package com.ringcentral.definitions;


public class TokenInfo {
    /**
     * OAuth access token to pass to subsequent API requests
     * Required
     * Example: U1BCMDFUMDRKV1MwMXxzLFSvXdw5PHMsVLEn_MrtcyxUsw
     */
    public String access_token;
    /**
     * Access token TTL (time-to-live) in seconds
     * Required
     * Format: int32
     * Example: 7199
     */
    public Long expires_in;
    /**
     * OAuth refresh token (if issued)
     * Example: U1BCMDFUMDRKV1MwMXxzLFL4ec6A0XMsUv9wLriecyxS_w
     */
    public String refresh_token;
    /**
     * Refresh token TTL (time-to-live) in seconds
     * Format: int32
     * Example: 604799
     */
    public Long refresh_token_expires_in;
    /**
     * The list of space separated application permissions (OAuth scopes)
     * Required
     * Example: AccountInfo CallLog ExtensionInfo Messages SMS
     */
    public String scope;
    /**
     * Type of the token. The only supported value is `bearer`. This value should be used when specifying access token in `Authorization` header of subsequent API requests
     * Required
     * Example: bearer
     * Enum: bearer
     */
    public String token_type;
    /**
     * Token owner&#039;s identifier. Contains RingCentral user (extension) ID
     * Example: 256440016
     */
    public String owner_id;
    /**
     * Client application instance identifier that matches the value provided by the client,
     * or generated by the server if a client has not provided this value
     * Example: 8zXq6oaLT7WvwWITlGiA1A
     */
    public String endpoint_id;
    /**
     * OpenID Connect ID token (if OpenID Connect flow was activated during authorization)
     */
    public String id_token;
    /**
     * Remaining time in seconds until session expiration due to absolute timeout.
     * Returned only if absolute session timeout is enforced
     * Format: int32
     */
    public Long session_expires_in;
    /**
     * Absolute value of session expiration time in ISO date formatted string.
     * Returned only if absolute session timeout is enforced
     * Format: date-time
     * Example: 2023-04-01T12:00:01Z
     */
    public String session_expiration_time;
    /**
     * OAuth session ID
     * Required
     */
    public String session_id;
    /**
     * Nominal value of session idle timeout in seconds.
     * Returned only if idle session timeout is enforced
     * Format: int32
     */
    public Long session_idle_timeout;

    public TokenInfo access_token(String access_token) {
        this.access_token = access_token;
        return this;
    }

    public TokenInfo expires_in(Long expires_in) {
        this.expires_in = expires_in;
        return this;
    }

    public TokenInfo refresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
        return this;
    }

    public TokenInfo refresh_token_expires_in(Long refresh_token_expires_in) {
        this.refresh_token_expires_in = refresh_token_expires_in;
        return this;
    }

    public TokenInfo scope(String scope) {
        this.scope = scope;
        return this;
    }

    public TokenInfo token_type(String token_type) {
        this.token_type = token_type;
        return this;
    }

    public TokenInfo owner_id(String owner_id) {
        this.owner_id = owner_id;
        return this;
    }

    public TokenInfo endpoint_id(String endpoint_id) {
        this.endpoint_id = endpoint_id;
        return this;
    }

    public TokenInfo id_token(String id_token) {
        this.id_token = id_token;
        return this;
    }

    public TokenInfo session_expires_in(Long session_expires_in) {
        this.session_expires_in = session_expires_in;
        return this;
    }

    public TokenInfo session_expiration_time(String session_expiration_time) {
        this.session_expiration_time = session_expiration_time;
        return this;
    }

    public TokenInfo session_id(String session_id) {
        this.session_id = session_id;
        return this;
    }

    public TokenInfo session_idle_timeout(Long session_idle_timeout) {
        this.session_idle_timeout = session_idle_timeout;
        return this;
    }
}
