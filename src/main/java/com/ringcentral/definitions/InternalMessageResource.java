package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class InternalMessageResource
{
    //
    public CallerInfo[] to;
    public InternalMessageResource to(CallerInfo[] to) {
        this.to = to;
        return this;
    }
    //
    public CallerInfo from;
    public InternalMessageResource from(CallerInfo from) {
        this.from = from;
        return this;
    }
    //
    public String text;
    public InternalMessageResource text(String text) {
        this.text = text;
        return this;
    }
    //
    public Long replyOn;
    public InternalMessageResource replyOn(Long replyOn) {
        this.replyOn = replyOn;
        return this;
    }
}
