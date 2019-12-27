package com.ringcentral.definitions;


public class CallPartyReply {
    /**
     * Text to reply
     */
    public String replyWithText;
    /**
     *
     */
    public ReplyWithPattern replyWithPattern;

    public CallPartyReply replyWithText(String replyWithText) {
        this.replyWithText = replyWithText;
        return this;
    }

    public CallPartyReply replyWithPattern(ReplyWithPattern replyWithPattern) {
        this.replyWithPattern = replyWithPattern;
        return this;
    }

}
