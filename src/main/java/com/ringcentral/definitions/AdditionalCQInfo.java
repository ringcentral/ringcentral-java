package com.ringcentral.definitions;


    /**
* Additional call session information. Supported for Call Queues only
*/
public class AdditionalCQInfo
{
    /**
     * Call information to be displayed as &#039;Line 2&#039; for a call queue call session
     * Enum: PhoneNumberLabel, PhoneNumber, QueueExtension, QueueName, CallerIdName, CallerIdNumber, None
     */
    public String type;
    public AdditionalCQInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Call information value
     */
    public String value;
    public AdditionalCQInfo value(String value)
    {
        this.value = value;
        return this;
    }
}