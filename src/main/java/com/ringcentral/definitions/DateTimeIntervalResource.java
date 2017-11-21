package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DateTimeIntervalResource
{
    //
    public String from;
    public DateTimeIntervalResource from(String from) {
        this.from = from;
        return this;
    }
    //
    public String to;
    public DateTimeIntervalResource to(String to) {
        this.to = to;
        return this;
    }
}
