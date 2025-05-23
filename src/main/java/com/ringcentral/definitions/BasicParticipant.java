package com.ringcentral.definitions;


/**
 * Basic participant information
 */
public class BasicParticipant {
    /**
     * Required
     */
    public String id;
    /**
     *
     */
    public String accountId;
    /**
     *
     */
    public String extensionId;
    /**
     *
     */
    public String displayName;
    /**
     * Non empty if user joined by phone
     */
    public String callerId;

    public BasicParticipant id(String id) {
        this.id = id;
        return this;
    }

    public BasicParticipant accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public BasicParticipant extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public BasicParticipant displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public BasicParticipant callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
}
