package com.ringcentral.definitions;


public class CallQueueMemberInfo
{
    /**
     * Link to a call queue member
     * Format: uri
     */
    public String uri;
    public CallQueueMemberInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a call queue member
     * Format: int64
     */
    public Long id;
    public CallQueueMemberInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Extension number of a call queue member
     */
    public String extensionNumber;
    public CallQueueMemberInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}