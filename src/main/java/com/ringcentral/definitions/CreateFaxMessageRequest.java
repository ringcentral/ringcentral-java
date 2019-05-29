package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreateFaxMessageRequest
{
    // Recipient information. Phone number property is mandatory. Optional for resend fax request
    public MessageStoreCallerInfoRequest[] to;
    public CreateFaxMessageRequest to(MessageStoreCallerInfoRequest[] to) {
        this.to = to;
        return this;
    }
    // Fax resolution
    public String resolution;
    public CreateFaxMessageRequest faxResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    // The datetime to send fax at, in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. If time is not specified, the fax will be send immediately
    public String sendTime;
    public CreateFaxMessageRequest sendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    // Optional. Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
    public String coverPageText;
    public CreateFaxMessageRequest coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }
    // Internal identifier of the original fax message which needs to be resent. Mandatory for resend fax request
    public String originalMessageId;
    public CreateFaxMessageRequest originalMessageId(String originalMessageId) {
        this.originalMessageId = originalMessageId;
        return this;
    }
}
