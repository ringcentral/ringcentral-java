package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ScheduleResource
{
    //
    public DateTimeIntervalResource[] ranges;
    public ScheduleResource ranges(DateTimeIntervalResource[] ranges) {
        this.ranges = ranges;
        return this;
    }
    //
    public String ref;
    public ScheduleResource ref(String ref) {
        this.ref = ref;
        return this;
    }
}
