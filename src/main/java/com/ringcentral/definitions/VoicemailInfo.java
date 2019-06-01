package com.ringcentral.definitions;


public class VoicemailInfo {
    /**
     * If 'True' then voicemails are allowed to be received
     */
    public Boolean enabled;
    /**
     * Recipient data
     */
    public RecipientInfo recipient;

    public VoicemailInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public VoicemailInfo recipient(RecipientInfo recipient) {
        this.recipient = recipient;
        return this;
    }

}
