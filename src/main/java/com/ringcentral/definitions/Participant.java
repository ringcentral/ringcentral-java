package com.ringcentral.definitions;


/**
 * Participant information
 */
public class Participant {
    /**
     * Participant type
     * Required
     */
    public String type;
    /**
     * id
     * Required
     */
    public String id;
    /**
     * Account id
     */
    public String accountId;
    /**
     * Extension id
     */
    public String extensionId;
    /**
     * Display name
     */
    public String displayName;
    /**
     * Caller id
     */
    public String callerId;
    /**
     * Pass-thru parameter in join url
     */
    public String correlationId;

    public Participant type(String type) {
        this.type = type;
        return this;
    }

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
