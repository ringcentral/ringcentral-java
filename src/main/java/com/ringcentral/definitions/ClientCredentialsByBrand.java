package com.ringcentral.definitions;


/**
 * Token endpoint request parameters used in the "Client Credentials" authorization flow with the `client_credentials` grant type
 */
public class ClientCredentialsByBrand {
    /**
     * Grant type
     * Enum: client_credentials
     */
    public String grant_type;
    /**
     * RingCentral Brand identifier
     * Required
     */
    public String brand_id;

    public ClientCredentialsByBrand grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public ClientCredentialsByBrand brand_id(String brand_id) {
        this.brand_id = brand_id;
        return this;
    }
}
