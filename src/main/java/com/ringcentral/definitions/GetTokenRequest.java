package com.ringcentral.definitions;


public class GetTokenRequest {
    /**
     * Phone number linked to an account or extension in E.164 format with or without leading '+' sign
     */
    public String username;
    /**
     * User's password
     */
    public String password;
    /**
     * Optional. Extension short number. If company number is specified as a username, and extension is not specified, the server will attempt to authenticate client as main company administrator
     */
    public String extension;
    /**
     * Grant type
     * Default: password
     * Enum: authorization_code, password, refresh_token, client_credentials
     */
    public String grant_type;
    /**
     * Authorization code
     */
    public String code;
    /**
     * This is a callback URI which determines where the response is sent. The value of this parameter must exactly match one of the URIs you have provided for your app upon registration
     */
    public String redirect_uri;
    /**
     * Access token lifetime in seconds
     * Maximum: 3600
     * Minimum: 600
     * Default: 3600
     */
    public Long access_token_ttl;
    /**
     * Refresh token lifetime in seconds
     * Maximum: 604800
     * Default: 604800
     */
    public Long refresh_token_ttl;
    /**
     * List of API permissions to be used with access token. Can be omitted when requesting all permissions defined during the application registration phase
     */
    public String scope;
    /**
     * Previously issued refresh token. This is the only formData field used for the Refresh Token Flow.
     */
    public String refresh_token;
    /**
     * The unique identifier of a client application. If not specified, the previously specified or auto generated value is used by default
     */
    public String endpoint_id;

    public GetTokenRequest username(String username) {
        this.username = username;
        return this;
    }

    public GetTokenRequest password(String password) {
        this.password = password;
        return this;
    }

    public GetTokenRequest extension(String extension) {
        this.extension = extension;
        return this;
    }

    public GetTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public GetTokenRequest code(String code) {
        this.code = code;
        return this;
    }

    public GetTokenRequest redirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
        return this;
    }

    public GetTokenRequest access_token_ttl(Long access_token_ttl) {
        this.access_token_ttl = access_token_ttl;
        return this;
    }

    public GetTokenRequest refresh_token_ttl(Long refresh_token_ttl) {
        this.refresh_token_ttl = refresh_token_ttl;
        return this;
    }

    public GetTokenRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public GetTokenRequest refresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
        return this;
    }

    public GetTokenRequest endpoint_id(String endpoint_id) {
        this.endpoint_id = endpoint_id;
        return this;
    }

}
