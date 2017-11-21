package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReportingSettings
{
    // List of 'View' structures with a tuple of filter values, pages and schedules
    public ReportingViewInfo[] views;
    public ReportingSettings views(ReportingViewInfo[] views) {
        this.views = views;
        return this;
    }
}
