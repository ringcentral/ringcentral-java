package com.ringcentral.definitions;


/**
 * The OpenID Connect configuration document as defined by the
 * [OpenID Connect Discovery 1.0](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata) specification
 */
public class OpenIdDiscovery {
    /**
     * An identifier of the ID token&#039;s issuer. This value is identical to the `iss` Claim value in ID Tokens
     * Required
     * Format: uri
     * Example: https://platform.ringcentral.com
     */
    public String issuer;
    /**
     * URL of the OAuth 2.0 authorization endpoint
     * Required
     * Format: uri
     * Example: https://platform.ringcentral.com/restapi/oauth/authorize
     */
    public String authorization_endpoint;
    /**
     * URL of the OAuth 2.0 token endpoint
     * Required
     * Format: uri
     * Example: https://platform.ringcentral.com/restapi/oauth/token
     */
    public String token_endpoint;
    /**
     * URL of the OAuth 2.0 revocation endpoint as defined by [RFC-7009](https://datatracker.ietf.org/doc/html/rfc7009)
     * Required
     * Format: uri
     * Example: https://platform.ringcentral.com/restapi/oauth/revoke
     */
    public String revocation_endpoint;
    /**
     * URL of the user info endpoint as defined by
     * [OpenID Connect Core 1.0](https://openid.net/specs/openid-connect-core-1_0.html#UserInfo) specification
     * Required
     * Format: uri
     * Example: https://platform.ringcentral.com/restapi/oauth/userinfo
     */
    public String userinfo_endpoint;
    /**
     * URL of JSON Web Key Set document that contains public key(s) to be used by the Relying Party
     * to validate ID Token signatures
     * Required
     * Format: uri
     * Example: https://platform.ringcentral.com/restapi/oauth/jwks
     */
    public String jwks_uri;
    /**
     * The list of the OAuth 2.0 scope values that this server supports
     * Required
     * Example: openid,email,profile
     * Enum: openid, email, profile
     */
    public String[] scopes_supported;
    /**
     * The list of Client Authentication methods supported by the Token Endpoint
     * Required
     * Example: client_secret_basic
     * Enum: client_secret_basic, client_secret_jwt, private_key_jwt
     */
    public String[] token_endpoint_auth_methods_supported;
    /**
     * The list of the OAuth 2.0 `response_type` values supported by the provider
     * Required
     * Example: code
     * Enum: code
     */
    public String[] response_types_supported;
    /**
     * The list of the Subject Identifier types supported by the provider (only `public` is currently supported)
     * Required
     * Example: public
     * Enum: public
     */
    public String[] subject_types_supported;
    /**
     * The list of the JWS signing algorithms (`alg` values) supported by the UserInfo Endpoint  to encode the Claims in a JWT
     * Required
     * Example: none
     * Enum: none
     */
    public String[] userinfo_signing_alg_values_supported;
    /**
     * The list of the JWS signing algorithms (`alg` values) supported by the provider for the ID Token
     * to encode the Claims in a JWT
     * Required
     * Example: RS256,HS256
     * Enum: RS256, HS256
     */
    public String[] id_token_signing_alg_values_supported;
    /**
     * The list of the `display` parameter values (in OAuth 2.0 Authorization Endpoint) supported by the provider
     * Enum: page, popup, touch, mobile
     */
    public String[] display_values_supported;
    /**
     * The list of the Claim Names of the Claims that the OpenID Provider MAY be able to supply values for
     * Example: sub,iss,auth_time,exp
     * Enum: sub, iss, auth_time, aud, exp, iat, jti, nonce, account_id, email, email_verified, given_name, family_name
     */
    public String[] claims_supported;
    /**
     * Language codes supported for the user interface, represented as language tags defined in
     * [RFC-5646](https://datatracker.ietf.org/doc/html/rfc5646)
     * Example: en,en-US,en-GB,fr-CA
     */
    public String[] ui_locales_supported;
    /**
     * Boolean value specifying whether the provide supports use of the `claims` parameter
     */
    public Boolean claims_parameter_supported;
    /**
     * Boolean value specifying whether the provide supports use of the `request` parameter
     */
    public Boolean request_parameter_supported;
    /**
     * Boolean value specifying whether the provide supports use of the `request` parameter
     */
    public Boolean request_uri_parameter_supported;

    public OpenIdDiscovery issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    public OpenIdDiscovery authorization_endpoint(String authorization_endpoint) {
        this.authorization_endpoint = authorization_endpoint;
        return this;
    }

    public OpenIdDiscovery token_endpoint(String token_endpoint) {
        this.token_endpoint = token_endpoint;
        return this;
    }

    public OpenIdDiscovery revocation_endpoint(String revocation_endpoint) {
        this.revocation_endpoint = revocation_endpoint;
        return this;
    }

    public OpenIdDiscovery userinfo_endpoint(String userinfo_endpoint) {
        this.userinfo_endpoint = userinfo_endpoint;
        return this;
    }

    public OpenIdDiscovery jwks_uri(String jwks_uri) {
        this.jwks_uri = jwks_uri;
        return this;
    }

    public OpenIdDiscovery scopes_supported(String[] scopes_supported) {
        this.scopes_supported = scopes_supported;
        return this;
    }

    public OpenIdDiscovery token_endpoint_auth_methods_supported(String[] token_endpoint_auth_methods_supported) {
        this.token_endpoint_auth_methods_supported = token_endpoint_auth_methods_supported;
        return this;
    }

    public OpenIdDiscovery response_types_supported(String[] response_types_supported) {
        this.response_types_supported = response_types_supported;
        return this;
    }

    public OpenIdDiscovery subject_types_supported(String[] subject_types_supported) {
        this.subject_types_supported = subject_types_supported;
        return this;
    }

    public OpenIdDiscovery userinfo_signing_alg_values_supported(String[] userinfo_signing_alg_values_supported) {
        this.userinfo_signing_alg_values_supported = userinfo_signing_alg_values_supported;
        return this;
    }

    public OpenIdDiscovery id_token_signing_alg_values_supported(String[] id_token_signing_alg_values_supported) {
        this.id_token_signing_alg_values_supported = id_token_signing_alg_values_supported;
        return this;
    }

    public OpenIdDiscovery display_values_supported(String[] display_values_supported) {
        this.display_values_supported = display_values_supported;
        return this;
    }

    public OpenIdDiscovery claims_supported(String[] claims_supported) {
        this.claims_supported = claims_supported;
        return this;
    }

    public OpenIdDiscovery ui_locales_supported(String[] ui_locales_supported) {
        this.ui_locales_supported = ui_locales_supported;
        return this;
    }

    public OpenIdDiscovery claims_parameter_supported(Boolean claims_parameter_supported) {
        this.claims_parameter_supported = claims_parameter_supported;
        return this;
    }

    public OpenIdDiscovery request_parameter_supported(Boolean request_parameter_supported) {
        this.request_parameter_supported = request_parameter_supported;
        return this;
    }

    public OpenIdDiscovery request_uri_parameter_supported(Boolean request_uri_parameter_supported) {
        this.request_uri_parameter_supported = request_uri_parameter_supported;
        return this;
    }
}
