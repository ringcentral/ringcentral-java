package com.ringcentral.definitions;


/**
 * Basic participant information
 */
public class Participant {
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
    /**
     * Participant type
     * Required
     */
    public String type;
    /**
     * Pass-thru parameter in join url
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

    public Participant type(String type) {
        this.type = type;
        return this;
    }

    public Participant correlationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }
}
