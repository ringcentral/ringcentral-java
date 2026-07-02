package com.ringcentral.definitions;

public class CallPartyReply {
    /** Text to reply Required */
    public String replyWithText;

    public CallPartyReply replyWithText(String replyWithText) {
        this.replyWithText = replyWithText;
        return this;
    }

    /** Required */
    public ReplyWithPattern replyWithPattern;

    public CallPartyReply replyWithPattern(ReplyWithPattern replyWithPattern) {
        this.replyWithPattern = replyWithPattern;
        return this;
    }
}
