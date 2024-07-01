package com.ringcentral.definitions;


    /**
* Token endpoint request parameters used in the "Client Credentials" authorization flow with the `client_credentials` grant type
*/
public class ClientCredentialsTokenRequest
{
    /**
     * Grant type
     * Enum: client_credentials
     */
    public String grant_type;
    public ClientCredentialsTokenRequest grant_type(String grant_type)
    {
        this.grant_type = grant_type;
        return this;
    }

    /**
     * RingCentral Brand identifier
     * Required
     */
    public String brand_id;
    public ClientCredentialsTokenRequest brand_id(String brand_id)
    {
        this.brand_id = brand_id;
        return this;
    }

    /**
     * RingCentral internal account ID
     * Required
     */
    public String account_id;
    public ClientCredentialsTokenRequest account_id(String account_id)
    {
        this.account_id = account_id;
        return this;
    }

    /**
     * The ID of the account on RingCentral partner&#039;s side
     * Required
     */
    public String partner_account_id;
    public ClientCredentialsTokenRequest partner_account_id(String partner_account_id)
    {
        this.partner_account_id = partner_account_id;
        return this;
    }
}