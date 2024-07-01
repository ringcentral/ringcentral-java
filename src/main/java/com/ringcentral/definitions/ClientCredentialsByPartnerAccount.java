package com.ringcentral.definitions;


    /**
* Token endpoint request parameters used in the "Client Credentials" authorization flow with the `client_credentials` grant type
*/
public class ClientCredentialsByPartnerAccount
{
    /**
     * Grant type
     * Enum: client_credentials
     */
    public String grant_type;
    public ClientCredentialsByPartnerAccount grant_type(String grant_type)
    {
        this.grant_type = grant_type;
        return this;
    }

    /**
     * RingCentral Brand identifier
     * Required
     */
    public String brand_id;
    public ClientCredentialsByPartnerAccount brand_id(String brand_id)
    {
        this.brand_id = brand_id;
        return this;
    }

    /**
     * The ID of the account on RingCentral partner&#039;s side
     * Required
     */
    public String partner_account_id;
    public ClientCredentialsByPartnerAccount partner_account_id(String partner_account_id)
    {
        this.partner_account_id = partner_account_id;
        return this;
    }
}