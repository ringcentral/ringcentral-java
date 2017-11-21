package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReportingSchedulesInfo
{
    // Unique schedule identifier
    public String scheduleId;
    public ReportingSchedulesInfo scheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    // Recurrence pattern of a schedule
    public ReportingRecurrenceInfo[] recurrence;
    public ReportingSchedulesInfo recurrence(ReportingRecurrenceInfo[] recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    // Type of report. Detailed reports include tables with data. Simple reports only include charts
    public String viewType;
    public ReportingSchedulesInfo viewType(String viewType) {
        this.viewType = viewType;
        return this;
    }
    // Set of optional attachments. Basically, every report email is in HTML format. Optionally, it can contain PDF or CSV files
    public ReportingAttachmentInfo[] attachments;
    public ReportingSchedulesInfo attachments(ReportingAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
    // List of pages to include to the report. If empty, all pages are included. Otherwise, only specified pages are included. API doesn't check validity of page names. Client application is responsible to do that
    public String[] pages;
    public ReportingSchedulesInfo pages(String[] pages) {
        this.pages = pages;
        return this;
    }
    // List of emails to which to send rendered reports
    public String[] recipients;
    public ReportingSchedulesInfo recipients(String[] recipients) {
        this.recipients = recipients;
        return this;
    }
}
