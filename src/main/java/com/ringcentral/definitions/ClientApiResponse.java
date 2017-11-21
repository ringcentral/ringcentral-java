package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientApiResponse
{
    // Client application information
    public ClientApplicationInfo client;
    public ClientApiResponse client(ClientApplicationInfo client) {
        this.client = client;
        return this;
    }
    // Provisioning parameters. Available for the  detected  applications only
    public ClientProvisioningInfo provisioning;
    public ClientApiResponse provisioning(ClientProvisioningInfo provisioning) {
        this.provisioning = provisioning;
        return this;
    }
}
