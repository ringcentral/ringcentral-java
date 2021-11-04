package com.ringcentral.definitions;


public class CallsByResult {
    /**
     * Required
     * Format: int64
     */
    public Long completed;
    /**
     * Required
     * Format: int64
     */
    public Long abandoned;
    /**
     * Required
     * Format: int64
     */
    public Long voiceMail;
    /**
     * Required
     * Format: int64
     */
    public Long connected;

    public CallsByResult completed(Long completed) {
        this.completed = completed;
        return this;
    }

    public CallsByResult abandoned(Long abandoned) {
        this.abandoned = abandoned;
        return this;
    }

    public CallsByResult voiceMail(Long voiceMail) {
        this.voiceMail = voiceMail;
        return this;
    }

    public CallsByResult connected(Long connected) {
        this.connected = connected;
        return this;
    }
}
