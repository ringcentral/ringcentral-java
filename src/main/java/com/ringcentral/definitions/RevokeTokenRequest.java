package com.ringcentral.definitions;


public class RevokeTokenRequest
{
    /**
         */
        public String client_assertion_type;
  public RevokeTokenRequest client_assertion_type(String client_assertion_type)
  {
    this.client_assertion_type = client_assertion_type;
    return this;
  }
  

        /**
         */
        public String client_assertion;
  public RevokeTokenRequest client_assertion(String client_assertion)
  {
    this.client_assertion = client_assertion;
    return this;
  }
  

        /**
         * Active access or refresh token to be revoked
         */
        public String token;
  public RevokeTokenRequest token(String token)
  {
    this.token = token;
    return this;
  }
  
}
