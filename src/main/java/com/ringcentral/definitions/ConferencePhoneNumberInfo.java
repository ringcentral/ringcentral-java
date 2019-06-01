package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class ConferencePhoneNumberInfo {
    /**
     * Dial-in phone number to connect to a conference
     */
    public String phoneNumber;
    /**
     * 'True' if the number is default for the conference. Default conference number is a domestic number that can be set by user (otherwise it is set by the system). Only one default number per country is allowed
     */
    @JSONField(name = "default")
    public Boolean _default;

    public ConferencePhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ConferencePhoneNumberInfo _default(Boolean _default) {
        this._default = _default;
        return this;
    }

}
