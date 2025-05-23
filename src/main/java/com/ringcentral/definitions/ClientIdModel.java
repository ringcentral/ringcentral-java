package com.ringcentral.definitions;


public class ClientIdModel {
    /**
     * The registered identifier of a client application.
     * Used to identify a client ONLY if the client authentication is not required and
     * corresponding credentials are not provided with this request
     * Example: AZwEVwGEcfGet2PCouA7K6
     */
    public String client_id;

    public ClientIdModel client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }
}
