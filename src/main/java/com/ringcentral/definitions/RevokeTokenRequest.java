package com.ringcentral.definitions;


public class RevokeTokenRequest
{
    /**
     * Access or refresh token to be revoked
     * Required
     */
    public String token;
    public RevokeTokenRequest token(String token)
    {
        this.token = token;
        return this;
    }

    /**
     * Client assertion type
     */
    public String client_assertion_type;
    public RevokeTokenRequest client_assertion_type(String client_assertion_type)
    {
        this.client_assertion_type = client_assertion_type;
        return this;
    }

    /**
     * Client assertion
     */
    public String client_assertion;
    public RevokeTokenRequest client_assertion(String client_assertion)
    {
        this.client_assertion = client_assertion;
        return this;
    }
}