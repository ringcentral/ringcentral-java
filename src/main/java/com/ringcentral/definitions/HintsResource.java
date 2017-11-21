package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class HintsResource
{
    //
    public HintResource userCredentialState;
    public HintsResource userCredentialState(HintResource userCredentialState) {
        this.userCredentialState = userCredentialState;
        return this;
    }
    //
    public HintResource trialState;
    public HintsResource trialState(HintResource trialState) {
        this.trialState = trialState;
        return this;
    }
    //
    public HintResource appVersionUpgrade;
    public HintsResource appVersionUpgrade(HintResource appVersionUpgrade) {
        this.appVersionUpgrade = appVersionUpgrade;
        return this;
    }
}
