package com.ringcentral.definitions;


public class CreateInternalTextMessageRequest {
    /**
     * Sender of a pager message.
     * Required
     */
    public PagerCallerInfoRequest from;
    /**
     * Internal identifier of a message this message replies to
     */
    public Long replyOn;
    /**
     * Text of a pager message. Max length is 1024 symbols (2-byte UTF-16 encoded). If a character is encoded in 4 bytes in UTF-16 it is treated as 2 characters, thus restricting the maximum message length to 512 symbols
     * Required
     */
    public String text;
    /**
     * Optional if replyOn parameter is specified. Receiver of a pager message.
     */
    public PagerCallerInfoRequest[] to;

    public CreateInternalTextMessageRequest from(PagerCallerInfoRequest from) {
        this.from = from;
        return this;
    }

    public CreateInternalTextMessageRequest replyOn(Long replyOn) {
        this.replyOn = replyOn;
        return this;
    }

    public CreateInternalTextMessageRequest text(String text) {
        this.text = text;
        return this;
    }

    public CreateInternalTextMessageRequest to(PagerCallerInfoRequest[] to) {
        this.to = to;
        return this;
    }

}
