package com.ringcentral.definitions;


public class AuthorizeRequest
{
    /**
         * Determines authorization flow: **code** - Authorization Code, **token** - Implicit Grant
         * Enum: code, token
         */
        public String response_type;
  public AuthorizeRequest response_type(String response_type)
  {
    this.response_type = response_type;
    return this;
  }
  

        /**
         * This is a callback URI which determines where the response is sent. The value of this parameter must exactly match one of the URIs you have provided for your app upon registration
         */
        public String redirect_uri;
  public AuthorizeRequest redirect_uri(String redirect_uri)
  {
    this.redirect_uri = redirect_uri;
    return this;
  }
  

        /**
         * Identifier (key) of a client application
         */
        public String client_id;
  public AuthorizeRequest client_id(String client_id)
  {
    this.client_id = client_id;
    return this;
  }
  

        /**
         * Client state. Returned back to the client at the end of the flow
         */
        public String state;
  public AuthorizeRequest state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * Brand identifier. If it is not provided in request, server will try to determine brand from client app profile. The default value is '1210' - RingCentral US
         */
        public String brand_id;
  public AuthorizeRequest brand_id(String brand_id)
  {
    this.brand_id = brand_id;
    return this;
  }
  

        /**
         * Style of login form. The default value is 'page'. The 'popup' and 'touch' values are featured for mobile applications
         * Enum: page, popup, touch, mobile
         */
        public String display;
  public AuthorizeRequest display(String display)
  {
    this.display = display;
    return this;
  }
  

        /**
         * Specifies which login form will be displayed. Space-separated set of the following values: 'login' - official RingCentral login form, 'sso' - Single Sign-On login form, 'consent' - form to show the requested scope and prompt user for consent. Either 'login' or 'sso' (or both) must be specified. The default value is 'login&sso'
         * Enum: login, sso, consent
         */
        public String prompt;
  public AuthorizeRequest prompt(String prompt)
  {
    this.prompt = prompt;
    return this;
  }
  

        /**
         * Localization code of a language. Overwrites 'Accept-Language' header value
         */
        public String localeId;
  public AuthorizeRequest localeId(String localeId)
  {
    this.localeId = localeId;
    return this;
  }
  

        /**
         * Localization code of a language. Overwrites 'localeId' parameter value
         */
        public String ui_locales;
  public AuthorizeRequest ui_locales(String ui_locales)
  {
    this.ui_locales = ui_locales;
    return this;
  }
  

        /**
         * User interface options data
         * Enum: hide_logo, hide_tos, hide_remember_me, external_popup, old_ui
         */
        public String ui_options;
  public AuthorizeRequest ui_options(String ui_options)
  {
    this.ui_options = ui_options;
    return this;
  }
  

        /**
         */
        public String scope;
  public AuthorizeRequest scope(String scope)
  {
    this.scope = scope;
    return this;
  }
  

        /**
         */
        public String accept_language;
  public AuthorizeRequest accept_language(String accept_language)
  {
    this.accept_language = accept_language;
    return this;
  }
  

        /**
         */
        public String request;
  public AuthorizeRequest request(String request)
  {
    this.request = request;
    return this;
  }
  

        /**
         */
        public String request_uri;
  public AuthorizeRequest request_uri(String request_uri)
  {
    this.request_uri = request_uri;
    return this;
  }
  

        /**
         */
        public String nonce;
  public AuthorizeRequest nonce(String nonce)
  {
    this.nonce = nonce;
    return this;
  }
  

        /**
         */
        public String code_challenge;
  public AuthorizeRequest code_challenge(String code_challenge)
  {
    this.code_challenge = code_challenge;
    return this;
  }
  

        /**
         * Enum: plain, S256
         */
        public String code_challenge_method;
  public AuthorizeRequest code_challenge_method(String code_challenge_method)
  {
    this.code_challenge_method = code_challenge_method;
    return this;
  }
  

        /**
         */
        public Boolean discovery;
  public AuthorizeRequest discovery(Boolean discovery)
  {
    this.discovery = discovery;
    return this;
  }
  
}
