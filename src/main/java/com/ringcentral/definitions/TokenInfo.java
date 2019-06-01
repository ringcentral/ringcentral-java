package com.ringcentral.definitions;


public class TokenInfo {
    /**
     * Access token to pass to subsequent API requests
     */
    public String access_token;
    /**
     * Issued access token TTL (time to live), in seconds
     */
    public Long expires_in;
    /**
     * Refresh token to get a new access token, when the issued one expires
     */
    public String refresh_token;
    /**
     * Issued refresh token TTL (time to live), in seconds
     */
    public Long refresh_token_expires_in;
    /**
     * List of permissions allowed with this access token, white-space separated
     */
    public String scope;
    /**
     * Type of token. The only possible value supported is Bearer. This value should be used when specifying access token in Authorization header of subsequent API requests
     */
    public String token_type;
    /**
     * Extension identifier
     */
    public String owner_id;
    /**
     * Application instance identifier
     */
    public String endpoint_id;

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

}
