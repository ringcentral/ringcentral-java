package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreatePagerMessageRequest
{
    // Sender of a pager message. The extensionNumber property must be filled
    public MessageStoreCallerInfoRequest from;
    public CreatePagerMessageRequest from(MessageStoreCallerInfoRequest from) {
        this.from = from;
        return this;
    }
    // Internal identifier of a message this message replies to
    public Long replyOn;
    public CreatePagerMessageRequest replyOn(Long replyOn) {
        this.replyOn = replyOn;
        return this;
    }
    // Text of a pager message. Max length is 1024 symbols (2-byte UTF-16 encoded). If a character is encoded in 4 bytes in UTF-16 it is treated as 2 characters, thus restricting the maximum message length to 512 symbols
    public String text;
    public CreatePagerMessageRequest text(String text) {
        this.text = text;
        return this;
    }
    // Optional if replyOn parameter is specified. Receiver of a pager message. The extensionNumber property must be filled
    public MessageStoreCallerInfoRequest[] to;
    public CreatePagerMessageRequest to(MessageStoreCallerInfoRequest[] to) {
        this.to = to;
        return this;
    }
}
