package com.ringcentral.definitions;

/** Basic participant information */
public class BasicParticipant {
    /** Required */
    public String id;

    public BasicParticipant id(String id) {
        this.id = id;
        return this;
    }

    /** */
    public String accountId;

    public BasicParticipant accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** */
    public String extensionId;

    public BasicParticipant extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /** */
    public String displayName;

    public BasicParticipant displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** Non empty if user joined by phone */
    public String callerId;

    public BasicParticipant callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
}
