package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;

public class ConferencingInfo_PhoneNumberInfo {
    // Information on a home country of a conference phone number
    public ConferencingInfo_PhoneNumberInfo_CountryInfo country;
    // 'True' if the number is default for the conference. Default conference number is a domestic number that can be set by user (otherwise it is set by the system). Only one default number per country is allowed
    @JSONField(alternateNames = {"default"})
    public Boolean _default;
    // 'True' if the greeting message is played on this number
    public Boolean hasGreeting;
    // Location (city, region, state) of a conference phone number
    public String location;
    // Dial-in phone number to connect to a conference
    public String phoneNumber;
}
