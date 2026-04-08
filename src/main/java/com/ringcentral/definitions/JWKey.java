package com.ringcentral.definitions;


    /**
* Public key definition in JWK format
* (see [RFC-7517](https://www.rfc-editor.org/rfc/rfc7517.html#section-4))
* 
*/
public class JWKey
{
    /**
     * Identifies the cryptographic algorithm family used with the key
     * Required
     * Example: RSA
     */
    public String kty;
    public JWKey kty(String kty)
    {
        this.kty = kty;
        return this;
    }

    /**
     * Identifies the algorithm intended for use with the key
     * Required
     * Example: RS256
     */
    public String alg;
    public JWKey alg(String alg)
    {
        this.alg = alg;
        return this;
    }

    /**
     * Identifies the intended use of the public key. This parameter is employed to indicate whether
    * a public key is used for encrypting data or verifying the signature on data.
     * Required
     * Example: sig
     * Enum: sig, enc
     */
    public String use;
    public JWKey use(String use)
    {
        this.use = use;
        return this;
    }

    /**
     * An ID of the specific key within this keyset.
    * It is used to match the `kid` parameter in JOSE header of JWT.
     * Required
     */
    public String kid;
    public JWKey kid(String kid)
    {
        this.kid = kid;
        return this;
    }

    /**
     * The &quot;n&quot; (modulus) parameter contains the modulus value for the RSA public key.
    * It is represented as a Base64urlUInt-encoded value. (User with &quot;RSA&quot; key type)
     * Required
     */
    public String n;
    public JWKey n(String n)
    {
        this.n = n;
        return this;
    }

    /**
     * The &quot;e&quot; (exponent) parameter contains the exponent value for the RSA
    * public key.  It is represented as a Base64urlUInt-encoded value. (User with &quot;RSA&quot; key type)
     * Required
     */
    public String e;
    public JWKey e(String e)
    {
        this.e = e;
        return this;
    }
}