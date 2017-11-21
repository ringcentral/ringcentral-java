package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AdminNoticeResource
{
    //
    public String subjectCode;
    public AdminNoticeResource subjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
        return this;
    }
    //
    public String message;
    public AdminNoticeResource message(String message) {
        this.message = message;
        return this;
    }
}
