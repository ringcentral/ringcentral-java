package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SpecialNumberInfo
{
    // Service phone number in N11 code format
    public String phoneNumber;
    public SpecialNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Description of a special number
    public String description;
    public SpecialNumberInfo description(String description) {
        this.description = description;
        return this;
    }
    // Information on options allowed/disallowed for the special number
    public SpecialNumberFeaturesInfo features;
    public SpecialNumberInfo features(SpecialNumberFeaturesInfo features) {
        this.features = features;
        return this;
    }
}
