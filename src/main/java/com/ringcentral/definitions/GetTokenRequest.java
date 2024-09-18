package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Guest" authorization flow
 * with the `guest` grant type
 */
public class GetTokenRequest {
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
    /**
     * For `otp` grant type only.
     * One-time password code
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
     * For `password` grant type only. User login name: email or phone number in E.164 format
     * Required
     */
    public String username;
    /**
     * For `password` grant type only. User&#039;s password
     * Required
     * Format: password
     */
    public String password;
    /**
     * For `password` grant type only. Optional. Extension short number. If a company number
     * is specified as a username, and extension is not specified, the
     * server will attempt to authenticate client as main company administrator
     * <p>
     * DEPRECATED: use extension number embedded into username string like `+16501234567*101`
     */
    public String extension;
    /**
     * IVR pin for pin-based authentication.
     * <p>
     * DEPRECATED: use a dedicated `ivr_pin` grant type instead
     */
    public String pin;
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
    /**
     * For `ivr_pin` grant type only. User&#039;s IVR pin.
     * Required
     */
    public String ivr_pin;
    /**
     * For `urn:ietf:params:oauth:grant-type:device_code` grant type only.
     * The device verification code as defined by [RFC-8628](https://datatracker.ietf.org/doc/html/rfc8628#section-3.4)
     * Required
     */
    public String device_code;
    /**
     * RingCentral Brand identifier.
     * Required
     */
    public String brand_id;
    /**
     * RingCentral internal account ID
     * Required
     */
    public String account_id;
    /**
     * The ID of the account on RingCentral partner&#039;s side
     * Required
     */
    public String partner_account_id;
    /**
     * Resource type for the guest access.
     * Required
     */
    public String resource_type;
    /**
     * Resource URL for the guest access.
     * Required
     */
    public String resource;

    public GetTokenRequest client_assertion_type(String client_assertion_type) {
        this.client_assertion_type = client_assertion_type;
        return this;
    }

    public GetTokenRequest client_assertion(String client_assertion) {
        this.client_assertion = client_assertion;
        return this;
    }

    public GetTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public GetTokenRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public GetTokenRequest client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public GetTokenRequest endpoint_id(String endpoint_id) {
        this.endpoint_id = endpoint_id;
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

    public GetTokenRequest code(String code) {
        this.code = code;
        return this;
    }

    public GetTokenRequest redirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
        return this;
    }

    public GetTokenRequest code_verifier(String code_verifier) {
        this.code_verifier = code_verifier;
        return this;
    }

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

    public GetTokenRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    public GetTokenRequest assertion(String assertion) {
        this.assertion = assertion;
        return this;
    }

    public GetTokenRequest refresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
        return this;
    }

    public GetTokenRequest ivr_pin(String ivr_pin) {
        this.ivr_pin = ivr_pin;
        return this;
    }

    public GetTokenRequest device_code(String device_code) {
        this.device_code = device_code;
        return this;
    }

    public GetTokenRequest brand_id(String brand_id) {
        this.brand_id = brand_id;
        return this;
    }

    public GetTokenRequest account_id(String account_id) {
        this.account_id = account_id;
        return this;
    }

    public GetTokenRequest partner_account_id(String partner_account_id) {
        this.partner_account_id = partner_account_id;
        return this;
    }

    public GetTokenRequest resource_type(String resource_type) {
        this.resource_type = resource_type;
        return this;
    }

    public GetTokenRequest resource(String resource) {
        this.resource = resource;
        return this;
    }
}
