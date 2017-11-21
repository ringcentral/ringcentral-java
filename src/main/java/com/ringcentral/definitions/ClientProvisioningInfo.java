package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientProvisioningInfo
{
    // Links to the mobile web and Service Web resources
    public ClientProvisioningWebUriInfo webUris;
    public ClientProvisioningInfo webUris(ClientProvisioningWebUriInfo webUris) {
        this.webUris = webUris;
        return this;
    }
    // Informs client application on the required user action
    public ClientProvisioningHintsInfo hints;
    public ClientProvisioningInfo hints(ClientProvisioningHintsInfo hints) {
        this.hints = hints;
        return this;
    }
}
