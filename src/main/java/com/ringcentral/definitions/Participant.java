package com.ringcentral.definitions;


    /**
* Basic participant information
*/
public class Participant
{
    /**
     * Required
     */
    public String id;
    public Participant id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String accountId;
    public Participant accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     */
    public String extensionId;
    public Participant extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     */
    public String displayName;
    public Participant displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Non empty if user joined by phone
     */
    public String callerId;
    public Participant callerId(String callerId)
    {
        this.callerId = callerId;
        return this;
    }

    /**
     * Participant type
     * Required
     */
    public String type;
    public Participant type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Pass-thru parameter in join url
     */
    public String correlationId;
    public Participant correlationId(String correlationId)
    {
        this.correlationId = correlationId;
        return this;
    }
}