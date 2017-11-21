package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReportingViewInfo
{
    // User-defined name of a 'View'. The maximum value is 255
    public String name;
    public ReportingViewInfo name(String name) {
        this.name = name;
        return this;
    }
    // List of pages, the max amount is 10
    public ReportingPagesInfo[] pages;
    public ReportingViewInfo pages(ReportingPagesInfo[] pages) {
        this.pages = pages;
        return this;
    }
    // List of schedules, the max amount is 5. Each 'View' may have several schedules for reporting. For example, customer may want to get daily and weekly reports with the same set of settings
    public ReportingSchedulesInfo[] schedules;
    public ReportingViewInfo schedules(ReportingSchedulesInfo[] schedules) {
        this.schedules = schedules;
        return this;
    }
}
