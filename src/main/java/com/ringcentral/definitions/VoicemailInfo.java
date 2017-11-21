package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class VoicemailInfo
{
    // If 'True' then voicemails are allowed to be received
    public Boolean enabled;
    public VoicemailInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    // Recipient data
    public RecipientInfo recipient;
    public VoicemailInfo recipient(RecipientInfo recipient) {
        this.recipient = recipient;
        return this;
    }
}
