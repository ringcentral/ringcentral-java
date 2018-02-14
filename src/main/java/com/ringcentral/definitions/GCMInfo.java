package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GCMInfo
{
    // Notification priority, if the value is 'high' then notification is turned on even if the application is in background
    public String priority;
    public GCMInfo priority(String priority) {
        this.priority = priority;
        return this;
    }
    // Notification lifetime value in seconds, the default value is 30 seconds
    public Long time_to_live;
    public GCMInfo time_to_live(Long time_to_live) {
        this.time_to_live = time_to_live;
        return this;
    }
    // GCM data
    public GCMData data;
    public GCMInfo data(GCMData data) {
        this.data = data;
        return this;
    }
}
