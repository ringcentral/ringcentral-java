package com.ringcentral.definitions;

public class NewThreadMessageRequest {
    /**
     * Internal identifier of a message thread. If not specified, the thread will be assigned
     * automatically based on phone numbers. If provided `threadId` is invalid (e.g. does not exist,
     * already resolved, etc.), the API returns an error.
     */
    public String threadId;

    public NewThreadMessageRequest threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Required */
    public MessagePhoneParty from;

    public NewThreadMessageRequest from(MessagePhoneParty from) {
        this.from = from;
        return this;
    }

    /** Required */
    public MessagePhoneParty[] to;

    public NewThreadMessageRequest to(MessagePhoneParty[] to) {
        this.to = to;
        return this;
    }

    /** Message or note text Required Example: Hello, how are you doing today? */
    public String text;

    public NewThreadMessageRequest text(String text) {
        this.text = text;
        return this;
    }
}
