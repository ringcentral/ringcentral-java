package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TranscriptionResult
{
    //
    public String STTId;
    public TranscriptionResult STTId(String STTId) {
        this.STTId = STTId;
        return this;
    }
    //
    public String ExternalId;
    public TranscriptionResult ExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
        return this;
    }
    //
    public Long Status;
    public TranscriptionResult Status(Long Status) {
        this.Status = Status;
        return this;
    }
    //
    public String Mailbox;
    public TranscriptionResult Mailbox(String Mailbox) {
        this.Mailbox = Mailbox;
        return this;
    }
    //
    public String TranscriptionText;
    public TranscriptionResult TranscriptionText(String TranscriptionText) {
        this.TranscriptionText = TranscriptionText;
        return this;
    }
    //
    public String Message;
    public TranscriptionResult Message(String Message) {
        this.Message = Message;
        return this;
    }
    //
    public String MessageLength;
    public TranscriptionResult MessageLength(String MessageLength) {
        this.MessageLength = MessageLength;
        return this;
    }
    //
    public String Confidence;
    public TranscriptionResult Confidence(String Confidence) {
        this.Confidence = Confidence;
        return this;
    }
}
