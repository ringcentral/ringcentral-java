package com.ringcentral.definitions;

/** Request body for operation mthSendMessage */
public class MthSendMessageRequest {
    /** Required */
    public NewThreadMessageRequest metadata;

    public MthSendMessageRequest metadata(NewThreadMessageRequest metadata) {
        this.metadata = metadata;
        return this;
    }

    /** Required */
    public Attachment[] attachments;

    public MthSendMessageRequest attachments(Attachment[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
