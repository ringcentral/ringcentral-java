package com.ringcentral.definitions;


/**
 * Participant information
 */
public class Participant {
    /**
     * id
     */
    public String id;
    /**
     * account id
     */
    public String accountId;
    /**
     * extension id
     */
    public String extensionId;
    /**
     * displayName
     */
    public String displayName;
    /**
     * caller id
     */
    public String callerId;
    /**
     * pass-thru parameter in join url
     */
    public String correlationId;

    public Participant id(String id) {
        this.id = id;
        return this;
    }

    public Participant accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public Participant extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public Participant displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public Participant callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }

    public Participant correlationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
}
