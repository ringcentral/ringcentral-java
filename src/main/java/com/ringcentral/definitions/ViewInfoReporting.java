package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ViewInfoReporting
{
    // User-defined name of a 'View'. The maximum value is 255
    public String name;
    public ViewInfoReporting name(String name) {
        this.name = name;
        return this;
    }
    // List of pages, the max amount is 10
    public PagesInfoReporting[] pages;
    public ViewInfoReporting pages(PagesInfoReporting[] pages) {
        this.pages = pages;
        return this;
    }
    // List of schedules, the max amount is 5. Each 'View' may have several schedules for reporting. For example, customer may want to get daily and weekly reports with the same set of settings
    public SchedulesInfoReporting[] schedules;
    public ViewInfoReporting schedules(SchedulesInfoReporting[] schedules) {
        this.schedules = schedules;
        return this;
    }
}
