package com.ringcentral.definitions;


    /**
* Sender information
*/
public class MessageSenderInfo
{
    /**
     */
    public String extensionNumber;
    public MessageSenderInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     */
    public String extensionId;
    public MessageSenderInfo extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     */
    public String name;
    public MessageSenderInfo name(String name)
    {
        this.name = name;
        return this;
    }
}