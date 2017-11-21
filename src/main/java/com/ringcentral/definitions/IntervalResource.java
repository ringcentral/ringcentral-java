package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class IntervalResource
{
    //
    public String from;
    public IntervalResource from(String from) {
        this.from = from;
        return this;
    }
    //
    public String to;
    public IntervalResource to(String to) {
        this.to = to;
        return this;
    }
}
