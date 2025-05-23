package com.ringcentral.definitions;


/**
 * Query parameters for operation authorize
 */
public class AuthorizeParameters {
    /**
     * The registered identifier of a client application
     * Example: AZwEVwGEcfGet2PCouA7K6
     */
    public String client_id;
    /**
     * Determines authorization flow type. The only supported value is `code` which corresponds to OAuth 2.0 &quot;Authorization Code Flow&quot;
     * Enum: code
     */
    public String response_type;
    /**
     * This is the URI where the Authorization Server redirects the User Agent to at the end of the authorization flow.
     * The value of this parameter must exactly match one of the URIs registered for this client application.
     * This parameter is required if there are more than one redirect URIs registered for the app.
     * Format: uri
     */
    public String redirect_uri;
    /**
     * An opaque value used by the client to maintain state between the request and callback.
     * The authorization server includes this value when redirecting the User Agent back
     * to the client. The parameter SHOULD be used for preventing cross-site request forgery attacks.
     */
    public String state;
    /**
     * The list of space separated application permissions (OAuth scopes)
     */
    public String scope;
    /**
     * Specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User.
     * Default: page
     * Enum: page, popup, touch, mobile
     */
    public String display;
    /**
     * Space-delimited, case-sensitive list of ASCII string values that specifies whether the Authorization Server prompts the End-User for
     * re-authentication and consent. The defined values are:
     * <p>
     * - `login` - RingCentral native login form;
     * - `sso` - Single Sign-On login form;
     * - `consent` - form to show the requested scope and prompt user for consent;
     * - `none` - indicates that non-interactive authorization is requested
     * (the flow will succeed only if the user has been already authenticated within the same browser session).
     * Cannot be combined with any other prompt option.
     * Default: login sso
     */
    public String prompt;
    /**
     * End-User&#039;s preferred languages and scripts for the user interface, represented as a space-separated list of
     * [RFC-5646](https://datatracker.ietf.org/doc/html/rfc5646) language tag values, ordered by preference.
     * Example: en-US
     */
    public String ui_locales;
    /**
     * The code challenge value as defined by the PKCE specification -
     * [RFC-7636 &quot;Proof Key for Code Exchange by OAuth Public Clients&quot;](https://datatracker.ietf.org/doc/html/rfc7636)
     */
    public String code_challenge;
    /**
     * The code challenge method as defined by the PKCE specification -
     * [RFC-7636 &quot;Proof Key for Code Exchange by OAuth Public Clients&quot;](https://datatracker.ietf.org/doc/html/rfc7636)
     * Default: plain
     * Enum: plain, S256
     */
    public String code_challenge_method;
    /**
     * String value used to associate a Client session with an ID Token, and to mitigate replay attacks.
     * The value is passed through unmodified from the Authentication Request to the ID Token.
     * (This parameter is defined in OpenID Connect 1.0 specification)
     */
    public String nonce;
    /**
     * Hint to the Authorization Server about the login identifier the End-User might use to log in.
     */
    public String login_hint;
    /**
     * RingCentral Brand identifier. If it is not provided in the request,
     * server will try to determine brand from the client application profile.
     * Example: 1210
     */
    public String brand_id;

    public AuthorizeParameters client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public AuthorizeParameters response_type(String response_type) {
        this.response_type = response_type;
        return this;
    }

    public AuthorizeParameters redirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
        return this;
    }

    public AuthorizeParameters state(String state) {
        this.state = state;
        return this;
    }

    public AuthorizeParameters scope(String scope) {
        this.scope = scope;
        return this;
    }

    public AuthorizeParameters display(String display) {
        this.display = display;
        return this;
    }

    public AuthorizeParameters prompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    public AuthorizeParameters ui_locales(String ui_locales) {
        this.ui_locales = ui_locales;
        return this;
    }

    public AuthorizeParameters code_challenge(String code_challenge) {
        this.code_challenge = code_challenge;
        return this;
    }

    public AuthorizeParameters code_challenge_method(String code_challenge_method) {
        this.code_challenge_method = code_challenge_method;
        return this;
    }

    public AuthorizeParameters nonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public AuthorizeParameters login_hint(String login_hint) {
        this.login_hint = login_hint;
        return this;
    }

    public AuthorizeParameters brand_id(String brand_id) {
        this.brand_id = brand_id;
        return this;
    }
}
