package com.ringcentral.definitions;


    /**
* Token endpoint request parameters used in the "Client Credentials" authorization flow with the `client_credentials` grant type
*/
public class ClientCredentialsByAccount
{
    /**
     * Grant type
     * Enum: client_credentials
     */
    public String grant_type;
    public ClientCredentialsByAccount grant_type(String grant_type)
    {
        this.grant_type = grant_type;
        return this;
    }

    /**
     * RingCentral internal account ID
     * Required
     */
    public String account_id;
    public ClientCredentialsByAccount account_id(String account_id)
    {
        this.account_id = account_id;
        return this;
    }
}