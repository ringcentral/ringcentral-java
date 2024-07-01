package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Personal JWT", "JWT Bearer" and "Partner JWT" authorization flows
 * with the `urn:ietf:params:oauth:grant-type:jwt-bearer` and `partner_jwt` grant types
 */
public class JwtTokenRequest {
    /**
     * Grant type
     * Enum: urn:ietf:params:oauth:grant-type:jwt-bearer, partner_jwt
     */
    public String grant_type;
    /**
     * For `urn:ietf:params:oauth:grant-type:jwt-bearer` or `partner_jwt` grant types only.
     * Authorization grant assertion (JWT)
     * as defined by [RFC-7523](https://datatracker.ietf.org/doc/html/rfc7523#section-2.1).
     * Required
     */
    public String assertion;

    public JwtTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public JwtTokenRequest assertion(String assertion) {
        this.assertion = assertion;
        return this;
    }
}
