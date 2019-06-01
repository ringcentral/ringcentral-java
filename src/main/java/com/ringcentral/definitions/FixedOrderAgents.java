package com.ringcentral.definitions;


public class FixedOrderAgents {
    /**
     *
     */
    public ExtensionInfo extension;
    /**
     * Ordinal of an agent (call queue member)
     */
    public Long index;

    public FixedOrderAgents extension(ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public FixedOrderAgents index(Long index) {
        this.index = index;
        return this;
    }

}
