package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SetReportingSettingsRequest
{
    // List of 'View' structures with a tuple of filter values, pages and schedules
    public ViewInfoReporting[] views;
    public SetReportingSettingsRequest views(ViewInfoReporting[] views) {
        this.views = views;
        return this;
    }
}
