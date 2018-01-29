package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FixedOrderAgents
{
    //
    public ExtensionInfo extension;
    public FixedOrderAgents extension(ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
    // Ordinal of an agent (call queue member)
    public Long index;
    public FixedOrderAgents index(Long index) {
        this.index = index;
        return this;
    }
}
