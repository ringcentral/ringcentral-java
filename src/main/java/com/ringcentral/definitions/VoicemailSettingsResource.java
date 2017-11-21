package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class VoicemailSettingsResource
{
    //
    public Boolean enabled;
    public VoicemailSettingsResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    //
    public ExtensionResource recipient;
    public VoicemailSettingsResource recipient(ExtensionResource recipient) {
        this.recipient = recipient;
        return this;
    }
}
