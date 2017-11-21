package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AnsweringForwardingRuleResource
{
    //
    public Long index;
    public AnsweringForwardingRuleResource index(Long index) {
        this.index = index;
        return this;
    }
    //
    public Long ringCount;
    public AnsweringForwardingRuleResource ringCount(Long ringCount) {
        this.ringCount = ringCount;
        return this;
    }
    //
    public ForwardingNumberResource[] forwardingNumbers;
    public AnsweringForwardingRuleResource forwardingNumbers(ForwardingNumberResource[] forwardingNumbers) {
        this.forwardingNumbers = forwardingNumbers;
        return this;
    }
}
