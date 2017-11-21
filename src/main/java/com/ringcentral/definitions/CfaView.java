package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CfaView
{
    //
    public String name;
    public CfaView name(String name) {
        this.name = name;
        return this;
    }
    //
    public CfaSchedule[] schedules;
    public CfaView schedules(CfaSchedule[] schedules) {
        this.schedules = schedules;
        return this;
    }
}
