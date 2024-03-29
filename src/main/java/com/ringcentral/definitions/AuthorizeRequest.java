package com.ringcentral.definitions;


public class AuthorizeRequest {
    /**
     * Determines authorization flow:
     * - **code** - Authorization Code,
     * - **token** - Implicit
     * Required
     * Enum: code, token
     */
    public String response_type;
    /**
     * This is a callback URI which determines where the response
     * is sent. The value of this parameter must exactly match one of
     * the URIs you have provided for your app upon registration
     * Required
     * Format: uri
     */
    public String redirect_uri;
    /**
     * Identifier (key) of a client application
     * Required
     */
    public String client_id;
    /**
     * Client state. Returned to the client at the end of the flow
     */
    public String state;
    /**
     * Brand identifier. If it is not provided in request,
     * server will try to determine brand from client app profile. The
     * default value is `1210` - RingCentral US brand ID
     * Default: 1210
     */
    public String brand_id;
    /**
     * Style of login form. The default value is &#039;page&#039;. The
     * &#039;popup&#039; and &#039;touch&#039; values are featured for mobile applications
     * Default: page
     * Enum: page, popup, touch, mobile
     */
    public String display;
    /**
     * Specifies which login form will be displayed. Space-separated
     * set of the following values:
     * <p>
     * - **login** - RingCentral native login form,
     * - **sso** - Single Sign-On login form,
     * - **consent** - form to show the requested scope and prompt user for consent.
     * <p>
     * Either `login` or `sso` (or both) must be specified. The default
     * value is `login sso`
     * Default: login sso
     */
    public String prompt;
    /**
     * Locale code of a language. Overwrites &#039;Accept-Language&#039; header value.
     * <p>
     * DEPRECATED: `ui_locales` parameter should be used instead
     * Example: en-US
     */
    public String localeId;
    /**
     * Locale code of a language. Overwrites &#039;Accept-Language&#039; header value and &#039;localeId&#039; parameter value
     * Example: en-US
     */
    public String ui_locales;
    /**
     * User interface options (space-separated)
     */
    public String ui_options;
    /**
     * OAuth scope
     */
    public String scope;
    /**
     *
     */
    public String accept_language;
    /**
     *
     */
    public String request;
    /**
     * Format: uri
     */
    public String request_uri;
    /**
     *
     */
    public String nonce;
    /**
     *
     */
    public String code_challenge;
    /**
     * Enum: plain, S256
     */
    public String code_challenge_method;

    public AuthorizeRequest response_type(String response_type) {
        this.response_type = response_type;
        return this;
    }

    public AuthorizeRequest redirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
        return this;
    }

    public AuthorizeRequest client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public AuthorizeRequest state(String state) {
        this.state = state;
        return this;
    }

    public AuthorizeRequest brand_id(String brand_id) {
        this.brand_id = brand_id;
        return this;
    }

    public AuthorizeRequest display(String display) {
        this.display = display;
        return this;
    }

    public AuthorizeRequest prompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    public AuthorizeRequest localeId(String localeId) {
        this.localeId = localeId;
        return this;
    }

    public AuthorizeRequest ui_locales(String ui_locales) {
        this.ui_locales = ui_locales;
        return this;
    }

    public AuthorizeRequest ui_options(String ui_options) {
        this.ui_options = ui_options;
        return this;
    }

    public AuthorizeRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public AuthorizeRequest accept_language(String accept_language) {
        this.accept_language = accept_language;
        return this;
    }

    public AuthorizeRequest request(String request) {
        this.request = request;
        return this;
    }

    public AuthorizeRequest request_uri(String request_uri) {
        this.request_uri = request_uri;
        return this;
    }

    public AuthorizeRequest nonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public AuthorizeRequest code_challenge(String code_challenge) {
        this.code_challenge = code_challenge;
        return this;
    }

    public AuthorizeRequest code_challenge_method(String code_challenge_method) {
        this.code_challenge_method = code_challenge_method;
        return this;
    }
}
