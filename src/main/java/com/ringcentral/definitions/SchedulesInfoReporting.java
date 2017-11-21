package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SchedulesInfoReporting
{
    // Unique schedule identifier
    public String scheduleId;
    public SchedulesInfoReporting scheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    // Recurrence pattern of a schedule
    public RecurrenceInfoReporting[] recurrence;
    public SchedulesInfoReporting recurrence(RecurrenceInfoReporting[] recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    // Type of report. Detailed reports include tables with data. Simple reports only include charts
    public String viewType;
    public SchedulesInfoReporting viewType(String viewType) {
        this.viewType = viewType;
        return this;
    }
    // Set of optional attachments. Basically, every report email is in HTML format. Optionally, it can contain PDF or CSV files
    public AttachmentInfoReporting[] attachments;
    public SchedulesInfoReporting attachments(AttachmentInfoReporting[] attachments) {
        this.attachments = attachments;
        return this;
    }
    // List of pages to include to the report. If empty, all pages are included. Otherwise, only specified pages are included. API doesn't check validity of page names. Client application is responsible to do that
    public String[] pages;
    public SchedulesInfoReporting pages(String[] pages) {
        this.pages = pages;
        return this;
    }
    // List of emails to which to send rendered reports
    public String[] recipients;
    public SchedulesInfoReporting recipients(String[] recipients) {
        this.recipients = recipients;
        return this;
    }
}
