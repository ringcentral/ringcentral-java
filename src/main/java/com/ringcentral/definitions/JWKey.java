package com.ringcentral.definitions;


/**
 * Public key definition in JWK format
 * (see [RFC-7517](https://www.rfc-editor.org/rfc/rfc7517.html#section-4))
 */
public class JWKey {
    /**
     * Identifies the cryptographic algorithm family used with the key
     * Required
     * Example: RSA
     */
    public String kty;
    /**
     * Identifies the algorithm intended for use with the key
     * Required
     * Example: RS256
     */
    public String alg;
    /**
     * Identifies the intended use of the public key. This parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature on data.
     * Required
     * Example: sig
     * Enum: sig, enc
     */
    public String use;
    /**
     * An ID of the specific key within this keyset.
     * It is used to match the `kid` parameter in JOSE header of JWT.
     * Required
     */
    public String kid;
    /**
     * The &quot;n&quot; (modulus) parameter contains the modulus value for the RSA public key.
     * It is represented as a Base64urlUInt-encoded value. (User with &quot;RSA&quot; key type)
     * Required
     */
    public String n;
    /**
     * The &quot;e&quot; (exponent) parameter contains the exponent value for the RSA
     * public key.  It is represented as a Base64urlUInt-encoded value. (User with &quot;RSA&quot; key type)
     * Required
     */
    public String e;

    public JWKey kty(String kty) {
        this.kty = kty;
        return this;
    }

    public JWKey alg(String alg) {
        this.alg = alg;
        return this;
    }

    public JWKey use(String use) {
        this.use = use;
        return this;
    }

    public JWKey kid(String kid) {
        this.kid = kid;
        return this;
    }

    public JWKey n(String n) {
        this.n = n;
        return this;
    }

    public JWKey e(String e) {
        this.e = e;
        return this;
    }
}
