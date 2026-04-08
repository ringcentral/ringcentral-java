package com.ringcentral.definitions;


public class FixedOrderAgents
{
    /**
     */
    public FixedOrderAgentsExtensionInfo extension;
    public FixedOrderAgents extension(FixedOrderAgentsExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Ordinal of an agent (call queue member)
     * Format: int32
     */
    public Long index;
    public FixedOrderAgents index(Long index)
    {
        this.index = index;
        return this;
    }
}