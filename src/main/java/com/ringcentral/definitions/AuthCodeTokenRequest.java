package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Authorization Code" and "Authorization code with PKCE" flows
 * with the `authorization_code` grant type
 */
public class AuthCodeTokenRequest {
    /**
     * Grant type
     * Required
     * Enum: authorization_code
     */
    public String grant_type;
    /**
     * For `authorization_code` grant type only. User&#039;s authorization code
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

    public AuthCodeTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public AuthCodeTokenRequest code(String code) {
        this.code = code;
        return this;
    }

    public AuthCodeTokenRequest redirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
        return this;
    }

    public AuthCodeTokenRequest code_verifier(String code_verifier) {
        this.code_verifier = code_verifier;
        return this;
    }
}
