package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SpecialNumberFeaturesInfo
{
    // VoIP call
    public OptionInfo voip;
    public SpecialNumberFeaturesInfo voip(OptionInfo voip) {
        this.voip = voip;
        return this;
    }
    // RingOut call
    public OptionInfo ringOut;
    public SpecialNumberFeaturesInfo ringOut(OptionInfo ringOut) {
        this.ringOut = ringOut;
        return this;
    }
    // Outgoing SMS
    public OptionInfo sms;
    public SpecialNumberFeaturesInfo sms(OptionInfo sms) {
        this.sms = sms;
        return this;
    }
    // Outgoing Fax
    public OptionInfo faxOut;
    public SpecialNumberFeaturesInfo faxOut(OptionInfo faxOut) {
        this.faxOut = faxOut;
        return this;
    }
}
