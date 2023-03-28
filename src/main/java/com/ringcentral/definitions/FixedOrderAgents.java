package com.ringcentral.definitions;


public class FixedOrderAgents {
    /**
     *
     */
    public FixedOrderAgentsExtensionInfo extension;
    /**
     * Ordinal of an agent (call queue member)
     * Format: int32
     */
    public Long index;

    public FixedOrderAgents extension(FixedOrderAgentsExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public FixedOrderAgents index(Long index) {
        this.index = index;
        return this;
    }
}
