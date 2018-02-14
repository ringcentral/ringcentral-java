package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RCVParticipantsInfo
{
    // Participant account
    public String account;
    public RCVParticipantsInfo account(String account) {
        this.account = account;
        return this;
    }
    // Participant extension
    public String extension;
    public RCVParticipantsInfo extension(String extension) {
        this.extension = extension;
        return this;
    }
    // Participant name
    public String name;
    public RCVParticipantsInfo name(String name) {
        this.name = name;
        return this;
    }
    // Participant profile image
    public String img;
    public RCVParticipantsInfo img(String img) {
        this.img = img;
        return this;
    }
}
