package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class IVRMenuActionsInfo
{
    // Key. The following values are supported: numeric: '1' to '9' Star Hash NoInput
    public String input;
    public IVRMenuActionsInfo input(String input) {
        this.input = input;
        return this;
    }
    // Internal identifier of an answering rule
    public String action;
    public IVRMenuActionsInfo action(String action) {
        this.action = action;
        return this;
    }
    // For 'Connect' or 'Voicemail' actions only. Extension reference
    public IVRMenuExtensionInfo extension;
    public IVRMenuActionsInfo extension(IVRMenuExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
    // For 'Transfer' action only. PSTN number in E.164 format
    public String phoneNumber;
    public IVRMenuActionsInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
