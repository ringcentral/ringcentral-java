package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientProvisioningHintsInfo
{
    // Trial account expiration. Returned for trial accounts only
    public ClientProvisioningHintInfo trialState;
    public ClientProvisioningHintsInfo trialState(ClientProvisioningHintInfo trialState) {
        this.trialState = trialState;
        return this;
    }
    // User credentials expiration
    public ClientProvisioningHintInfo userCredentialState;
    public ClientProvisioningHintsInfo userCredentialState(ClientProvisioningHintInfo userCredentialState) {
        this.userCredentialState = userCredentialState;
        return this;
    }
    // Application version update. Returned only if the client current version is older than the latest version. 'actionRequired': 'true' means the application requires force updating to the latest version
    public ClientProvisioningHintInfo appVersionUpgrade;
    public ClientProvisioningHintsInfo appVersionUpgrade(ClientProvisioningHintInfo appVersionUpgrade) {
        this.appVersionUpgrade = appVersionUpgrade;
        return this;
    }
}
