package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientInfoResource
{
    //
    public String uri;
    public ClientInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ClientResource client;
    public ClientInfoResource client(ClientResource client) {
        this.client = client;
        return this;
    }
    //
    public ProvisioningResource provisioning;
    public ClientInfoResource provisioning(ProvisioningResource provisioning) {
        this.provisioning = provisioning;
        return this;
    }
}
