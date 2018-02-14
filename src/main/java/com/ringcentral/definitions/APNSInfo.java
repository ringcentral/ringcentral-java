package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class APNSInfo
{
    // Notification priority data
    public APSInfo aps;
    public APNSInfo aps(APSInfo aps) {
        this.aps = aps;
        return this;
    }
}
