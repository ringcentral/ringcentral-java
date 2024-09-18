package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Client Credentials" authorization flow
 * with the `client_credentials` grant type
 */
public class ClientCredentialsBase {
    /**
     * Grant type
     * Required
     * Enum: client_credentials
     */
    public String grant_type;

    public ClientCredentialsBase grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }
}
