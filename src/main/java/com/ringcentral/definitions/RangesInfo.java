package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RangesInfo
{
    // Date and time in format YYYY-MM-DD hh:mm
    public String from;
    public RangesInfo from(String from) {
        this.from = from;
        return this;
    }
    // Date and time in format YYYY-MM-DD hh:mm
    public String to;
    public RangesInfo to(String to) {
        this.to = to;
        return this;
    }
}
