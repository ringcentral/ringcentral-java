package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TimeInterval
{
    // Time in format hh:mm
    public String from;
    public TimeInterval from(String from) {
        this.from = from;
        return this;
    }
    // Time in format hh:mm
    public String to;
    public TimeInterval to(String to) {
        this.to = to;
        return this;
    }
}
