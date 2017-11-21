package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ProvisioningResource
{
    //
    public WebUrisResource webUris;
    public ProvisioningResource webUris(WebUrisResource webUris) {
        this.webUris = webUris;
        return this;
    }
    //
    public HintsResource hints;
    public ProvisioningResource hints(HintsResource hints) {
        this.hints = hints;
        return this;
    }
}
