package com.ringcentral.definitions;


public class TokenIntrospectionResponse {
    /**
     * Is presented token valid and active
     * Required
     * Example: true
     */
    public Boolean active;
    /**
     * List of permissions (space separated) granted to the application with this token
     * Example: AccountInfo CallLog ExtensionInfo Messages SMS
     */
    public String scope;
    /**
     * Identifier (key) of a client application
     */
    public String client_id;
    /**
     * Type of token. The only supported value is `bearer`
     * Example: bearer
     */
    public String token_type;
    /**
     * Timestamp indicating when this token will expire in seconds since January 1 1970 UTC
     * Format: int64
     * Example: 1706715293
     */
    public Long exp;
    /**
     * Timestamp indicating when this token was originally issued in seconds since January 1 1970 UTC
     * Format: int64
     * Example: 1706711693
     */
    public Long iat;
    /**
     * Subject of the token (extension ID or the owner)
     */
    public String sub;
    /**
     * RC account ID associated with the token
     */
    public String account_id;
    /**
     * OAuth session ID associated with the token
     */
    public String session_id;

    public TokenIntrospectionResponse active(Boolean active) {
        this.active = active;
        return this;
    }

    public TokenIntrospectionResponse scope(String scope) {
        this.scope = scope;
        return this;
    }

    public TokenIntrospectionResponse client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public TokenIntrospectionResponse token_type(String token_type) {
        this.token_type = token_type;
        return this;
    }

    public TokenIntrospectionResponse exp(Long exp) {
        this.exp = exp;
        return this;
    }

    public TokenIntrospectionResponse iat(Long iat) {
        this.iat = iat;
        return this;
    }

    public TokenIntrospectionResponse sub(String sub) {
        this.sub = sub;
        return this;
    }

    public TokenIntrospectionResponse account_id(String account_id) {
        this.account_id = account_id;
        return this;
    }

    public TokenIntrospectionResponse session_id(String session_id) {
        this.session_id = session_id;
        return this;
    }
}
