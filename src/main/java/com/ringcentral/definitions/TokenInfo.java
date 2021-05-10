package com.ringcentral.definitions;


public class TokenInfo {
    /**
     * Access token to pass to subsequent API requests
     * Example: U1BCMDFUMDRKV1MwMXxzLFSvXdw5PHMsVLEn_MrtcyxUsw
     */
    public String access_token;
    /**
     * Issued access token TTL (time to live), in seconds
     * Example: 7199
     */
    public Long expires_in;
    /**
     * Refresh token to get a new access token, when the issued one expires
     * Example: U1BCMDFUMDRKV1MwMXxzLFL4ec6A0XMsUv9wLriecyxS_w
     */
    public String refresh_token;
    /**
     * Issued refresh token TTL (time to live), in seconds
     * Example: 604799
     */
    public Long refresh_token_expires_in;
    /**
     * List of permissions allowed with this access token, white-space separated
     * Example: AccountInfo CallLog ExtensionInfo Messages SMS
     */
    public String scope;
    /**
     * Type of token. The only possible value supported is Bearer. This value should be used when specifying access token in `Authorization` header of subsequent API requests
     * Example: bearer
     */
    public String token_type;
    /**
     * Extension identifier
     * Example: 256440016
     */
    public String owner_id;
    /**
     * Application instance identifier
     * Example: 8zXq6oaLT7WvwWITlGiA1A
     */
    public String endpoint_id;
    /**
     *
     */
    public String id_token;

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
}
