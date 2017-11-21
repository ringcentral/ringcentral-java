package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MessageInfoResource
{
    //
    public String uri;
    public MessageInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public MessageInfoResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public CallerInfo[] to;
    public MessageInfoResource to(CallerInfo[] to) {
        this.to = to;
        return this;
    }
    //
    public CallerInfo from;
    public MessageInfoResource from(CallerInfo from) {
        this.from = from;
        return this;
    }
    //
    public String type;
    public MessageInfoResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public String creationTime;
    public MessageInfoResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    //
    public String readStatus;
    public MessageInfoResource readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }
    //
    public String priority;
    public MessageInfoResource priority(String priority) {
        this.priority = priority;
        return this;
    }
    //
    public MessageAttachmentInfo[] attachments;
    public MessageInfoResource attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
    //
    public String direction;
    public MessageInfoResource direction(String direction) {
        this.direction = direction;
        return this;
    }
    //
    public String availability;
    public MessageInfoResource availability(String availability) {
        this.availability = availability;
        return this;
    }
    //
    public String subject;
    public MessageInfoResource subject(String subject) {
        this.subject = subject;
        return this;
    }
    //
    public String messageStatus;
    public MessageInfoResource messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
    //
    public String faxResolution;
    public MessageInfoResource faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }
    //
    public Long faxPageCount;
    public MessageInfoResource faxPageCount(Long faxPageCount) {
        this.faxPageCount = faxPageCount;
        return this;
    }
    //
    public String deliveryErrorCode;
    public MessageInfoResource deliveryErrorCode(String deliveryErrorCode) {
        this.deliveryErrorCode = deliveryErrorCode;
        return this;
    }
    //
    public String smsDeliveryTime;
    public MessageInfoResource smsDeliveryTime(String smsDeliveryTime) {
        this.smsDeliveryTime = smsDeliveryTime;
        return this;
    }
    //
    public Long smsSendingAttemptsCount;
    public MessageInfoResource smsSendingAttemptsCount(Long smsSendingAttemptsCount) {
        this.smsSendingAttemptsCount = smsSendingAttemptsCount;
        return this;
    }
    //
    public Long conversationId;
    public MessageInfoResource conversationId(Long conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    //
    public ConversationResource conversation;
    public MessageInfoResource conversation(ConversationResource conversation) {
        this.conversation = conversation;
        return this;
    }
    //
    public String lastModifiedTime;
    public MessageInfoResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    //
    public Boolean pgToDepartment;
    public MessageInfoResource pgToDepartment(Boolean pgToDepartment) {
        this.pgToDepartment = pgToDepartment;
        return this;
    }
    //
    public String vmTranscriptionStatus;
    public MessageInfoResource vmTranscriptionStatus(String vmTranscriptionStatus) {
        this.vmTranscriptionStatus = vmTranscriptionStatus;
        return this;
    }
    //
    public String sourceFilePath;
    public MessageInfoResource sourceFilePath(String sourceFilePath) {
        this.sourceFilePath = sourceFilePath;
        return this;
    }
    //
    public Long coverIndex;
    public MessageInfoResource coverIndex(Long coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }
    //
    public String coverPageText;
    public MessageInfoResource coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }
}
