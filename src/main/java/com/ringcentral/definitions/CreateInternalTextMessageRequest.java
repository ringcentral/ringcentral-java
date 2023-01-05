package com.ringcentral.definitions;


public class CreateInternalTextMessageRequest
{
    /**
     */
    public PagerCallerInfoRequest from;
    public CreateInternalTextMessageRequest from(PagerCallerInfoRequest from)
    {
        this.from = from;
        return this;
    }

    /**
     * Internal identifier of a message this message replies to
     */
    public Long replyOn;
    public CreateInternalTextMessageRequest replyOn(Long replyOn)
    {
        this.replyOn = replyOn;
        return this;
    }

    /**
     * Text of a pager message. Max length is 1024 symbols (2-byte UTF-16 encoded). If a character is encoded in 4 bytes in UTF-16 it is treated as 2 characters, thus restricting the maximum message length to 512 symbols
     * Required
     * Example: hello world
     */
    public String text;
    public CreateInternalTextMessageRequest text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * Optional if replyOn parameter is specified. Receiver of a pager message.
     */
    public PagerCallerInfoRequest[] to;
    public CreateInternalTextMessageRequest to(PagerCallerInfoRequest[] to)
    {
        this.to = to;
        return this;
    }
}