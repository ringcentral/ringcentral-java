package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CfaSchedule
{
    //
    public String scheduleId;
    public CfaSchedule scheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    //
    public CfaRecurrence recurrence;
    public CfaSchedule recurrence(CfaRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    //
    public String viewType;
    public CfaSchedule viewType(String viewType) {
        this.viewType = viewType;
        return this;
    }
    //
    public CfaAttachments attachments;
    public CfaSchedule attachments(CfaAttachments attachments) {
        this.attachments = attachments;
        return this;
    }
    //
    public String[] recipients;
    public CfaSchedule recipients(String[] recipients) {
        this.recipients = recipients;
        return this;
    }
    //
    public String[] pages;
    public CfaSchedule pages(String[] pages) {
        this.pages = pages;
        return this;
    }
}
