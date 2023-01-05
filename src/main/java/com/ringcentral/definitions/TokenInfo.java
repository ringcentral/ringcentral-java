package com.ringcentral.definitions;


public class TokenInfo
{
    /**
     * OAuth access token to pass to subsequent API requests
     * Required
     * Example: U1BCMDFUMDRKV1MwMXxzLFSvXdw5PHMsVLEn_MrtcyxUsw
     */
    public String access_token;
    public TokenInfo access_token(String access_token)
    {
        this.access_token = access_token;
        return this;
    }

    /**
     * Issued access token TTL (time-to-live) in seconds
     * Required
     * Format: int32
     * Example: 7199
     */
    public Long expires_in;
    public TokenInfo expires_in(Long expires_in)
    {
        this.expires_in = expires_in;
        return this;
    }

    /**
     * OAuth refresh token (in case the one was issued)
     * Example: U1BCMDFUMDRKV1MwMXxzLFL4ec6A0XMsUv9wLriecyxS_w
     */
    public String refresh_token;
    public TokenInfo refresh_token(String refresh_token)
    {
        this.refresh_token = refresh_token;
        return this;
    }

    /**
     * Issued refresh token TTL (time-to-live) in seconds
     * Format: int32
     * Example: 604799
     */
    public Long refresh_token_expires_in;
    public TokenInfo refresh_token_expires_in(Long refresh_token_expires_in)
    {
        this.refresh_token_expires_in = refresh_token_expires_in;
        return this;
    }

    /**
     * List of permissions (space separated) granted to the application with this access token
     * Required
     * Example: AccountInfo CallLog ExtensionInfo Messages SMS
     */
    public String scope;
    public TokenInfo scope(String scope)
    {
        this.scope = scope;
        return this;
    }

    /**
     * Type of token. The only supported value is `bearer`. This value should be used when specifying access token in `Authorization` header of subsequent API requests
     * Required
     * Example: bearer
     */
    public String token_type;
    public TokenInfo token_type(String token_type)
    {
        this.token_type = token_type;
        return this;
    }

    /**
     * Token owner (extension/user) identifier
     * Example: 256440016
     */
    public String owner_id;
    public TokenInfo owner_id(String owner_id)
    {
        this.owner_id = owner_id;
        return this;
    }

    /**
     * Application instance identifier
     * Example: 8zXq6oaLT7WvwWITlGiA1A
     */
    public String endpoint_id;
    public TokenInfo endpoint_id(String endpoint_id)
    {
        this.endpoint_id = endpoint_id;
        return this;
    }

    /**
     * OIDC ID token (if OpenId Connect flow was activated during authorization)
     */
    public String id_token;
    public TokenInfo id_token(String id_token)
    {
        this.id_token = id_token;
        return this;
    }
}