package com.ringcentral.definitions;


public class GetTokenRequest
{
    /**
     * For `password` grant type only. User login name: email or phone number in E.164 format
     */
    public String username;
    public GetTokenRequest username(String username)
    {
        this.username = username;
        return this;
    }

    /**
     * For `password` grant type only. User&#039;s password
     * Format: password
     */
    public String password;
    public GetTokenRequest password(String password)
    {
        this.password = password;
        return this;
    }

    /**
     * For `password` grant type only. Optional. Extension short number. If company number
    * is specified as a username, and extension is not specified, the
    * server will attempt to authenticate client as main company administrator
    * 
    * DEPRECATED: use extension number embedded into username string like `+16501234567*101`
     */
    public String extension;
    public GetTokenRequest extension(String extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Grant type
     * Required
     * Enum: authorization_code, password, refresh_token, client_credentials, urn:ietf:params:oauth:grant-type:jwt-bearer, urn:ietf:params:oauth:grant-type:device_code, partner_jwt
     */
    public String grant_type;
    public GetTokenRequest grant_type(String grant_type)
    {
        this.grant_type = grant_type;
        return this;
    }

    /**
     * For `authorization_code` grant type only. User&#039;s authorization code
     */
    public String code;
    public GetTokenRequest code(String code)
    {
        this.code = code;
        return this;
    }

    /**
     * For `authorization_code` grant type only. This is a callback URI which determines where the response
    * is sent. The value of this parameter must exactly match one of
    * the URIs you have provided for your app upon registration
     * Format: uri
     */
    public String redirect_uri;
    public GetTokenRequest redirect_uri(String redirect_uri)
    {
        this.redirect_uri = redirect_uri;
        return this;
    }

    /**
     * Access token lifetime in seconds
     * Maximum: 3600
     * Minimum: 600
     * Format: int32
     * Default: 3600
     */
    public Long access_token_ttl;
    public GetTokenRequest access_token_ttl(Long access_token_ttl)
    {
        this.access_token_ttl = access_token_ttl;
        return this;
    }

    /**
     * Refresh token lifetime in seconds
     * Maximum: 604800
     * Format: int32
     * Default: 604800
     */
    public Long refresh_token_ttl;
    public GetTokenRequest refresh_token_ttl(Long refresh_token_ttl)
    {
        this.refresh_token_ttl = refresh_token_ttl;
        return this;
    }

    /**
     * List of application permissions to be used with access token.
    * By default the scope includes all permissions configured during
    * the application registration phase
     */
    public String scope;
    public GetTokenRequest scope(String scope)
    {
        this.scope = scope;
        return this;
    }

    /**
     * For `refresh_token` grant type only. Previously issued refresh token.
     */
    public String refresh_token;
    public GetTokenRequest refresh_token(String refresh_token)
    {
        this.refresh_token = refresh_token;
        return this;
    }

    /**
     * The unique identifier of a client application instance. If not
    * specified, the derived or auto generated value will be used
     */
    public String endpoint_id;
    public GetTokenRequest endpoint_id(String endpoint_id)
    {
        this.endpoint_id = endpoint_id;
        return this;
    }

    /**
     */
    public String pin;
    public GetTokenRequest pin(String pin)
    {
        this.pin = pin;
        return this;
    }

    /**
     * OAuth client identifier (if not specified via `Authorization` header)
     */
    public String client_id;
    public GetTokenRequest client_id(String client_id)
    {
        this.client_id = client_id;
        return this;
    }

    /**
     */
    public String account_id;
    public GetTokenRequest account_id(String account_id)
    {
        this.account_id = account_id;
        return this;
    }

    /**
     */
    public String partner_account_id;
    public GetTokenRequest partner_account_id(String partner_account_id)
    {
        this.partner_account_id = partner_account_id;
        return this;
    }

    /**
     * Client assertion type
     */
    public String client_assertion_type;
    public GetTokenRequest client_assertion_type(String client_assertion_type)
    {
        this.client_assertion_type = client_assertion_type;
        return this;
    }

    /**
     * Client assertion
     */
    public String client_assertion;
    public GetTokenRequest client_assertion(String client_assertion)
    {
        this.client_assertion = client_assertion;
        return this;
    }

    /**
     * For `jwt_bearer` grant type only. Assertion
     */
    public String assertion;
    public GetTokenRequest assertion(String assertion)
    {
        this.assertion = assertion;
        return this;
    }

    /**
     */
    public String brand_id;
    public GetTokenRequest brand_id(String brand_id)
    {
        this.brand_id = brand_id;
        return this;
    }

    /**
     * PKCE code verifier
     */
    public String code_verifier;
    public GetTokenRequest code_verifier(String code_verifier)
    {
        this.code_verifier = code_verifier;
        return this;
    }

    /**
     */
    public String device_code;
    public GetTokenRequest device_code(String device_code)
    {
        this.device_code = device_code;
        return this;
    }
}